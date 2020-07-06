package org.myproject.boot.application.admin.db.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.myproject.boot.application.admin.db.pojo.TbCustomerType;

@Mapper
public interface TbCustomerTypeMapper extends BaseMapper<TbCustomerType>, tk.mybatis.mapper.common.Mapper<TbCustomerType> {
}