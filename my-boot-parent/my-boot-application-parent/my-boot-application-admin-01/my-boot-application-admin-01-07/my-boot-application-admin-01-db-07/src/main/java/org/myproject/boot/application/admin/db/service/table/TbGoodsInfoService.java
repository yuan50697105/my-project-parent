package org.myproject.boot.application.admin.db.service.table;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.pojo.TbGoodsInfo;
import com.baomidou.mybatisplus.extension.service.IService;
import org.myproject.boot.application.admin.db.pojo.TbGoodsInfoQuery;

import java.util.List;

public interface TbGoodsInfoService extends IService<TbGoodsInfo>{


    PageInfo<TbGoodsInfo> selectByQuery(TbGoodsInfoQuery query, int page, int size);

    List<TbGoodsInfo> selectByQuery(TbGoodsInfoQuery query);
}
