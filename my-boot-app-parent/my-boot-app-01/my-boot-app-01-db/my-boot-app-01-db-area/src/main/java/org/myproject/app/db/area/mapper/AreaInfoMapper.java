package org.myproject.app.db.area.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.myproject.app.db.area.pojo.AreaInfo;
import org.myproject.app.db.area.pojo.AreaInfoExample;

import java.util.Collection;
import java.util.List;

@Mapper
public interface AreaInfoMapper {
    long countByExample(AreaInfoExample example);

    int deleteByExample(AreaInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AreaInfo record);

    int insertOrUpdate(AreaInfo record);

    int insertOrUpdateSelective(AreaInfo record);

    int insertSelective(AreaInfo record);

    List<AreaInfo> selectByExample(AreaInfoExample example);

    AreaInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AreaInfo record, @Param("example") AreaInfoExample example);

    int updateByExample(@Param("record") AreaInfo record, @Param("example") AreaInfoExample example);

    int updateByPrimaryKeySelective(AreaInfo record);

    int updateByPrimaryKey(AreaInfo record);

    List<AreaInfo> selectAllByIdIn(@Param("idCollection") Collection<Long> idCollection);

    List<AreaInfo> selectAllByCodeContaining(@Param("containingCode") String containingCode);

    int deleteByIdIn(@Param("idCollection") Collection<Long> idCollection);

    int updateBatch(List<AreaInfo> list);

    int batchInsert(@Param("list") List<AreaInfo> list);
}