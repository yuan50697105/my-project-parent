package org.myproject.boot.application.admin.db.service.table;

import java.util.List;

import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.pojo.TbGoodsType;
import org.myproject.boot.application.admin.db.pojo.TbGoodsTypeExample;
import com.baomidou.mybatisplus.extension.service.IService;
import org.myproject.boot.application.admin.db.pojo.TbGoodsTypeQuery;

public interface TbGoodsTypeService extends IService<TbGoodsType>{


    long countByExample(TbGoodsTypeExample example);

    int deleteByExample(TbGoodsTypeExample example);

    List<TbGoodsType> selectByExample(TbGoodsTypeExample example);

    int updateByExampleSelective(TbGoodsType record,TbGoodsTypeExample example);

    int updateByExample(TbGoodsType record,TbGoodsTypeExample example);

    PageInfo<TbGoodsType> selectByQuery(TbGoodsTypeQuery query, int page, int size);

    List<TbGoodsType> selectByQuery(TbGoodsTypeQuery query);
}
