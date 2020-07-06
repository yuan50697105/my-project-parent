package org.myproject.boot.application.admin.db.service.table;

import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.pojo.TbGoodsInfo;
import org.myproject.boot.application.admin.db.pojo.TbGoodsInfoQuery;

import java.util.List;

public interface TbGoodsInfoService {


    PageInfo<TbGoodsInfo> selectByQuery(TbGoodsInfoQuery query, int page, int size);

    List<TbGoodsInfo> selectByQuery(TbGoodsInfoQuery query);

    void insert(TbGoodsInfo convert);

    void updateSelective(TbGoodsInfo convert);

    void deleteByExample(Object id);

    void deleteById(Long id);
}


