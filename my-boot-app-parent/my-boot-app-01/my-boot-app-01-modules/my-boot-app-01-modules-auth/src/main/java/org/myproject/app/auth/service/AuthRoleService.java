package org.myproject.app.auth.service;

import org.myproject.app.auth.pojo.*;
import org.myproject.app.commons.pojo.IPage;

import java.util.Collection;
import java.util.List;

public interface AuthRoleService {


    long countByExample(AuthRoleExample example);

    int deleteByExample(AuthRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AuthRole record);

    int insert(AuthRoleVo authRoleVo);

    int insertOrUpdate(AuthRole record);

    int insertOrUpdateSelective(AuthRole record);

    int insertSelective(AuthRole record);

    List<AuthRole> selectByExample(AuthRoleExample example);

    AuthRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(AuthRole record, AuthRoleExample example);

    int updateByExample(AuthRole record, AuthRoleExample example);

    int updateByPrimaryKeySelective(AuthRole record);

    int updateByPrimaryKeySelective(AuthRoleVo authRoleVo);

    int updateByPrimaryKey(AuthRole record);

    List<AuthRole> selectAllByIdIn(Collection<Long> idCollection);

    List<AuthRole> selectAllByName(String name);

    int deleteByIdIn(Collection<Long> idCollection);

    int updateEnabledById(Integer updatedEnabled, Long id);

    int updateEnabledByIdIn(Integer updatedEnabled, Collection<Long> idCollection);

    int updateBatch(List<AuthRole> list);

    int batchInsert(List<AuthRole> list);

    IPage<AuthRole> selectPageByQuery(AuthRoleQuery query);

    AuthRoleDetailResult selectDetailById(Long id);
}
