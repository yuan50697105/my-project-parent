package org.myproject.boot.application.goods.db.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.goods.db.pojo.TbGoodsInfo;
import org.myproject.boot.application.goods.db.pojo.TbGoodsInfoExample;
import org.myproject.boot.application.goods.db.pojo.TbGoodsInfoQuery;

import java.util.List;

public interface TbGoodsInfoService extends IService<TbGoodsInfo> {


    long countByExample(TbGoodsInfoExample example);

    int deleteByExample(TbGoodsInfoExample example);

    List<TbGoodsInfo> selectByExample(TbGoodsInfoExample example);

    int updateByExampleSelective(TbGoodsInfo record, TbGoodsInfoExample example);

    int updateByExample(TbGoodsInfo record, TbGoodsInfoExample example);

    List<TbGoodsInfo> selectByQuery(TbGoodsInfoQuery goodsInfoQuery);

    PageInfo<TbGoodsInfo> selectByQuery(TbGoodsInfoQuery goodsInfoQuery, int page, int limit);
}
