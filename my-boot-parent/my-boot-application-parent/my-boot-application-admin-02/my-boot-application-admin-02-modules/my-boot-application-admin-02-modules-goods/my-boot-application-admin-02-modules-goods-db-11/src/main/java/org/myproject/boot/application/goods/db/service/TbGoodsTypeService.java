package org.myproject.boot.application.goods.db.service;

import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.goods.db.pojo.TbGoodsType;
import org.myproject.boot.application.goods.db.pojo.TbGoodsTypeQuery;

import java.util.List;

public interface TbGoodsTypeService{


    TbGoodsType selectByPrimaryKey(Long id);

    void updateByPrimaryKeySelective(TbGoodsType tbGoodsType);

    void insert(TbGoodsType tbGoodsType);

    void deleteByPrimaryKey(Long id);

    List<TbGoodsType> selectByQuery(TbGoodsTypeQuery query);

    PageInfo<TbGoodsType> selectByQuery(TbGoodsTypeQuery query, int page, int limit);
}
