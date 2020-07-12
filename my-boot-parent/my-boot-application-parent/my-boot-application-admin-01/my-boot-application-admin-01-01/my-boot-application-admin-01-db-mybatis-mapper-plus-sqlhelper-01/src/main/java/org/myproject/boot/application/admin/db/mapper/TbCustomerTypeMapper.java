package org.myproject.boot.application.admin.db.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.myproject.boot.application.admin.db.pojo.TbCustomerType;
import org.myproject.boot.application.admin.db.pojo.TbCustomerTypeExample;

import java.util.List;

@Mapper
public interface TbCustomerTypeMapper extends BaseMapper<TbCustomerType>, tk.mybatis.mapper.common.Mapper<TbCustomerType> {
    long countByExample(TbCustomerTypeExample example);

    int deleteByExample(TbCustomerTypeExample example);

    List<TbCustomerType> selectByExample(TbCustomerTypeExample example);

    int updateByExampleSelective(@Param("record") TbCustomerType record, @Param("example") TbCustomerTypeExample example);

    int updateByExample(@Param("record") TbCustomerType record, @Param("example") TbCustomerTypeExample example);
}