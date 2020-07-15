package org.myproject.boot.application.admin.db.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.myproject.boot.application.admin.db.pojo.TbGoodsInfo;
import org.myproject.boot.application.admin.db.pojo.TbGoodsInfoExample;

import java.util.List;

@Mapper
public interface TbGoodsInfoMapper extends BaseMapper<TbGoodsInfo> {
    long countByExample(TbGoodsInfoExample example);

    int deleteByExample(TbGoodsInfoExample example);

    List<TbGoodsInfo> selectByExample(TbGoodsInfoExample example);

    int updateByExampleSelective(@Param("record") TbGoodsInfo record, @Param("example") TbGoodsInfoExample example);

    int updateByExample(@Param("record") TbGoodsInfo record, @Param("example") TbGoodsInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbGoodsInfo record);

    int insertSelective(TbGoodsInfo record);

    TbGoodsInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbGoodsInfo record);

    int updateByPrimaryKey(TbGoodsInfo record);
}