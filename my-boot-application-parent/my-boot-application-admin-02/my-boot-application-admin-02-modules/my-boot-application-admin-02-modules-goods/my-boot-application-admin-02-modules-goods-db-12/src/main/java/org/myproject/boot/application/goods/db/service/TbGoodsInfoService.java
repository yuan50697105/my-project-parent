package org.myproject.boot.application.goods.db.service;

import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.goods.db.pojo.TbGoodsInfo;
import org.myproject.boot.application.goods.db.pojo.TbGoodsInfoQuery;

import java.util.List;

public interface TbGoodsInfoService {


    void insert(TbGoodsInfo infoVo);

    void deleteByPrimaryKey(Long id);

    TbGoodsInfo selectByPrimaryKey(Long id);

    List<TbGoodsInfo> selectByQuery(TbGoodsInfoQuery query);

    PageInfo<TbGoodsInfo> selectByQuery(TbGoodsInfoQuery query, int page, int limit);
}
