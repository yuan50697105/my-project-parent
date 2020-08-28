package org.myproject.app.auth.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.myproject.app.auth.pojo.AuthRole;
import org.myproject.app.auth.pojo.AuthRoleExample;

import java.util.Collection;
import java.util.List;

@Mapper
public interface AuthRoleMapper {
    long countByExample(AuthRoleExample example);

    int deleteByExample(AuthRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AuthRole record);

    int insertOrUpdate(AuthRole record);

    int insertOrUpdateSelective(AuthRole record);

    int insertSelective(AuthRole record);

    List<AuthRole> selectByExample(AuthRoleExample example);

    AuthRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AuthRole record, @Param("example") AuthRoleExample example);

    int updateByExample(@Param("record") AuthRole record, @Param("example") AuthRoleExample example);

    int updateByPrimaryKeySelective(AuthRole record);

    int updateByPrimaryKey(AuthRole record);

    List<AuthRole> selectAllByIdIn(@Param("idCollection") Collection<Long> idCollection);

    List<AuthRole> selectAllByName(@Param("name") String name);

    int deleteByIdIn(@Param("idCollection") Collection<Long> idCollection);

    int updateEnabledById(@Param("updatedEnabled") Integer updatedEnabled, @Param("id") Long id);

    int updateEnabledByIdIn(@Param("updatedEnabled") Integer updatedEnabled, @Param("idCollection") Collection<Long> idCollection);

    int updateBatch(List<AuthRole> list);

    int batchInsert(@Param("list") List<AuthRole> list);
}