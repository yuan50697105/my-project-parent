package org.myproject.boot.application.admin.db.service.table;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.pojo.TbGoodsType;
import com.baomidou.mybatisplus.extension.service.IService;
import org.myproject.boot.application.admin.db.pojo.TbGoodsTypeQuery;

import java.util.List;

public interface TbGoodsTypeService extends IService<TbGoodsType>{


    PageInfo<TbGoodsType> selectByQuery(TbGoodsTypeQuery query, int page, int size);

    List<TbGoodsType> selectByQuery(TbGoodsTypeQuery query);
}
