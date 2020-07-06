package org.myproject.boot.application.admin.db.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.myproject.boot.application.admin.db.pojo.TbCustomerLog;

@Mapper
public interface TbCustomerLogMapper extends BaseMapper<TbCustomerLog>, tk.mybatis.mapper.common.Mapper<TbCustomerLog> {
}