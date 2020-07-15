package org.myproject.boot.application.admin.db.service;

import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.pojo.TbGoodsType;
import org.myproject.boot.application.admin.db.pojo.TbGoodsTypeQuery;

import java.util.List;

public interface TbGoodsTypeService {


    PageInfo<TbGoodsType> selectByQuery(TbGoodsTypeQuery goodsTypeQuery, int page, int size);

    List<TbGoodsType> selectByQuery(TbGoodsTypeQuery goodsTypeQuery);

    TbGoodsType selectByPrimaryKey(Long id);

    int insert(TbGoodsType record);

    int updateByPrimaryKeySelective(TbGoodsType goodsType);

    int deleteByPrimaryKey(Long id);
}

