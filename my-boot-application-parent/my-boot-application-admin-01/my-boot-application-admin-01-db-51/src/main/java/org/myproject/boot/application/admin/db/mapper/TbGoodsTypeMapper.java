package org.myproject.boot.application.admin.db.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.myproject.boot.application.admin.db.pojo.TbGoodsType;
import org.myproject.boot.application.admin.db.pojo.TbGoodsTypeExample;

import java.util.List;

@Mapper
public interface TbGoodsTypeMapper extends BaseMapper<TbGoodsType> {
    long countByExample(TbGoodsTypeExample example);

    int deleteByExample(TbGoodsTypeExample example);

    List<TbGoodsType> selectByExample(TbGoodsTypeExample example);

    int updateByExampleSelective(@Param("record") TbGoodsType record, @Param("example") TbGoodsTypeExample example);

    int updateByExample(@Param("record") TbGoodsType record, @Param("example") TbGoodsTypeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbGoodsType record);

    int insertSelective(TbGoodsType record);

    TbGoodsType selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbGoodsType record);

    int updateByPrimaryKey(TbGoodsType record);
}