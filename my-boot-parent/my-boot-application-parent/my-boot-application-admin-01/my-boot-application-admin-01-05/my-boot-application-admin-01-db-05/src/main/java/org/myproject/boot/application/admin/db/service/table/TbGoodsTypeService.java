package org.myproject.boot.application.admin.db.service.table;

import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.pojo.TbGoodsType;
import org.myproject.boot.application.admin.db.pojo.TbGoodsTypeQuery;

import java.util.List;

public interface TbGoodsTypeService {


    PageInfo<TbGoodsType> selectByQuery(TbGoodsTypeQuery query, int page, int size);

    List<TbGoodsType> selectByQuery(TbGoodsTypeQuery query);

    void insert(TbGoodsType convert);

    void updateSelective(TbGoodsType convert);

    void deleteByExample(Object example);

    void deleteById(Long id);
}


