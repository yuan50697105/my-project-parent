package org.myproject.boot.application.price.db.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.myproject.boot.application.price.db.pojo.TbPriceInfo;
import org.myproject.boot.application.price.db.pojo.TbPriceInfoExample;

@Mapper
public interface TbPriceInfoMapper {
    long countByExample(TbPriceInfoExample example);

    int deleteByExample(TbPriceInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbPriceInfo record);

    int insertSelective(TbPriceInfo record);

    List<TbPriceInfo> selectByExample(TbPriceInfoExample example);

    TbPriceInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbPriceInfo record, @Param("example") TbPriceInfoExample example);

    int updateByExample(@Param("record") TbPriceInfo record, @Param("example") TbPriceInfoExample example);

    int updateByPrimaryKeySelective(TbPriceInfo record);

    int updateByPrimaryKey(TbPriceInfo record);

    int updateBatch(List<TbPriceInfo> list);

    int batchInsert(@Param("list") List<TbPriceInfo> list);
}