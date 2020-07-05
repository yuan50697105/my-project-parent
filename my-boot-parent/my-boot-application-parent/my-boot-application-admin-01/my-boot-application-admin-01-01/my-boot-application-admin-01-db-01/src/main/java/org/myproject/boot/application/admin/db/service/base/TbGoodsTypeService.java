package org.myproject.boot.application.admin.db.service.base;

import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.pojo.TbGoodsType;
import org.myproject.boot.application.admin.db.pojo.TbGoodsTypeExample;
import org.myproject.boot.application.admin.db.pojo.TbGoodsTypeQuery;

import java.util.List;

public interface TbGoodsTypeService {


    long countByExample(TbGoodsTypeExample example);

    int deleteByExample(TbGoodsTypeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbGoodsType record);

    int insertSelective(TbGoodsType record);

    List<TbGoodsType> selectByExample(TbGoodsTypeExample example);

    TbGoodsType selectByPrimaryKey(Long id);

    int updateByExampleSelective(TbGoodsType record, TbGoodsTypeExample example);

    int updateByExample(TbGoodsType record, TbGoodsTypeExample example);

    int updateByPrimaryKeySelective(TbGoodsType record);

    int updateByPrimaryKey(TbGoodsType record);

    PageInfo<TbGoodsType> selectByQuery(TbGoodsTypeQuery query, int page, int size);

    List<TbGoodsType> selectByQuery(TbGoodsTypeQuery query);
}
