package org.myproject.boot.application.admin.db.service.impl;

import org.myproject.boot.application.admin.db.mapper.TbSysRoleMapper;
import org.myproject.boot.application.admin.db.pojo.TbSysRole;
import org.myproject.boot.application.admin.db.service.TbSysRoleService;
import org.myproject.boot.mybatis.pojo.BaseEntity;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.util.Sqls;
import tk.mybatis.mapper.weekend.WeekendSqls;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class TbSysRoleServiceImpl implements TbSysRoleService {

    @Resource
    private TbSysRoleMapper tbSysRoleMapper;

    @Override
    public List<TbSysRole> selectByIds(List<Long> roleIds) {
        Example.Builder builder = Example.builder(TbSysRole.class);
        builder.where(WeekendSqls.<TbSysRole>custom().andIn(TbSysRole::getId, roleIds));
        return tbSysRoleMapper.selectByExample(builder.build());
    }

    @Override
    public TbSysRole selectByPrimaryKey(Long id) {
        return tbSysRoleMapper.selectByPrimaryKey(id);
    }

    @Override
    public void updateByPrimaryKeySelective(TbSysRole tbSysRole) {
        tbSysRoleMapper.updateByPrimaryKeySelective(tbSysRole);
    }

    @Override
    public void insert(TbSysRole sysRoles) {
        tbSysRoleMapper.insert(sysRoles);
    }

    @Override
    public void deleteByPrimaryKey(Long id) {
        tbSysRoleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<Long> selectIdtByIds(List<Long> roleIds) {
        Example.Builder builder = Example.builder(TbSysRole.class);
        builder.where(Sqls.custom().andIn("id", roleIds));
        return tbSysRoleMapper.selectByExample(builder.build()).stream().filter(Objects::nonNull).map(BaseEntity::getId).collect(Collectors.toList());
    }
}
