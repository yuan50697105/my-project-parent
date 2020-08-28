package org.myproject.app.area.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.myproject.app.area.pojo.AreaAddress;
import org.myproject.app.area.pojo.AreaAddressExample;

import java.util.Collection;
import java.util.List;

@Mapper
public interface AreaAddressMapper {
    long countByExample(AreaAddressExample example);

    int deleteByExample(AreaAddressExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AreaAddress record);

    int insertOrUpdate(AreaAddress record);

    int insertOrUpdateSelective(AreaAddress record);

    int insertSelective(AreaAddress record);

    List<AreaAddress> selectByExample(AreaAddressExample example);

    AreaAddress selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AreaAddress record, @Param("example") AreaAddressExample example);

    int updateByExample(@Param("record") AreaAddress record, @Param("example") AreaAddressExample example);

    int updateByPrimaryKeySelective(AreaAddress record);

    int updateByPrimaryKey(AreaAddress record);

    List<AreaAddress> selectAllByIdIn(@Param("idCollection") Collection<Long> idCollection);

    List<AreaAddress> selectAllByAreaIdIn(@Param("areaIdCollection") Collection<Long> areaIdCollection);

    AreaAddress selectOneByAreaId(@Param("areaId") Long areaId);

    int deleteByIdIn(@Param("idCollection") Collection<Long> idCollection);

    int deleteByAreaId(@Param("areaId") Long areaId);

    int deleteByAreaIdIn(@Param("areaIdCollection") Collection<Long> areaIdCollection);

    int updateBatch(List<AreaAddress> list);

    int batchInsert(@Param("list") List<AreaAddress> list);
}