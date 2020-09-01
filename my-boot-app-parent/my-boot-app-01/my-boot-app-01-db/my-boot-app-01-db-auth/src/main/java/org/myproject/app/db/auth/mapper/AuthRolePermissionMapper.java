package org.myproject.app.db.auth.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.myproject.app.db.auth.pojo.AuthRolePermission;
import org.myproject.app.db.auth.pojo.AuthRolePermissionExample;
import org.myproject.app.db.auth.pojo.PermissionByRoleResult;
import org.myproject.app.db.auth.pojo.PermissionByUserIdResult;

import java.util.Collection;
import java.util.List;

@Mapper
public interface AuthRolePermissionMapper {
    long countByExample(AuthRolePermissionExample example);

    int deleteByExample(AuthRolePermissionExample example);

    int deleteByPrimaryKey(@Param("roleId") Long roleId, @Param("permissionId") Long permissionId);

    int insert(AuthRolePermission record);

    int insertOrUpdate(AuthRolePermission record);

    int insertOrUpdateSelective(AuthRolePermission record);

    int insertSelective(AuthRolePermission record);

    List<AuthRolePermission> selectByExample(AuthRolePermissionExample example);

    int updateByExampleSelective(@Param("record") AuthRolePermission record, @Param("example") AuthRolePermissionExample example);

    int updateByExample(@Param("record") AuthRolePermission record, @Param("example") AuthRolePermissionExample example);

    int deleteByRoleId(@Param("roleId") Long roleId);

    int deleteByRoleIdIn(@Param("roleIdCollection") Collection<Long> roleIdCollection);

    int deleteByPermissionId(@Param("permissionId") Long permissionId);

    int deleteByPermissionIdIn(@Param("permissionIdCollection") Collection<Long> permissionIdCollection);

    int updateBatch(List<AuthRolePermission> list);

    int updateBatchSelective(List<AuthRolePermission> list);

    int batchInsert(@Param("list") List<AuthRolePermission> list);

    List<PermissionByRoleResult> selectAllPermissionByRoleId(@Param("roleId") Long roleId);

    List<PermissionByUserIdResult> selectAllPermissionByUserId(Long userId);
}