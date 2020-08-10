package org.myproject.boot.application.goods.db.service;

import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.goods.db.pojo.TbGoodsInfo;
import org.myproject.boot.application.goods.db.pojo.TbGoodsInfoExample;
import org.myproject.boot.application.goods.db.pojo.TbGoodsInfoQuery;

import java.util.List;

public interface TbGoodsInfoService {


    long countByExample(TbGoodsInfoExample example);

    int deleteByExample(TbGoodsInfoExample example);

    int insert(TbGoodsInfo record);

    int insertSelective(TbGoodsInfo record);

    List<TbGoodsInfo> selectByExample(TbGoodsInfoExample example);

    int updateByExampleSelective(TbGoodsInfo record, TbGoodsInfoExample example);

    int updateByExample(TbGoodsInfo record, TbGoodsInfoExample example);

    int deleteByPrimaryKey(Long id);

    TbGoodsInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbGoodsInfo record);

    int updateByPrimaryKey(TbGoodsInfo record);

    List<TbGoodsInfo> selectByQuery(TbGoodsInfoQuery query);

    PageInfo<TbGoodsInfo> selectByQuery(TbGoodsInfoQuery query, int page, int limit);
}


