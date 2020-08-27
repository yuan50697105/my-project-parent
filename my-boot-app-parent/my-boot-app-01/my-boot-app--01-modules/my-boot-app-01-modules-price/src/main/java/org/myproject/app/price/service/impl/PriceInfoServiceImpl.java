package org.myproject.app.price.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import org.myproject.app.price.pojo.PriceInfoExample;
import org.myproject.app.price.mapper.PriceInfoMapper;
import org.myproject.app.price.pojo.PriceInfo;
import org.myproject.app.price.service.PriceInfoService;
@Service
public class PriceInfoServiceImpl implements PriceInfoService{

    @Resource
    private PriceInfoMapper priceInfoMapper;

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
    public int updateByExampleSelective(PriceInfo record,PriceInfoExample example) {
        return priceInfoMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(PriceInfo record,PriceInfoExample example) {
        return priceInfoMapper.updateByExample(record,example);
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

}
