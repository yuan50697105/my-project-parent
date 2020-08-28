package org.myproject.app.bill.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.myproject.app.bill.pojo.*;
import org.myproject.app.bill.service.BillPojoConverter;
import org.myproject.app.commons.pojo.IPage;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.List;

import org.myproject.app.bill.mapper.BillInfoMapper;
import org.myproject.app.bill.service.BillInfoService;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BillInfoServiceImpl implements BillInfoService {

    @Resource
    private BillInfoMapper billInfoMapper;
    @Resource
    private BillPojoConverter converter;

    @Override
    public long countByExample(BillInfoExample example) {
        return billInfoMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(BillInfoExample example) {
        return billInfoMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return billInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(BillInfo record) {
        return billInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(BillInfo record) {
        return billInfoMapper.insertSelective(record);
    }

    @Override
    public List<BillInfo> selectByExample(BillInfoExample example) {
        return billInfoMapper.selectByExample(example);
    }

    @Override
    public BillInfo selectByPrimaryKey(Long id) {
        return billInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(BillInfo record, BillInfoExample example) {
        return billInfoMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(BillInfo record, BillInfoExample example) {
        return billInfoMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(BillInfo record) {
        return billInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(BillInfo record) {
        return billInfoMapper.updateByPrimaryKey(record);
    }

    @Override
    public BillInfo selectAllByIdOrBillNoOrTransactionNo(Long id, String billNo, String transactionNo) {
        return billInfoMapper.selectAllByIdOrBillNoOrTransactionNo(id, billNo, transactionNo);
    }

    @Override
    public int deleteByIdIn(Collection<Long> idCollection) {
        return billInfoMapper.deleteByIdIn(idCollection);
    }

    @Override
    public IPage<BillInfo> selectPageByQuery(BillInfoQuery query) {
        PageHelper.startPage(query.getPage(), query.getLimit());
        return new IPageInfo<>(PageInfo.of(selectByExample(query.toExample())));
    }

    @Override
    public int insert(BillInfoVo vo) {
        return billInfoMapper.insert(converter.convert(vo));
    }

    @Override
    public int updateByPrimaryKeySelective(BillInfoVo vo) {
        return billInfoMapper.updateByPrimaryKeySelective(converter.convert(vo));
    }
}

