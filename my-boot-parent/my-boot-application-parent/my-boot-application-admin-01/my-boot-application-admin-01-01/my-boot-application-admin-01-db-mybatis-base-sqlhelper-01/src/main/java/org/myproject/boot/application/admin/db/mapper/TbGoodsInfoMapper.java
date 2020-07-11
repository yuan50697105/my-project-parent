package org.myproject.boot.application.admin.db.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.myproject.boot.application.admin.db.pojo.TbGoodsInfo;
import org.myproject.boot.application.admin.db.pojo.TbGoodsInfoExample;

@Mapper
public interface TbGoodsInfoMapper {
    long countByExample(TbGoodsInfoExample example);

    int deleteByExample(TbGoodsInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbGoodsInfo record);

    int insertSelective(TbGoodsInfo record);

    List<TbGoodsInfo> selectByExample(TbGoodsInfoExample example);

    TbGoodsInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbGoodsInfo record, @Param("example") TbGoodsInfoExample example);

    int updateByExample(@Param("record") TbGoodsInfo record, @Param("example") TbGoodsInfoExample example);

    int updateByPrimaryKeySelective(TbGoodsInfo record);

    int updateByPrimaryKey(TbGoodsInfo record);
}