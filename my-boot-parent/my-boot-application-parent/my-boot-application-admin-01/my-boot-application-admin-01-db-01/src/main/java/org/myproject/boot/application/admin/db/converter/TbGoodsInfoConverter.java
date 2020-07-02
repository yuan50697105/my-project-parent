package org.myproject.boot.application.admin.db.converter;

import org.mapstruct.Mapper;
import org.myproject.boot.application.admin.db.pojo.TbGoodsInfo;
import org.myproject.boot.application.admin.db.pojo.TbGoodsInfoVo;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-25 23:16
 */
@Mapper(componentModel = "spring")
public interface TbGoodsInfoConverter {
    TbGoodsInfo voToPo(TbGoodsInfoVo vo);
}