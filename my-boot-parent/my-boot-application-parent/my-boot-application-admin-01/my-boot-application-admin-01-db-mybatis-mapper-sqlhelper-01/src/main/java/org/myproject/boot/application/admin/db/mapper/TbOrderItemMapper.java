package org.myproject.boot.application.admin.db.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.myproject.boot.application.admin.db.pojo.TbOrderItem;

@Mapper
public interface TbOrderItemMapper extends tk.mybatis.mapper.common.Mapper<TbOrderItem> {
}