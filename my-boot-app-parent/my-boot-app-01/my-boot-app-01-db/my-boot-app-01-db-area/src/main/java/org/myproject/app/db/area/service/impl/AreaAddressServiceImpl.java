package org.myproject.app.db.area.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.myproject.app.db.area.mapper.AreaAddressMapper;
import org.myproject.app.db.area.pojo.*;
import org.myproject.app.db.area.service.AreaAddressService;
import org.myproject.app.db.area.service.AreaPojoConverter;
import org.myproject.app.db.commons.pojo.IPage;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.List;

@Service
@Transactional
public class AreaAddressServiceImpl implements AreaAddressService {

    @Resource
    private AreaAddressMapper areaAddressMapper;
    @Resource
    private AreaPojoConverter converter;

    @Override
    public long countByExample(AreaAddressExample example) {
        return areaAddressMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(AreaAddressExample example) {
        return areaAddressMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return areaAddressMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(AreaAddress record) {
        return areaAddressMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(AreaAddress record) {
        return areaAddressMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(AreaAddress record) {
        return areaAddressMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(AreaAddress record) {
        return areaAddressMapper.insertSelective(record);
    }

    @Override
    public List<AreaAddress> selectByExample(AreaAddressExample example) {
        return areaAddressMapper.selectByExample(example);
    }

    @Override
    public AreaAddress selectByPrimaryKey(Long id) {
        return areaAddressMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(AreaAddress record, AreaAddressExample example) {
        return areaAddressMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(AreaAddress record, AreaAddressExample example) {
        return areaAddressMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(AreaAddress record) {
        return areaAddressMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(AreaAddress record) {
        return areaAddressMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<AreaAddress> list) {
        return areaAddressMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<AreaAddress> list) {
        return areaAddressMapper.batchInsert(list);
    }

    @Override
    public List<AreaAddress> selectAllByIdIn(Collection<Long> idCollection) {
        return areaAddressMapper.selectAllByIdIn(idCollection);
    }

    @Override
    public List<AreaAddress> selectAllByAreaIdIn(Collection<Long> areaIdCollection) {
        return areaAddressMapper.selectAllByAreaIdIn(areaIdCollection);
    }

    @Override
    public AreaAddress selectOneByAreaId(Long areaId) {
        return areaAddressMapper.selectOneByAreaId(areaId);
    }

    @Override
    public int deleteByIdIn(Collection<Long> idCollection) {
        return areaAddressMapper.deleteByIdIn(idCollection);
    }

    @Override
    public int deleteByAreaId(Long areaId) {
        return areaAddressMapper.deleteByAreaId(areaId);
    }

    @Override
    public int deleteByAreaIdIn(Collection<Long> areaIdCollection) {
        return areaAddressMapper.deleteByAreaIdIn(areaIdCollection);
    }

    @Override
    public IPage<AreaAddress> selectPageByQuery(AreaAddressQuery query) {
        PageHelper.startPage(query.getPage(), query.getLimit());
        return new IPageInfo<>(new PageInfo<>(selectByExample(query.toExample())));
    }

    @Override
    public int insert(AreaAddressVo areaAddressVo) {
        return insert(converter.convert(areaAddressVo));
    }

    @Override
    public int updateByPrimaryKeySelective(AreaAddressVo areaAddressVo) {
        return updateByPrimaryKeySelective(converter.convert(areaAddressVo));
    }

}

