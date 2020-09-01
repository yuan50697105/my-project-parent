package org.myproject.app.db.auth.service;

import org.myproject.app.db.auth.pojo.AuthPermission;
import org.myproject.app.db.auth.pojo.AuthPermissionExample;
import org.myproject.app.db.auth.pojo.AuthPermissionQuery;
import org.myproject.app.db.auth.pojo.AuthPermissionVo;
import org.myproject.app.db.commons.pojo.IPage;

import java.util.Collection;
import java.util.List;

public interface AuthPermissionService {


    long countByExample(AuthPermissionExample example);

    int deleteByExample(AuthPermissionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AuthPermission record);

    int insert(AuthPermissionVo authPermissionVo);

    int insertOrUpdate(AuthPermission record);

    int insertOrUpdateSelective(AuthPermission record);

    int insertSelective(AuthPermission record);

    List<AuthPermission> selectByExample(AuthPermissionExample example);

    AuthPermission selectByPrimaryKey(Long id);

    int updateByExampleSelective(AuthPermission record, AuthPermissionExample example);

    int updateByExample(AuthPermission record, AuthPermissionExample example);

    int updateByPrimaryKeySelective(AuthPermission record);

    int updateByPrimaryKeySelective(AuthPermissionVo authPermissionVo);

    int updateByPrimaryKey(AuthPermission record);

    AuthPermission selectOneByCode(String code);

    List<AuthPermission> selectAllByCodeContaining(String containingCode);

    List<AuthPermission> selectAllByCodeLike(String likeCode);

    List<AuthPermission> selectAllByIdIn(Collection<Long> idCollection);

    int updateBatch(List<AuthPermission> list);

    int batchInsert(List<AuthPermission> list);

    int deleteByIdIn(Collection<Long> idCollection);

    IPage<AuthPermission> selectPageByQuery(AuthPermissionQuery query);
}

