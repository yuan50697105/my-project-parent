package org.myproject.boot.application.admin.db.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.myproject.boot.application.admin.db.pojo.TbCustomerInfo;
import org.myproject.boot.application.admin.db.pojo.TbCustomerInfoExample;

import java.util.List;

@Mapper
public interface TbCustomerInfoMapper extends BaseMapper<TbCustomerInfo>, tk.mybatis.mapper.common.Mapper<TbCustomerInfo> {
    long countByExample(TbCustomerInfoExample example);

    int deleteByExample(TbCustomerInfoExample example);

    List<TbCustomerInfo> selectByExample(TbCustomerInfoExample example);

    int updateByExampleSelective(@Param("record") TbCustomerInfo record, @Param("example") TbCustomerInfoExample example);

    int updateByExample(@Param("record") TbCustomerInfo record, @Param("example") TbCustomerInfoExample example);
}