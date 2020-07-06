package org.myproject.boot.application.admin.db.service.business.impl;

import lombok.AllArgsConstructor;
import org.myproject.boot.application.admin.db.service.table.SysUserService;
import org.myproject.boot.application.admin.db.pojo.SysUser;
import org.myproject.boot.application.admin.db.pojo.SysUserQuery;
import org.myproject.boot.application.admin.db.pojo.SysUserVo;
import org.myproject.boot.application.admin.db.service.business.BSysUserService;
import org.myproject.boot.mybatis.pojo.PageResult;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.util.Sqls;

import java.util.List;

/**
 * @program: my-boot-application-admin-01-05
 * @description:
 * @author: yuane
 * @create: 2020-07-06 19:53
 */
@Service
@AllArgsConstructor
@Transactional
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
    public void save(SysUserVo sysUserVo) {
        sysUserService.insert(convert(sysUserVo));
    }

    @Override
    public void update(SysUserVo sysUserVo) {
        sysUserService.updateByPrimaryKeySelective(convert(sysUserVo));
    }

    @Override
    public void delete(List<Long> ids) {
        sysUserService.deleteByExample(Example.builder(SysUser.class).where(Sqls.custom().andIn("id",ids)).build());
    }

    @Override
    public void delete(Long id) {
        sysUserService.deleteByPrimaryKey(id);
    }

    private SysUser convert(SysUserVo sysUserVo) {
        SysUser sysUser = new SysUser();
        sysUser.setUsername(sysUserVo.getUsername());
        sysUser.setName(sysUserVo.getName());
        sysUser.setPassword(sysUserVo.getPassword());
        sysUser.setEnabled(sysUserVo.getEnabled());
        sysUser.setId(sysUserVo.getId());
        return sysUser;
    }
}