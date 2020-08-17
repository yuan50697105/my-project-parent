package org.myproject.boot.application.price.db.service;

import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.price.commons.pojo.PriceInfoQuery;
import org.myproject.boot.application.price.db.pojo.TbPriceInfo;
import org.myproject.boot.application.price.db.pojo.TbPriceInfoQuery;

public interface TbPriceInfoService {


    TbPriceInfo selectByPrimaryKey(Long id);

    PageInfo<TbPriceInfo> selectByQuery(TbPriceInfoQuery priceInfoQuery, int page, int limit);

    int updateByPrimaryKeySelective(TbPriceInfo priceInfo);

    int insert(TbPriceInfo priceInfo);

    int deleteByPrimaryKey(Long id);
}

