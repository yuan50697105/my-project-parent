package org.myproject.boot.application.goods.db.service;

import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.goods.db.pojo.TbGoodsInfoExample;
import java.util.List;
import org.myproject.boot.application.goods.db.pojo.TbGoodsInfo;
import com.baomidou.mybatisplus.extension.service.IService;
import org.myproject.boot.application.goods.db.pojo.TbGoodsInfoQuery;

public interface TbGoodsInfoService extends IService<TbGoodsInfo>{


    long countByExample(TbGoodsInfoExample example);

    int deleteByExample(TbGoodsInfoExample example);

    List<TbGoodsInfo> selectByExample(TbGoodsInfoExample example);

    int updateByExampleSelective(TbGoodsInfo record,TbGoodsInfoExample example);

    int updateByExample(TbGoodsInfo record,TbGoodsInfoExample example);

    List<TbGoodsInfo> selectByQuery(TbGoodsInfoQuery goodsInfoQuery);

    PageInfo<TbGoodsInfo> selectByQuery(TbGoodsInfoQuery goodsInfoQuery, int page, int limit);
}
