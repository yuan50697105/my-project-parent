package org.myproject.boot.application.admin.service.api;


import com.github.pagehelper.PageInfo;
import lombok.AllArgsConstructor;
import org.myproject.boot.application.admin.db.converter.TbConverter;
import org.myproject.boot.application.admin.db.pojo.TbSysRole;
import org.myproject.boot.application.admin.db.pojo.TbSysRoleQuery;
import org.myproject.boot.application.admin.db.service.TbSysRoleService;
import org.myproject.boot.application.admin.service.pojo.SysRole;
import org.myproject.boot.application.admin.service.pojo.SysRoleQuery;
import org.myproject.boot.application.admin.service.pojo.SysRoleVo;
import org.myproject.boot.mybatis.commons.pojo.IPage;
import org.myproject.boot.mybatis.pojo.PageResult;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: my-boot-application-admin-01-01
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
    public IPage<SysRole> selectByQuery(SysRoleQuery query, int page, int size) {
        TbSysRoleQuery sysRoleQuery = converter.sysRole(query);
        PageInfo<TbSysRole> pageInfo = sysRoleService.selectByQuery(sysRoleQuery, page, size);
        return new PageResult<>(converter.sysRole(pageInfo));
    }

    @Override
    public List<SysRole> selectByQuery(SysRoleQuery query) {
        TbSysRoleQuery sysRoleQuery = converter.sysRole(query);
        return converter.sysRole(sysRoleService.selectByQuery(sysRoleQuery));
    }

    @Override
    public SysRole get(Long id) {
        TbSysRole sysRole = sysRoleService.getById(id);
        return converter.sysRole(sysRole);
    }

    @Override
    public void save(SysRoleVo sysRoleVo) {
        sysRoleService.save(converter.sysUser(sysRoleVo));
    }

    @Override
    public void update(SysRoleVo sysRoleVo) {
        sysRoleService.updateById(converter.sysUser(sysRoleVo));
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
