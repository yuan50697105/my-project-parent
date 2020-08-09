package org.myproject.boot.application.goods.db.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.goods.db.pojo.TbGoodsType;
import org.myproject.boot.application.goods.db.pojo.TbGoodsTypeExample;
import org.myproject.boot.application.goods.db.pojo.TbGoodsTypeQuery;

public interface TbGoodsTypeService{


    long countByExample(TbGoodsTypeExample example);

    int deleteByExample(TbGoodsTypeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbGoodsType record);

    int insertSelective(TbGoodsType record);

    List<TbGoodsType> selectByExample(TbGoodsTypeExample example);

    TbGoodsType selectByPrimaryKey(Long id);

    int updateByExampleSelective(TbGoodsType record,TbGoodsTypeExample example);

    int updateByExample(TbGoodsType record,TbGoodsTypeExample example);

    int updateByPrimaryKeySelective(TbGoodsType record);

    int updateByPrimaryKey(TbGoodsType record);

    List<TbGoodsType> selectByQuery(TbGoodsTypeQuery queryDTO);

    PageInfo<TbGoodsType> selectByQuery(TbGoodsTypeQuery query, int page, int limit);
}
