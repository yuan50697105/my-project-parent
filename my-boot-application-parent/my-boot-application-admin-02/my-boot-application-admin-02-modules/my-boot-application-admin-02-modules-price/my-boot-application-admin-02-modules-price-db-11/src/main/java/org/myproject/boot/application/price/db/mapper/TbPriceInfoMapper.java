package org.myproject.boot.application.price.db.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.myproject.boot.application.price.db.pojo.TbPriceInfo;

@Mapper
public interface TbPriceInfoMapper extends tk.mybatis.mapper.common.Mapper<TbPriceInfo> {
}