package org.myproject.app.db.device.service;

import org.myproject.app.db.commons.pojo.IPage;
import org.myproject.app.db.device.pojo.DeviceInfo;
import org.myproject.app.db.device.pojo.DeviceInfoExample;
import org.myproject.app.db.device.pojo.DeviceInfoQuery;
import org.myproject.app.db.device.pojo.DeviceInfoVo;

import java.util.Collection;
import java.util.List;

public interface DeviceInfoService {


    long countByExample(DeviceInfoExample example);

    int deleteByExample(DeviceInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DeviceInfo record);

    int insertOrUpdate(DeviceInfo record);

    int insertOrUpdateSelective(DeviceInfo record);

    int insertSelective(DeviceInfo record);

    List<DeviceInfo> selectByExample(DeviceInfoExample example);

    DeviceInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(DeviceInfo record, DeviceInfoExample example);

    int updateByExample(DeviceInfo record, DeviceInfoExample example);

    int updateByPrimaryKeySelective(DeviceInfo record);

    int updateByPrimaryKey(DeviceInfo record);

    int updateBatch(List<DeviceInfo> list);

    int batchInsert(List<DeviceInfo> list);

    IPage<DeviceInfo> selectPageByQuery(DeviceInfoQuery query);

    int insert(DeviceInfoVo deviceInfoVo);

    int updateByPrimaryKeySelective(DeviceInfoVo deviceInfoVo);

    int deleteByIdIn(Collection<Long> idCollection);

    List<DeviceInfo> selectAllByIdIn(Collection<Long> idCollection);

    DeviceInfo selectOneByCodeOrId(String code, Long id);

    List<DeviceInfo> selectAllByCodeInOrIdIn(Collection<String> codeCollection, Collection<Long> idCollection);
}



