package org.myproject.app.auth.service;

import org.myproject.app.auth.pojo.AuthUserRole;
import org.myproject.app.auth.pojo.AuthUserRoleExample;
import org.myproject.app.auth.pojo.RoleByUserResult;
import org.myproject.app.auth.pojo.UserByRoleResult;

import java.util.List;

public interface AuthUserRoleService {


    long countByExample(AuthUserRoleExample example);

    int deleteByExample(AuthUserRoleExample example);

    int insert(AuthUserRole record);

    int insertSelective(AuthUserRole record);

    List<AuthUserRole> selectByExample(AuthUserRoleExample example);

    int updateByExampleSelective(AuthUserRole record, AuthUserRoleExample example);

    int updateByExample(AuthUserRole record, AuthUserRoleExample example);

    List<UserByRoleResult> selectAllUserByRoleId(Long roleId);

    List<RoleByUserResult> selectAllRoleByUserId(Long userId);
}
