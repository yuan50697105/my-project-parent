package org.myproject.boot.application.admin.db.service.base;

import java.util.List;

import com.baomidou.mybatisplus.core.metadata.IPage;
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

    PageInfo<TbGoodsInfo> selectByQuery(TbGoodsInfoQuery query, int page, int size);

    List<TbGoodsInfo> selectByQuery(TbGoodsInfoQuery query);
}
