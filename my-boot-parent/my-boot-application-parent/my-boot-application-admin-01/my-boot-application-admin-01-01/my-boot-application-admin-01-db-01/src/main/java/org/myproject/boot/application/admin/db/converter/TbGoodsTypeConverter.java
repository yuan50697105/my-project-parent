package org.myproject.boot.application.admin.db.converter;

import org.mapstruct.Mapper;
import org.myproject.boot.application.admin.db.pojo.TbGoodsType;
import org.myproject.boot.application.admin.db.pojo.TbGoodsTypeVo;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-25 23:16
 */
@Mapper(componentModel = "spring")
public interface TbGoodsTypeConverter {
    TbGoodsType voToPo(TbGoodsTypeVo vo);
}
