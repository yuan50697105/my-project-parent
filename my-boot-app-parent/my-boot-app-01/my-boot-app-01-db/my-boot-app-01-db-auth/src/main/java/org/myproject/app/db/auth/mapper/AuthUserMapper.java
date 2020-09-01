package org.myproject.app.db.auth.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.myproject.app.db.auth.pojo.AuthUser;
import org.myproject.app.db.auth.pojo.AuthUserDetailResult;
import org.myproject.app.db.auth.pojo.AuthUserExample;

import java.util.Collection;
import java.util.List;

@Mapper
public interface AuthUserMapper {
    long countByExample(AuthUserExample example);

    int deleteByExample(AuthUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AuthUser record);

    int insertOrUpdate(AuthUser record);

    int insertOrUpdateSelective(AuthUser record);

    int insertSelective(AuthUser record);

    List<AuthUser> selectByExample(AuthUserExample example);

    AuthUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AuthUser record, @Param("example") AuthUserExample example);

    int updateByExample(@Param("record") AuthUser record, @Param("example") AuthUserExample example);

    int updateByPrimaryKeySelective(AuthUser record);

    int updateByPrimaryKey(AuthUser record);

    int updateBatch(List<AuthUser> list);

    int updateBatchSelective(List<AuthUser> list);

    int batchInsert(@Param("list") List<AuthUser> list);

    AuthUser selectOneByUsername(@Param("username") String username);

    List<AuthUser> selectAllByUsername(@Param("username") String username);

    int updatePasswordByUsername(@Param("updatedPassword") String updatedPassword, @Param("username") String username);

    int updatePasswordById(@Param("updatedPassword") String updatedPassword, @Param("id") Long id);

    int updateEnabledById(@Param("updatedEnabled") Integer updatedEnabled, @Param("id") Long id);

    int updateEnabledByIdIn(@Param("updatedEnabled") Integer updatedEnabled, @Param("idCollection") Collection<Long> idCollection);

    List<AuthUser> selectAllByIdIn(@Param("idCollection") Collection<Long> idCollection);

    int deleteByIdIn(@Param("idCollection") Collection<Long> idCollection);

    AuthUserDetailResult selectDetailById(Long id);
}