package org.myproject.boot.application.admin.db.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.pojo.TbGoodsInfo;
import org.myproject.boot.application.admin.db.pojo.TbGoodsInfoExample;
import org.myproject.boot.application.admin.db.pojo.TbGoodsInfoQuery;

import java.util.List;

public interface TbGoodsInfoService extends IService<TbGoodsInfo> {


    long countByExample(TbGoodsInfoExample example);

    int deleteByExample(TbGoodsInfoExample example);

    List<TbGoodsInfo> selectByExample(TbGoodsInfoExample example);

    int updateByExampleSelective(TbGoodsInfo record, TbGoodsInfoExample example);

    int updateByExample(TbGoodsInfo record, TbGoodsInfoExample example);

    PageInfo<TbGoodsInfo> selectByQuery(TbGoodsInfoQuery goodsInfoQuery, int page, int size);

    List<TbGoodsInfo> selectByQuery(TbGoodsInfoQuery goodsInfoQuery);
}

