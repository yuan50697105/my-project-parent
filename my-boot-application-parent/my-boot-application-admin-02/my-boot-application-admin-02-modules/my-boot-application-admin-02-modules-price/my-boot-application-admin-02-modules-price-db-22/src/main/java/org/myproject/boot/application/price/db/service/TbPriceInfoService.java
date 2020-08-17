package org.myproject.boot.application.price.db.service;

import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.price.commons.pojo.PriceInfoQuery;
import org.myproject.boot.application.price.db.pojo.TbPriceInfo;
import java.util.List;
import org.myproject.boot.application.price.db.pojo.TbPriceInfoExample;
import com.baomidou.mybatisplus.extension.service.IService;
import org.myproject.boot.application.price.db.pojo.TbPriceInfoQuery;

public interface TbPriceInfoService extends IService<TbPriceInfo>{


    long countByExample(TbPriceInfoExample example);

    int deleteByExample(TbPriceInfoExample example);

    List<TbPriceInfo> selectByExample(TbPriceInfoExample example);

    int updateByExampleSelective(TbPriceInfo record,TbPriceInfoExample example);

    int updateByExample(TbPriceInfo record,TbPriceInfoExample example);

    PageInfo<TbPriceInfo> selectByQuery(TbPriceInfoQuery priceInfoQuery, int page, int limit);
}
