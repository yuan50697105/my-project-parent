package org.myproject.boot.application.admin.db.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.pojo.TbGoodsInfo;
import org.myproject.boot.application.admin.db.pojo.TbGoodsInfoExample;
import com.baomidou.mybatisplus.extension.service.IService;
import org.myproject.boot.application.admin.db.pojo.TbGoodsInfoQuery;

public interface TbGoodsInfoService extends IService<TbGoodsInfo>{


    long countByExample(TbGoodsInfoExample example);

    int deleteByExample(TbGoodsInfoExample example);

    List<TbGoodsInfo> selectByExample(TbGoodsInfoExample example);

    int updateByExampleSelective(TbGoodsInfo record,TbGoodsInfoExample example);

    int updateByExample(TbGoodsInfo record,TbGoodsInfoExample example);

    PageInfo<TbGoodsInfo> selectByQuery(TbGoodsInfoQuery goodsInfoQuery, int page, int size);

    List<TbGoodsInfo> selectByQuery(TbGoodsInfoQuery goodsInfoQuery);
}
