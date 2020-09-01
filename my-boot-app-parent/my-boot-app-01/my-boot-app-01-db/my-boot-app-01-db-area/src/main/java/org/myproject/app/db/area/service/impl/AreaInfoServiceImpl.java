package org.myproject.app.db.area.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.myproject.app.db.area.mapper.AreaInfoMapper;
import org.myproject.app.db.area.pojo.*;
import org.myproject.app.db.area.service.AreaInfoService;
import org.myproject.app.db.area.service.AreaPojoConverter;
import org.myproject.app.db.commons.pojo.IPage;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.List;

@Service
@Transactional
public class AreaInfoServiceImpl implements AreaInfoService {

    @Resource
    private AreaInfoMapper areaInfoMapper;
    @Resource
    private AreaPojoConverter converter;

    @Override
    public long countByExample(AreaInfoExample example) {
        return areaInfoMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(AreaInfoExample example) {
        return areaInfoMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return areaInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(AreaInfo record) {
        return areaInfoMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(AreaInfo record) {
        return areaInfoMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(AreaInfo record) {
        return areaInfoMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(AreaInfo record) {
        return areaInfoMapper.insertSelective(record);
    }

    @Override
    public List<AreaInfo> selectByExample(AreaInfoExample example) {
        return areaInfoMapper.selectByExample(example);
    }

    @Override
    public AreaInfo selectByPrimaryKey(Long id) {
        return areaInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(AreaInfo record, AreaInfoExample example) {
        return areaInfoMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(AreaInfo record, AreaInfoExample example) {
        return areaInfoMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(AreaInfo record) {
        return areaInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(AreaInfo record) {
        return areaInfoMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<AreaInfo> selectAllByIdIn(Collection<Long> idCollection) {
        return areaInfoMapper.selectAllByIdIn(idCollection);
    }

    @Override
    public List<AreaInfo> selectAllByCodeContaining(String containingCode) {
        return areaInfoMapper.selectAllByCodeContaining(containingCode);
    }

    @Override
    public int deleteByIdIn(Collection<Long> idCollection) {
        return areaInfoMapper.deleteByIdIn(idCollection);
    }

    @Override
    public int updateBatch(List<AreaInfo> list) {
        return areaInfoMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<AreaInfo> list) {
        return areaInfoMapper.batchInsert(list);
    }

    @Override
    public IPage<AreaInfo> selectPageByQuery(AreaInfoQuery query) {
        PageHelper.startPage(query.getPage(), query.getLimit());
        return new IPageInfo<>(new PageInfo<>(selectByExample(query.toExample())));
    }

    @Override
    public int insert(AreaInfoVo areaInfoVo) {
        return insert(converter.convert(areaInfoVo));
    }

    @Override
    public int updateByPrimaryKeySelective(AreaInfoVo areaInfoVo) {
        return updateByPrimaryKeySelective(converter.convert(areaInfoVo));
    }

}
