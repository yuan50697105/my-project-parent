package org.myproject.boot.application.admin.db.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.myproject.boot.application.admin.db.pojo.TbOrderItem;
import org.myproject.boot.application.admin.db.pojo.TbOrderItemExample;

import java.util.List;

@Mapper
public interface TbOrderItemMapper extends BaseMapper<TbOrderItem> {
    long countByExample(TbOrderItemExample example);

    int deleteByExample(TbOrderItemExample example);

    List<TbOrderItem> selectByExample(TbOrderItemExample example);

    int updateByExampleSelective(@Param("record") TbOrderItem record, @Param("example") TbOrderItemExample example);

    int updateByExample(@Param("record") TbOrderItem record, @Param("example") TbOrderItemExample example);
}