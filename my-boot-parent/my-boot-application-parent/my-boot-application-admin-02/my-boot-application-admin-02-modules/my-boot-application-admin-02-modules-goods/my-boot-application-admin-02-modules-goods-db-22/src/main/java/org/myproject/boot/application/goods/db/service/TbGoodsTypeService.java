package org.myproject.boot.application.goods.db.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.goods.db.pojo.TbGoodsType;
import org.myproject.boot.application.goods.db.pojo.TbGoodsTypeExample;
import com.baomidou.mybatisplus.extension.service.IService;
import org.myproject.boot.application.goods.db.pojo.TbGoodsTypeQuery;

public interface TbGoodsTypeService extends IService<TbGoodsType>{


    long countByExample(TbGoodsTypeExample example);

    int deleteByExample(TbGoodsTypeExample example);

    List<TbGoodsType> selectByExample(TbGoodsTypeExample example);

    int updateByExampleSelective(TbGoodsType record,TbGoodsTypeExample example);

    int updateByExample(TbGoodsType record,TbGoodsTypeExample example);

    List<TbGoodsType> selectByQuery(TbGoodsTypeQuery goodsTypeQuery);

    PageInfo<TbGoodsType> selectByQuery(TbGoodsTypeQuery goodsTypeQuery, int page, int limit);
}
