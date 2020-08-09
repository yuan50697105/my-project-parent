package org.myproject.boot.application.admin.web.db.service.impl;

import org.myproject.boot.application.admin.web.db.mapper.TbSysUserRoleMapper;
import org.myproject.boot.application.admin.web.db.pojo.TbSysUserRole;
import org.myproject.boot.application.admin.web.db.service.TbSysUserRoleService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.weekend.WeekendSqls;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class TbSysUserRoleServiceImpl implements TbSysUserRoleService {

    @Resource
    private TbSysUserRoleMapper tbSysUserRoleMapper;

    @Override
    public List<Long> selectRoleIdByUserId(Long id) {
        Example.Builder builder = Example.builder(TbSysUserRole.class);
        builder.where(WeekendSqls.<TbSysUserRole>custom().andEqualTo(TbSysUserRole::getUserId, id));
        List<TbSysUserRole> tbSysUserRoles = tbSysUserRoleMapper.selectByExample(builder.build());
        return tbSysUserRoles.stream().filter(Objects::nonNull).map(TbSysUserRole::getRoleId).sorted().collect(Collectors.toList());
    }

    @Override
    public void deleteByUserId(Long userId) {
        Example.Builder builder = Example.builder(TbSysUserRole.class);
        builder.where(WeekendSqls.<TbSysUserRole>custom().andEqualTo(TbSysUserRole::getUserId, userId));
        tbSysUserRoleMapper.deleteByExample(builder.build());
    }

    @Override
    public void deleteByRoleId(Long roleId) {
        Example.Builder builder = Example.builder(TbSysUserRole.class);
        builder.where(WeekendSqls.<TbSysUserRole>custom().andEqualTo(TbSysUserRole::getRoleId, roleId));
        tbSysUserRoleMapper.deleteByExample(builder.build());
    }

    @Override
    public void insert(TbSysUserRole tbSysUserRole) {
        tbSysUserRoleMapper.insert(tbSysUserRole);
    }
}
