package org.myproject.boot.application.admin.db.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.myproject.boot.application.admin.db.pojo.TbCustomerInfo;

@Mapper
public interface TbCustomerInfoMapper extends tk.mybatis.mapper.common.Mapper<TbCustomerInfo> {
}