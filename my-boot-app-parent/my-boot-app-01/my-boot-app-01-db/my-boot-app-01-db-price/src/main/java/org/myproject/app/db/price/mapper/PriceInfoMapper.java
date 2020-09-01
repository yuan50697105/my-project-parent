package org.myproject.app.db.price.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.myproject.app.db.price.pojo.PriceInfo;
import org.myproject.app.db.price.pojo.PriceInfoExample;

import java.util.Collection;
import java.util.List;

@Mapper
public interface PriceInfoMapper {
    long countByExample(PriceInfoExample example);

    int deleteByExample(PriceInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PriceInfo record);

    int insertOrUpdate(PriceInfo record);

    int insertOrUpdateSelective(PriceInfo record);

    int insertSelective(PriceInfo record);

    List<PriceInfo> selectByExample(PriceInfoExample example);

    PriceInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PriceInfo record, @Param("example") PriceInfoExample example);

    int updateByExample(@Param("record") PriceInfo record, @Param("example") PriceInfoExample example);

    int updateByPrimaryKeySelective(PriceInfo record);

    int updateByPrimaryKey(PriceInfo record);

    List<PriceInfo> selectAllByIdIn(@Param("idCollection") Collection<Long> idCollection);

    int deleteByIdIn(@Param("idCollection") Collection<Long> idCollection);

    List<PriceInfo> selectAllByCode(@Param("code") String code);

    List<PriceInfo> selectAllByCodeIn(@Param("codeCollection") Collection<String> codeCollection);

    int updateBatch(List<PriceInfo> list);

    int batchInsert(@Param("list") List<PriceInfo> list);
}