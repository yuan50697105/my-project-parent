package org.myproject.app.db.auth.service;

import org.myproject.app.db.auth.pojo.AuthRolePermission;
import org.myproject.app.db.auth.pojo.AuthRolePermissionExample;
import org.myproject.app.db.auth.pojo.PermissionByRoleResult;
import org.myproject.app.db.auth.pojo.PermissionByUserIdResult;

import java.util.Collection;
import java.util.List;

public interface AuthRolePermissionService {


    long countByExample(AuthRolePermissionExample example);

    int deleteByExample(AuthRolePermissionExample example);

    int deleteByPrimaryKey(Long roleId, Long permissionId);

    int insert(AuthRolePermission record);

    int insertSelective(AuthRolePermission record);

    List<AuthRolePermission> selectByExample(AuthRolePermissionExample example);

    int updateByExampleSelective(AuthRolePermission record, AuthRolePermissionExample example);

    int updateByExample(AuthRolePermission record, AuthRolePermissionExample example);

    int insertOrUpdate(AuthRolePermission record);

    int insertOrUpdateSelective(AuthRolePermission record);

    int updateBatch(List<AuthRolePermission> list);

    int updateBatchSelective(List<AuthRolePermission> list);

    int batchInsert(List<AuthRolePermission> list);

    int deleteByRoleId(Long roleId);

    int deleteByRoleIdIn(Collection<Long> roleIdCollection);

    int deleteByPermissionId(Long permissionId);

    int deleteByPermissionIdIn(Collection<Long> permissionIdCollection);

    List<PermissionByRoleResult> selectAllPermissionByRoleId(Long roleId);

    List<PermissionByUserIdResult> selectAllPermissionByUserId(Long userId);
}



