package org.myproject.boot.application.price.db.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.myproject.boot.application.price.db.pojo.TbPriceInfo;
import org.myproject.boot.application.price.db.pojo.TbPriceInfoExample;

@Mapper
public interface TbPriceInfoMapper extends BaseMapper<TbPriceInfo> {
    long countByExample(TbPriceInfoExample example);

    int deleteByExample(TbPriceInfoExample example);

    List<TbPriceInfo> selectByExample(TbPriceInfoExample example);

    int updateByExampleSelective(@Param("record") TbPriceInfo record, @Param("example") TbPriceInfoExample example);

    int updateByExample(@Param("record") TbPriceInfo record, @Param("example") TbPriceInfoExample example);
}