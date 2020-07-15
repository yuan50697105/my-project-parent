package org.myproject.boot.application.admin.db.service;

import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.pojo.TbGoodsInfo;
import org.myproject.boot.application.admin.db.pojo.TbGoodsInfoQuery;

import java.util.List;

public interface TbGoodsInfoService {


    PageInfo<TbGoodsInfo> selectByQuery(TbGoodsInfoQuery goodsInfoQuery, int page, int size);

    List<TbGoodsInfo> selectByQuery(TbGoodsInfoQuery goodsInfoQuery);

    TbGoodsInfo selectByPrimaryKey(Long id);

    int insert(TbGoodsInfo goodsInfo);

    int updateByPrimaryKeySelective(TbGoodsInfo goodsInfo);

    int deleteByPrimaryKey(Long id);
}

