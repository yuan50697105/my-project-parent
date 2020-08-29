package org.myproject.app.auth.service.impl;

import org.myproject.app.auth.mapper.AuthUserRoleMapper;
import org.myproject.app.auth.pojo.AuthUserRole;
import org.myproject.app.auth.pojo.AuthUserRoleExample;
import org.myproject.app.auth.pojo.RoleByUserResult;
import org.myproject.app.auth.pojo.UserByRoleResult;
import org.myproject.app.auth.service.AuthUserRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AuthUserRoleServiceImpl implements AuthUserRoleService {

    @Resource
    private AuthUserRoleMapper authUserRoleMapper;

    @Override
    public long countByExample(AuthUserRoleExample example) {
        return authUserRoleMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(AuthUserRoleExample example) {
        return authUserRoleMapper.deleteByExample(example);
    }

    @Override
    public int insert(AuthUserRole record) {
        return authUserRoleMapper.insert(record);
    }

    @Override
    public int insertSelective(AuthUserRole record) {
        return authUserRoleMapper.insertSelective(record);
    }

    @Override
    public List<AuthUserRole> selectByExample(AuthUserRoleExample example) {
        return authUserRoleMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(AuthUserRole record, AuthUserRoleExample example) {
        return authUserRoleMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(AuthUserRole record, AuthUserRoleExample example) {
        return authUserRoleMapper.updateByExample(record, example);
    }

    @Override
    public List<UserByRoleResult> selectAllUserByRoleId(Long roleId) {
        return authUserRoleMapper.selectAllUserByRoleId(roleId);
    }

    @Override
    public List<RoleByUserResult> selectAllRoleByUserId(Long userId) {
        return authUserRoleMapper.selectAllRoleByUserId(userId);
    }
}
