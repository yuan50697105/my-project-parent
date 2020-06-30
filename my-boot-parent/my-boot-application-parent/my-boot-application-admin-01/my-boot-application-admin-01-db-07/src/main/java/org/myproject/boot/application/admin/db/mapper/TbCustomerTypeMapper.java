package org.myproject.boot.application.admin.db.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.myproject.boot.application.admin.db.pojo.TbCustomerType;
import org.myproject.boot.application.admin.db.pojo.TbCustomerTypeExample;

@Mapper
public interface TbCustomerTypeMapper extends BaseMapper<TbCustomerType> {
    long countByExample(TbCustomerTypeExample example);

    int deleteByExample(TbCustomerTypeExample example);

    List<TbCustomerType> selectByExample(TbCustomerTypeExample example);

    int updateByExampleSelective(@Param("record") TbCustomerType record, @Param("example") TbCustomerTypeExample example);

    int updateByExample(@Param("record") TbCustomerType record, @Param("example") TbCustomerTypeExample example);
}