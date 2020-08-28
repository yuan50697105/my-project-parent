package org.myproject.app.device.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.myproject.app.device.pojo.DeviceInfo;
import org.myproject.app.device.pojo.DeviceInfoExample;

import java.util.Collection;
import java.util.List;

@Mapper
public interface DeviceInfoMapper {
    long countByExample(DeviceInfoExample example);

    int deleteByExample(DeviceInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DeviceInfo record);

    int insertOrUpdate(DeviceInfo record);

    int insertOrUpdateSelective(DeviceInfo record);

    int insertSelective(DeviceInfo record);

    List<DeviceInfo> selectByExample(DeviceInfoExample example);

    DeviceInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DeviceInfo record, @Param("example") DeviceInfoExample example);

    int updateByExample(@Param("record") DeviceInfo record, @Param("example") DeviceInfoExample example);

    int updateByPrimaryKeySelective(DeviceInfo record);

    int updateByPrimaryKey(DeviceInfo record);

    int deleteByIdIn(@Param("idCollection") Collection<Long> idCollection);

    List<DeviceInfo> selectAllByIdIn(@Param("idCollection") Collection<Long> idCollection);

    DeviceInfo selectOneByCodeOrId(@Param("code") String code, @Param("id") Long id);

    List<DeviceInfo> selectAllByCodeInOrIdIn(@Param("codeCollection") Collection<String> codeCollection, @Param("idCollection") Collection<Long> idCollection);

    int updateBatch(List<DeviceInfo> list);

    int batchInsert(@Param("list") List<DeviceInfo> list);
}