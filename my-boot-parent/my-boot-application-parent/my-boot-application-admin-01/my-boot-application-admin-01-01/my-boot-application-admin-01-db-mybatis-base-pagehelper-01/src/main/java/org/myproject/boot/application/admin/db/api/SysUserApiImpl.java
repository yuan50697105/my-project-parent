package org.myproject.boot.application.admin.db.api;

import lombok.AllArgsConstructor;
import org.myproject.boot.application.admin.api.BSysUserApi;
import org.myproject.boot.application.admin.db.converter.TbConverter;
import org.myproject.boot.application.admin.db.pojo.TbSysUserQuery;
import org.myproject.boot.application.admin.db.service.TbSysRoleService;
import org.myproject.boot.application.admin.db.service.TbSysUserRoleService;
import org.myproject.boot.application.admin.db.service.TbSysUserService;
import org.myproject.boot.application.admin.pojo.SysUser;
import org.myproject.boot.application.admin.pojo.SysUserQuery;
import org.myproject.boot.application.admin.pojo.SysUserVo;
import org.myproject.boot.mybatis.commons.pojo.IPage;
import org.myproject.boot.mybatis.pojo.PageResult;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-11 19:36
 */
@Service
@AllArgsConstructor
@Transactional
public class SysUserApiImpl implements BSysUserApi {
    private final TbConverter tbConverter;
    private final TbSysUserService sysUserService;
    private final TbSysUserRoleService sysUserRoleService;
    private final TbSysRoleService sysRoleService;

    @Override
    public IPage<SysUser> selectByQuery(SysUserQuery query, int page, int size) {
        TbSysUserQuery sysUserQuery = tbConverter.sysUser(query);
        return new PageResult<>(tbConverter.sysUser(sysUserService.selectByQuery(sysUserQuery, page, size)));
    }

    @Override
    public List<SysUser> selectByQuery(SysUserQuery query) {
        TbSysUserQuery sysUserQuery = tbConverter.sysUser(query);
        return tbConverter.sysUser(sysUserService.selectByQuery(sysUserQuery));
    }

    @Override
    public SysUser get(Long id) {
        return tbConverter.sysUser(sysUserService.selectByPrimaryKey(id));
    }

    @Override
    public void insert(SysUserVo sysUser) {
        sysUserService.insert(tbConverter.sysUser(sysUser));
    }

    @Override
    public void update(SysUserVo sysUser) {
        sysUserService.updateByPrimaryKeySelective(tbConverter.sysUser(sysUser));
    }

    @Override
    public void delete(List<Long> ids) {
        ids.forEach(sysUserService::deleteByPrimaryKey);
    }

    @Override
    public void delete(Long id) {
        sysUserService.deleteByPrimaryKey(id);
    }
}