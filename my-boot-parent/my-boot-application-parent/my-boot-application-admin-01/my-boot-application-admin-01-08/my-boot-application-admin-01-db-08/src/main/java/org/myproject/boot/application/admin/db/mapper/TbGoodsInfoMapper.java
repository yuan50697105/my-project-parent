package org.myproject.boot.application.admin.db.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.myproject.boot.application.admin.db.pojo.TbGoodsInfo;

@Mapper
public interface TbGoodsInfoMapper extends BaseMapper<TbGoodsInfo>, tk.mybatis.mapper.common.Mapper<TbGoodsInfo> {
}