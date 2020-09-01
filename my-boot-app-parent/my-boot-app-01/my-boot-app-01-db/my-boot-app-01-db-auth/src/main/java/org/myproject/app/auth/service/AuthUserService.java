package org.myproject.app.auth.service;

import org.myproject.app.auth.pojo.*;
import org.myproject.app.commons.pojo.IPage;

import java.util.Collection;
import java.util.List;

public interface AuthUserService {


    long countByExample(AuthUserExample example);

    int deleteByExample(AuthUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AuthUser record);

    int insert(AuthUserVo record);

    int insertOrUpdate(AuthUser record);

    int insertOrUpdateSelective(AuthUser record);

    int insertSelective(AuthUser record);

    List<AuthUser> selectByExample(AuthUserExample example);

    AuthUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(AuthUser record, AuthUserExample example);

    int updateByExample(AuthUser record, AuthUserExample example);

    int updateByPrimaryKeySelective(AuthUser record);

    int updateByPrimaryKeySelective(AuthUserVo record);

    int updateByPrimaryKey(AuthUser record);

    AuthUser selectOneByUsername(String username);

    List<AuthUser> selectAllByUsername(String username);

    int updatePasswordByUsername(String updatedPassword, String username);

    int updatePasswordById(String updatedPassword, Long id);

    int updateEnabledById(Integer updatedEnabled, Long id);

    int updateEnabledByIdIn(Integer updatedEnabled, Collection<Long> idCollection);

    List<AuthUser> selectAllByIdIn(Collection<Long> idCollection);

    int updateBatch(List<AuthUser> list);

    int updateBatchSelective(List<AuthUser> list);

    int batchInsert(List<AuthUser> list);

    IPage<AuthUser> selectPageByQuery(AuthUserQuery query);

    int deleteByIdIn(Collection<Long> idCollection);

    AuthUserDetailResult selectDetailById(Long id);
}






