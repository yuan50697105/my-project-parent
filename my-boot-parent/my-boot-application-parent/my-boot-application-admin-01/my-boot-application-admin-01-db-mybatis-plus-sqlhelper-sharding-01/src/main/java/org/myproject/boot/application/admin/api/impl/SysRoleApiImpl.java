package org.myproject.boot.application.admin.api.impl;


import com.github.pagehelper.PageInfo;
import lombok.AllArgsConstructor;
import org.myproject.boot.application.admin.api.converter.TbConverter;
import org.myproject.boot.application.admin.api.pojo.BSysRole;
import org.myproject.boot.application.admin.api.pojo.BSysRoleQuery;
import org.myproject.boot.application.admin.api.pojo.BSysRoleVo;
import org.myproject.boot.application.admin.db.pojo.TbSysRole;
import org.myproject.boot.application.admin.db.pojo.TbSysRoleQuery;
import org.myproject.boot.application.admin.db.service.TbSysRoleService;
import org.myproject.boot.mybatis.commons.pojo.IPage;
import org.myproject.boot.mybatis.pojo.PageResult;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: my-boot-application-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-07-04 23:35
 */
@Service
@AllArgsConstructor
@Transactional
public class SysRoleApiImpl implements BSysRoleApi {
    private final TbConverter converter;
    private final TbSysRoleService sysRoleService;

    @Override
    public IPage<BSysRole> selectByQuery(BSysRoleQuery query, int page, int size) {
        TbSysRoleQuery sysRoleQuery = converter.sysRole(query);
        PageInfo<TbSysRole> pageInfo = sysRoleService.selectByQuery(sysRoleQuery, page, size);
        return new PageResult<>(converter.sysRole(pageInfo));
    }

    @Override
    public List<BSysRole> selectByQuery(BSysRoleQuery query) {
        TbSysRoleQuery sysRoleQuery = converter.sysRole(query);
        return converter.sysRole(sysRoleService.selectByQuery(sysRoleQuery));
    }

    @Override
    public BSysRole get(Long id) {
        TbSysRole sysRole = sysRoleService.getById(id);
        return converter.sysRole(sysRole);
    }

    @Override
    public void save(BSysRoleVo BSysRoleVo) {
        sysRoleService.save(converter.sysUser(BSysRoleVo));
    }

    @Override
    public void update(BSysRoleVo BSysRoleVo) {
        sysRoleService.updateById(converter.sysUser(BSysRoleVo));
    }

    @Override
    public void delete(List<Long> ids) {
        sysRoleService.removeByIds(ids);
    }

    @Override
    public void delete(Long id) {
        sysRoleService.removeById(id);
    }
}
