package org.myproject.app.db.auth.service;

import org.myproject.app.db.auth.pojo.AuthUserRole;
import org.myproject.app.db.auth.pojo.AuthUserRoleExample;
import org.myproject.app.db.auth.pojo.RoleByUserResult;
import org.myproject.app.db.auth.pojo.UserRoleResult;

import java.util.Collection;
import java.util.List;

public interface AuthUserRoleService {


    long countByExample(AuthUserRoleExample example);

    int deleteByExample(AuthUserRoleExample example);

    int insert(AuthUserRole record);

    int insertSelective(AuthUserRole record);

    List<AuthUserRole> selectByExample(AuthUserRoleExample example);

    int updateByExampleSelective(AuthUserRole record, AuthUserRoleExample example);

    int updateByExample(AuthUserRole record, AuthUserRoleExample example);

    List<UserRoleResult> selectAllUserByRoleId(Long roleId);

    List<RoleByUserResult> selectAllRoleByUserId(Long userId);

    int deleteByPrimaryKey(Long userId, Long roleId);

    int deleteByUserId(Long userId);

    int deleteByUserIdIn(Collection<Long> userIdCollection);

    int deleteByRoleId(Long roleId);

    int deleteByRoleIdIn(Collection<Long> roleIdCollection);
}


