package org.myproject.boot.application.admin.db.converter;

import com.github.pagehelper.PageInfo;
import org.mapstruct.Mapper;
import org.myproject.boot.application.admin.db.pojo.TbGoodsInfo;
import org.myproject.boot.application.admin.db.pojo.TbGoodsInfoQuery;
import org.myproject.boot.application.admin.db.pojo.TbGoodsInfoVo;
import org.myproject.boot.application.admin.pojo.GoodsInfo;
import org.myproject.boot.application.admin.pojo.GoodsInfoQuery;
import org.myproject.boot.application.admin.pojo.GoodsInfoVo;

import java.util.List;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-25 23:16
 */
@Mapper(componentModel = "spring")
public interface TbGoodsInfoConverter {
    TbGoodsInfo voToPo(TbGoodsInfoVo vo);

    TbGoodsInfoQuery convert(GoodsInfoQuery query);

    PageInfo<GoodsInfo> convert(PageInfo<TbGoodsInfo> pageInfo);

    List<GoodsInfo> convert(List<TbGoodsInfo> list);

    TbGoodsInfo convert(GoodsInfoVo vo);
}
