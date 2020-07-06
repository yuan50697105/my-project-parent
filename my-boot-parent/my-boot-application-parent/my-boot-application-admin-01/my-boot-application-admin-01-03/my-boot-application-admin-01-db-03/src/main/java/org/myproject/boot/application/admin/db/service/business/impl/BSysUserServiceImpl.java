package org.myproject.boot.application.admin.db.service.business.impl;

import lombok.AllArgsConstructor;
import org.myproject.boot.application.admin.db.pojo.SysUser;
import org.myproject.boot.application.admin.db.pojo.SysUserQuery;
import org.myproject.boot.application.admin.db.pojo.SysUserVo;
import org.myproject.boot.application.admin.db.service.table.SysUserService;
import org.myproject.boot.application.admin.db.service.business.BSysUserService;
import org.myproject.boot.mybatis.pojo.PageResult;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: my-boot-application-admin-01-03
 * @description:
 * @author: yuane
 * @create: 2020-07-05 22:44
 */
@Service
@AllArgsConstructor
@Transactional
public class BSysUserServiceImpl implements BSysUserService {
    private final SysUserService sysUserService;

    @Override
    public PageResult<SysUser> selectByQuery(SysUserQuery query, int page, int size) {
        return new PageResult<SysUser>(sysUserService.selectByQuery(query, page, size));
    }

    @Override
    public List<SysUser> selectByQuery(SysUserQuery query) {
        return sysUserService.selectByQuery(query);
    }

    @Override
    public SysUser selectById(Long id) {
        return sysUserService.getById(id);
    }

    @Override
    public void save(SysUserVo sysUserVo) {
        sysUserService.save(createEntity(sysUserVo));
    }

    @Override
    public void update(SysUserVo sysUserVo) {
        sysUserService.updateById(createEntity(sysUserVo));
    }

    @Override
    public void delete(List<Long> ids) {
        sysUserService.removeByIds(ids);
    }

    @Override
    public void delete(Long id) {
        sysUserService.removeById(id);
    }

    private SysUser createEntity(SysUserVo sysUserVo) {
        SysUser sysUser = new SysUser();
        sysUser.setUsername(sysUserVo.getUsername());
        sysUser.setName(sysUserVo.getName());
        sysUser.setPassword(sysUserVo.getPassword());
        sysUser.setEnabled(sysUserVo.getEnabled());
        sysUser.setId(sysUserVo.getId());
        return sysUser;
    }
}