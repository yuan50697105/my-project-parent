package org.myproject.boot.application.admin.db.service.business.impl;

import lombok.AllArgsConstructor;
import org.myproject.boot.application.admin.db.pojo.SysRole;
import org.myproject.boot.application.admin.db.pojo.SysRoleQuery;
import org.myproject.boot.application.admin.db.pojo.SysRoleVo;
import org.myproject.boot.application.admin.db.service.business.BSysRoleService;
import org.myproject.boot.application.admin.db.service.table.SysRoleService;
import org.myproject.boot.mybatis.pojo.PageResult;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: my-boot-application-admin-01-07
 * @description:
 * @author: yuane
 * @create: 2020-07-06 21:49
 */
@Service
@AllArgsConstructor
@Transactional
public class BSysRoleServiceImpl implements BSysRoleService {
    private final SysRoleService sysRoleService;

    @Override
    public PageResult<SysRole> selectByQuery(SysRoleQuery query, int page, int size) {
        return new PageResult<SysRole>(sysRoleService.selectByQuery(query, page, size));
    }

    @Override
    public List<SysRole> selectByQuery(SysRoleQuery query) {
        return sysRoleService.selectByQuery(query);
    }

    @Override
    public SysRole selectById(Long id) {
        return sysRoleService.getById(id);
    }

    @Override
    public void save(SysRoleVo sysUserVo) {
        sysRoleService.save(convert(sysUserVo));
    }

    @Override
    public void update(SysRoleVo sysUserVo) {
        sysRoleService.updateById(convert(sysUserVo));
    }

    @Override
    public void delete(List<Long> ids) {
        sysRoleService.removeByIds(ids);
    }

    @Override
    public void delete(Long id) {
        sysRoleService.removeById(id);
    }

    private SysRole convert(SysRoleVo sysUserVo) {
        SysRole sysRole = new SysRole();
        sysRole.setName(sysUserVo.getName());
        sysRole.setDescription(sysUserVo.getDescription());
        sysRole.setEnabled(sysUserVo.getEnabled());
        sysRole.setId(sysUserVo.getId());
        return sysRole;
    }
}
