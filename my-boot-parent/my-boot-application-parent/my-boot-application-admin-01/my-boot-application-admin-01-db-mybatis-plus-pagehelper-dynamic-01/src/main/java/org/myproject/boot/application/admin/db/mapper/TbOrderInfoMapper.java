package org.myproject.boot.application.admin.db.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.myproject.boot.application.admin.db.pojo.TbOrderInfo;
import org.myproject.boot.application.admin.db.pojo.TbOrderInfoExample;

import java.util.List;

@Mapper
public interface TbOrderInfoMapper extends BaseMapper<TbOrderInfo> {
    long countByExample(TbOrderInfoExample example);

    int deleteByExample(TbOrderInfoExample example);

    List<TbOrderInfo> selectByExample(TbOrderInfoExample example);

    int updateByExampleSelective(@Param("record") TbOrderInfo record, @Param("example") TbOrderInfoExample example);

    int updateByExample(@Param("record") TbOrderInfo record, @Param("example") TbOrderInfoExample example);
}