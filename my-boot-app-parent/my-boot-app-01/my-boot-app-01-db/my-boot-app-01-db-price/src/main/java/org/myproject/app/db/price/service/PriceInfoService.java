package org.myproject.app.db.price.service;

import org.myproject.app.db.commons.pojo.IPage;
import org.myproject.app.db.price.pojo.PriceInfo;
import org.myproject.app.db.price.pojo.PriceInfoExample;
import org.myproject.app.db.price.pojo.PriceInfoQuery;
import org.myproject.app.db.price.pojo.PriceInfoVo;

import java.util.Collection;
import java.util.List;

public interface PriceInfoService {


    long countByExample(PriceInfoExample example);

    int deleteByExample(PriceInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PriceInfo record);

    int insertOrUpdate(PriceInfo record);

    int insertOrUpdateSelective(PriceInfo record);

    int insertSelective(PriceInfo record);

    List<PriceInfo> selectByExample(PriceInfoExample example);

    PriceInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(PriceInfo record, PriceInfoExample example);

    int updateByExample(PriceInfo record, PriceInfoExample example);

    int updateByPrimaryKeySelective(PriceInfo record);

    int updateByPrimaryKey(PriceInfo record);

    List<PriceInfo> selectAllByIdIn(Collection<Long> idCollection);

    int deleteByIdIn(Collection<Long> idCollection);

    List<PriceInfo> selectAllByCode(String code);

    List<PriceInfo> selectAllByCodeIn(Collection<String> codeCollection);

    int updateBatch(List<PriceInfo> list);

    int batchInsert(List<PriceInfo> list);

    IPage<PriceInfo> selectPageByQuery(PriceInfoQuery query);

    int insert(PriceInfoVo priceInfoVo);

    int updateByPrimaryKeySelective(PriceInfoVo priceInfoVo);
}

