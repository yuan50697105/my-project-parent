package org.myproject.boot.application.price.db.service;

import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.price.db.pojo.TbPriceInfo;
import java.util.List;
import org.myproject.boot.application.price.db.pojo.TbPriceInfoExample;
import org.myproject.boot.application.price.db.pojo.TbPriceInfoQuery;

public interface TbPriceInfoService {


    long countByExample(TbPriceInfoExample example);

    int deleteByExample(TbPriceInfoExample example);

    int insert(TbPriceInfo record);

    int insertSelective(TbPriceInfo record);

    List<TbPriceInfo> selectByExample(TbPriceInfoExample example);

    int updateByExampleSelective(TbPriceInfo record, TbPriceInfoExample example);

    int updateByExample(TbPriceInfo record, TbPriceInfoExample example);

    int batchInsert(List<TbPriceInfo> list);

    int deleteByPrimaryKey(Long id);

    TbPriceInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbPriceInfo record);

    int updateByPrimaryKey(TbPriceInfo record);

    int updateBatch(List<TbPriceInfo> list);

    PageInfo<TbPriceInfo> selectByQuery(TbPriceInfoQuery query, int page, int limit);
}

