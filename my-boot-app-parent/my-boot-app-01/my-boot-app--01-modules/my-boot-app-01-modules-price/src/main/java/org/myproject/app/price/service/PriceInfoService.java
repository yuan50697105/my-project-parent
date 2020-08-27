package org.myproject.app.price.service;

import java.util.List;
import org.myproject.app.price.pojo.PriceInfoExample;
import org.myproject.app.price.pojo.PriceInfo;
public interface PriceInfoService{


    long countByExample(PriceInfoExample example);

    int deleteByExample(PriceInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PriceInfo record);

    int insertOrUpdate(PriceInfo record);

    int insertOrUpdateSelective(PriceInfo record);

    int insertSelective(PriceInfo record);

    List<PriceInfo> selectByExample(PriceInfoExample example);

    PriceInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(PriceInfo record,PriceInfoExample example);

    int updateByExample(PriceInfo record,PriceInfoExample example);

    int updateByPrimaryKeySelective(PriceInfo record);

    int updateByPrimaryKey(PriceInfo record);

    List<PriceInfo> selectAllByIdIn(Collection<Long> idCollection);

    int deleteByIdIn(Collection<Long> idCollection);

    List<PriceInfo> selectAllByCode(String code);

    List<PriceInfo> selectAllByCodeIn(Collection<String> codeCollection);

    int updateBatch(List<PriceInfo> list);

    int batchInsert(List<PriceInfo> list);

}
