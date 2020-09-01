package org.myproject.app.db.device.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.myproject.app.db.commons.pojo.IPage;
import org.myproject.app.db.device.mapper.DeviceInfoMapper;
import org.myproject.app.db.device.pojo.*;
import org.myproject.app.db.device.service.DeviceInfoService;
import org.myproject.app.db.device.service.DevicePojoConverter;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.List;

@Service
@Transactional
public class DeviceInfoServiceImpl implements DeviceInfoService {

    @Resource
    private DeviceInfoMapper deviceInfoMapper;
    @Resource
    private DevicePojoConverter converter;

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
    public int updateByExampleSelective(DeviceInfo record, DeviceInfoExample example) {
        return deviceInfoMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(DeviceInfo record, DeviceInfoExample example) {
        return deviceInfoMapper.updateByExample(record, example);
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

    @Override
    public IPage<DeviceInfo> selectPageByQuery(DeviceInfoQuery query) {
        PageHelper.startPage(query.getPage(), query.getLimit());
        return new IPageInfo<>(new PageInfo<>(selectByExample(query.toExample())));
    }

    @Override
    public int insert(DeviceInfoVo deviceInfoVo) {
        return insert(converter.convert(deviceInfoVo));
    }

    @Override
    public int updateByPrimaryKeySelective(DeviceInfoVo deviceInfoVo) {
        return updateByPrimaryKeySelective(converter.convert(deviceInfoVo));
    }

    @Override
    public int deleteByIdIn(Collection<Long> idCollection) {
        return deviceInfoMapper.deleteByIdIn(idCollection);
    }

    @Override
    public List<DeviceInfo> selectAllByIdIn(Collection<Long> idCollection) {
        return deviceInfoMapper.selectAllByIdIn(idCollection);
    }

    @Override
    public DeviceInfo selectOneByCodeOrId(String code, Long id) {
        return deviceInfoMapper.selectOneByCodeOrId(code, id);
    }

    @Override
    public List<DeviceInfo> selectAllByCodeInOrIdIn(Collection<String> codeCollection, Collection<Long> idCollection) {
        return deviceInfoMapper.selectAllByCodeInOrIdIn(codeCollection, idCollection);
    }
}



