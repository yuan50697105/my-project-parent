package org.myproject.app.auth.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.myproject.app.auth.pojo.AuthUserRole;
import org.myproject.app.auth.pojo.AuthUserRoleExample;
import org.myproject.app.auth.pojo.RoleByUserResult;
import org.myproject.app.auth.pojo.UserByRoleResult;

import java.util.List;

@Mapper
public interface AuthUserRoleMapper {
    long countByExample(AuthUserRoleExample example);

    int deleteByExample(AuthUserRoleExample example);

    int insert(AuthUserRole record);

    int insertSelective(AuthUserRole record);

    List<AuthUserRole> selectByExample(AuthUserRoleExample example);

    int updateByExampleSelective(@Param("record") AuthUserRole record, @Param("example") AuthUserRoleExample example);

    int updateByExample(@Param("record") AuthUserRole record, @Param("example") AuthUserRoleExample example);

    List<UserByRoleResult> selectAllUserByRoleId(@Param("roleId") Long roleId);

    List<RoleByUserResult> selectAllRoleByUserId(@Param("userId") Long userId);
}