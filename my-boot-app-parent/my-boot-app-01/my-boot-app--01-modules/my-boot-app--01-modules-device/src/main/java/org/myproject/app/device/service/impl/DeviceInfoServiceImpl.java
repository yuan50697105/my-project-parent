package org.myproject.app.device.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import org.myproject.app.device.pojo.DeviceInfo;
import java.util.List;
import org.myproject.app.device.mapper.DeviceInfoMapper;
import org.myproject.app.device.pojo.DeviceInfoExample;
import org.myproject.app.device.service.DeviceInfoService;
@Service
public class DeviceInfoServiceImpl implements DeviceInfoService{

    @Resource
    private DeviceInfoMapper deviceInfoMapper;

    @Override
    public long countByExample(DeviceInfoExample example) {
        return deviceInfoMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(DeviceInfoExample example) {
        return deviceInfoMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return deviceInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(DeviceInfo record) {
        return deviceInfoMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(DeviceInfo record) {
        return deviceInfoMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(DeviceInfo record) {
        return deviceInfoMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(DeviceInfo record) {
        return deviceInfoMapper.insertSelective(record);
    }

    @Override
    public List<DeviceInfo> selectByExample(DeviceInfoExample example) {
        return deviceInfoMapper.selectByExample(example);
    }

    @Override
    public DeviceInfo selectByPrimaryKey(Long id) {
        return deviceInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(DeviceInfo record,DeviceInfoExample example) {
        return deviceInfoMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(DeviceInfo record,DeviceInfoExample example) {
        return deviceInfoMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(DeviceInfo record) {
        return deviceInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(DeviceInfo record) {
        return deviceInfoMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<DeviceInfo> list) {
        return deviceInfoMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<DeviceInfo> list) {
        return deviceInfoMapper.batchInsert(list);
    }

}
