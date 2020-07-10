package org.myproject.boot.application.admin.db.service.table.impl;

import org.myproject.boot.application.admin.db.mapper.SysUserRoleMapper;
import org.myproject.boot.application.admin.db.pojo.SysUserRole;
import org.myproject.boot.application.admin.db.pojo.SysUserRoleExample;
import org.myproject.boot.application.admin.db.service.table.SysUserRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysUserRoleServiceImpl implements SysUserRoleService {

    @Resource
    private SysUserRoleMapper sysUserRoleMapper;

    @Override
    public long countByExample(SysUserRoleExample example) {
        return sysUserRoleMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(SysUserRoleExample example) {
        return sysUserRoleMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long roleId) {
        return sysUserRoleMapper.deleteByPrimaryKey(roleId);
    }

    @Override
    public int insert(SysUserRole record) {
        return sysUserRoleMapper.insert(record);
    }

    @Override
    public int insertSelective(SysUserRole record) {
        return sysUserRoleMapper.insertSelective(record);
    }

    @Override
    public List<SysUserRole> selectByExample(SysUserRoleExample example) {
        return sysUserRoleMapper.selectByExample(example);
    }

    @Override
    public SysUserRole selectByPrimaryKey(Long roleId) {
        return sysUserRoleMapper.selectByPrimaryKey(roleId);
    }

    @Override
    public int updateByExampleSelective(SysUserRole record, SysUserRoleExample example) {
        return sysUserRoleMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(SysUserRole record, SysUserRoleExample example) {
        return sysUserRoleMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(SysUserRole record) {
        return sysUserRoleMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SysUserRole record) {
        return sysUserRoleMapper.updateByPrimaryKey(record);
    }

    @Override
    public int insertBatch(List<SysUserRole> userRoles) {
        return userRoles.stream().map(this::insert).reduce(Integer::sum).orElse(0);
    }

}

