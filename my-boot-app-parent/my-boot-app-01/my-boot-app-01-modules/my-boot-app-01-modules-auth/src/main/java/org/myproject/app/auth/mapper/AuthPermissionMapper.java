package org.myproject.app.auth.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.myproject.app.auth.pojo.AuthPermission;
import org.myproject.app.auth.pojo.AuthPermissionExample;

import java.util.Collection;
import java.util.List;

@Mapper
public interface AuthPermissionMapper {
    long countByExample(AuthPermissionExample example);

    int deleteByExample(AuthPermissionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AuthPermission record);

    int insertOrUpdate(AuthPermission record);

    int insertOrUpdateSelective(AuthPermission record);

    int insertSelective(AuthPermission record);

    List<AuthPermission> selectByExample(AuthPermissionExample example);

    AuthPermission selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AuthPermission record, @Param("example") AuthPermissionExample example);

    int updateByExample(@Param("record") AuthPermission record, @Param("example") AuthPermissionExample example);

    int updateByPrimaryKeySelective(AuthPermission record);

    int updateByPrimaryKey(AuthPermission record);

    AuthPermission selectOneByCode(@Param("code") String code);

    List<AuthPermission> selectAllByCodeContaining(@Param("containingCode") String containingCode);

    List<AuthPermission> selectAllByCodeLike(@Param("likeCode") String likeCode);

    List<AuthPermission> selectAllByIdIn(@Param("idCollection") Collection<Long> idCollection);

    int deleteByIdIn(@Param("idCollection") Collection<Long> idCollection);

    int updateBatch(List<AuthPermission> list);

    int batchInsert(@Param("list") List<AuthPermission> list);
}