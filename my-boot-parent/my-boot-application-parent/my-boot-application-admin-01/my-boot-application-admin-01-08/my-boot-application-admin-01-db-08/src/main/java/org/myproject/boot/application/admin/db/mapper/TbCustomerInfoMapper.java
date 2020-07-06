package org.myproject.boot.application.admin.db.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.myproject.boot.application.admin.db.pojo.TbCustomerInfo;

@Mapper
public interface TbCustomerInfoMapper extends BaseMapper<TbCustomerInfo>, tk.mybatis.mapper.common.Mapper<TbCustomerInfo> {
}