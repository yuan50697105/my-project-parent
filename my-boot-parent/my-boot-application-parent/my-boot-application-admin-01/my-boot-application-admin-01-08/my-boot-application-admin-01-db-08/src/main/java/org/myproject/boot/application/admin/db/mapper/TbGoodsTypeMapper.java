package org.myproject.boot.application.admin.db.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.myproject.boot.application.admin.db.pojo.TbGoodsType;

@Mapper
public interface TbGoodsTypeMapper extends BaseMapper<TbGoodsType>, tk.mybatis.mapper.common.Mapper<TbGoodsType> {
}