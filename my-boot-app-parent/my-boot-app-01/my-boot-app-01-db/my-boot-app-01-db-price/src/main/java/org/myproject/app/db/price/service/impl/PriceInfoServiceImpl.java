package org.myproject.app.db.price.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.myproject.app.db.commons.pojo.IPage;
import org.myproject.app.db.price.mapper.PriceInfoMapper;
import org.myproject.app.db.price.pojo.*;
import org.myproject.app.db.price.service.PriceInfoService;
import org.myproject.app.db.price.service.PricePojoConverter;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.List;

@Service
@Transactional
public class PriceInfoServiceImpl implements PriceInfoService {

    @Resource
    private PriceInfoMapper priceInfoMapper;
    @Resource
    private PricePojoConverter converter;

    @Override
    public long countByExample(PriceInfoExample example) {
        return priceInfoMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(PriceInfoExample example) {
        return priceInfoMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return priceInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PriceInfo record) {
        return priceInfoMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(PriceInfo record) {
        return priceInfoMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(PriceInfo record) {
        return priceInfoMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(PriceInfo record) {
        return priceInfoMapper.insertSelective(record);
    }

    @Override
    public List<PriceInfo> selectByExample(PriceInfoExample example) {
        return priceInfoMapper.selectByExample(example);
    }

    @Override
    public PriceInfo selectByPrimaryKey(Long id) {
        return priceInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(PriceInfo record, PriceInfoExample example) {
        return priceInfoMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(PriceInfo record, PriceInfoExample example) {
        return priceInfoMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(PriceInfo record) {
        return priceInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PriceInfo record) {
        return priceInfoMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<PriceInfo> selectAllByIdIn(Collection<Long> idCollection) {
        return priceInfoMapper.selectAllByIdIn(idCollection);
    }

    @Override
    public int deleteByIdIn(Collection<Long> idCollection) {
        return priceInfoMapper.deleteByIdIn(idCollection);
    }

    @Override
    public List<PriceInfo> selectAllByCode(String code) {
        return priceInfoMapper.selectAllByCode(code);
    }

    @Override
    public List<PriceInfo> selectAllByCodeIn(Collection<String> codeCollection) {
        return priceInfoMapper.selectAllByCodeIn(codeCollection);
    }

    @Override
    public int updateBatch(List<PriceInfo> list) {
        return priceInfoMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<PriceInfo> list) {
        return priceInfoMapper.batchInsert(list);
    }

    @Override
    public IPage<PriceInfo> selectPageByQuery(PriceInfoQuery query) {
        PageHelper.startPage(query.getPage(), query.getLimit());
        return new IPageInfo<>(PageInfo.of(selectByExample(query.toExample())));
    }

    @Override
    @Transactional
    public int insert(PriceInfoVo priceInfoVo) {
        PriceInfo record = converter.convert(priceInfoVo);
        return priceInfoMapper.insert(record);
    }

    @Override
    @Transactional
    public int updateByPrimaryKeySelective(PriceInfoVo priceInfoVo) {
        PriceInfo record = converter.convert(priceInfoVo);
        return priceInfoMapper.updateByPrimaryKeySelective(record);
    }

}

