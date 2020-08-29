package org.myproject.app.auth.service.impl;

import org.myproject.app.auth.mapper.AuthRolePermissionMapper;
import org.myproject.app.auth.pojo.AuthRolePermission;
import org.myproject.app.auth.pojo.AuthRolePermissionExample;
import org.myproject.app.auth.pojo.PermissionByRoleResult;
import org.myproject.app.auth.pojo.PermissionByUserIdResult;
import org.myproject.app.auth.service.AuthRolePermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.List;

@Service
public class AuthRolePermissionServiceImpl implements AuthRolePermissionService {

    @Resource
    private AuthRolePermissionMapper authRolePermissionMapper;

    @Override
    public long countByExample(AuthRolePermissionExample example) {
        return authRolePermissionMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(AuthRolePermissionExample example) {
        return authRolePermissionMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long roleId, Long permissionId) {
        return authRolePermissionMapper.deleteByPrimaryKey(roleId, permissionId);
    }

    @Override
    public int insert(AuthRolePermission record) {
        return authRolePermissionMapper.insert(record);
    }

    @Override
    public int insertSelective(AuthRolePermission record) {
        return authRolePermissionMapper.insertSelective(record);
    }

    @Override
    public List<AuthRolePermission> selectByExample(AuthRolePermissionExample example) {
        return authRolePermissionMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(AuthRolePermission record, AuthRolePermissionExample example) {
        return authRolePermissionMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(AuthRolePermission record, AuthRolePermissionExample example) {
        return authRolePermissionMapper.updateByExample(record, example);
    }

    @Override
    public int insertOrUpdate(AuthRolePermission record) {
        return authRolePermissionMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(AuthRolePermission record) {
        return authRolePermissionMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int updateBatch(List<AuthRolePermission> list) {
        return authRolePermissionMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<AuthRolePermission> list) {
        return authRolePermissionMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<AuthRolePermission> list) {
        return authRolePermissionMapper.batchInsert(list);
    }

    @Override
    public int deleteByRoleId(Long roleId) {
        return authRolePermissionMapper.deleteByRoleId(roleId);
    }

    @Override
    public int deleteByRoleIdIn(Collection<Long> roleIdCollection) {
        return authRolePermissionMapper.deleteByRoleIdIn(roleIdCollection);
    }

    @Override
    public int deleteByPermissionId(Long permissionId) {
        return authRolePermissionMapper.deleteByPermissionId(permissionId);
    }

    @Override
    public int deleteByPermissionIdIn(Collection<Long> permissionIdCollection) {
        return authRolePermissionMapper.deleteByPermissionIdIn(permissionIdCollection);
    }

    @Override
    public List<PermissionByRoleResult> selectAllPermissionByRoleId(Long roleId) {
        return authRolePermissionMapper.selectAllPermissionByRoleId(roleId);
    }

    @Override
    public List<PermissionByUserIdResult> selectAllPermissionByUserId(Long userId) {
        return authRolePermissionMapper.selectAllPermissionByUserId(userId);
    }
}



