package org.myproject.boot.application.admin.db.service.business.impl;

import lombok.AllArgsConstructor;
import org.myproject.boot.application.admin.db.pojo.SysUser;
import org.myproject.boot.application.admin.db.pojo.SysUserExample;
import org.myproject.boot.application.admin.db.pojo.SysUserQuery;
import org.myproject.boot.application.admin.db.pojo.SysUserVo;
import org.myproject.boot.application.admin.db.service.base.SysUserService;
import org.myproject.boot.application.admin.db.service.business.BSysUserService;
import org.myproject.boot.mybatis.pojo.PageResult;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: my-boot-application-admin-01-02
 * @description:
 * @author: yuane
 * @create: 2020-07-05 17:00
 */
@Service
@Transactional
@AllArgsConstructor
public class BSysUserServiceImpl implements BSysUserService {
    private final SysUserService sysUserService;

    @Override
    public PageResult<SysUser> selectByQuery(SysUserQuery query, int page, int size) {
        return new PageResult<>(sysUserService.selectByQuery(query, page, size));
    }

    @Override
    public List<SysUser> selectByQuery(SysUserQuery query) {
        return sysUserService.selectByQuery(query);
    }

    @Override
    public SysUser selectById(Long id) {
        return sysUserService.selectByPrimaryKey(id);
    }

    @Override
    public void insert(SysUserVo sysUserVo) {
        sysUserService.insert(convert(sysUserVo));
    }

    @Override
    public void update(SysUserVo sysUserVo) {
        sysUserService.updateByPrimaryKeySelective(convert(sysUserVo));
    }

    @Override
    public void delete(List<Long> ids) {
        SysUserExample example = new SysUserExample();
        example.or().andIdIn(ids);
        sysUserService.deleteByExample(example);
    }

    @Override
    public void delete(Long id) {
        sysUserService.deleteByPrimaryKey(id);
    }

    private SysUser convert(SysUserVo sysUserVo) {
        SysUser sysUser = new SysUser();
        sysUser.setId(sysUserVo.getId());
        sysUser.setUsername(sysUserVo.getUsername());
        sysUser.setName(sysUserVo.getName());
        sysUser.setPassword(sysUserVo.getPassword());
        sysUser.setEnabled(sysUserVo.getEnabled());
        sysUser.setId(sysUserVo.getId());
        return sysUser;
    }
}