package org.myproject.app.db.member.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.myproject.app.db.member.pojo.MemberInfo;
import org.myproject.app.db.member.pojo.MemberInfoExample;

import java.util.Collection;
import java.util.List;

@Mapper
public interface MemberInfoMapper {
    long countByExample(MemberInfoExample example);

    int deleteByExample(MemberInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MemberInfo record);

    int insertSelective(MemberInfo record);

    List<MemberInfo> selectByExample(MemberInfoExample example);

    MemberInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MemberInfo record, @Param("example") MemberInfoExample example);

    int updateByExample(@Param("record") MemberInfo record, @Param("example") MemberInfoExample example);

    int updateByPrimaryKeySelective(MemberInfo record);

    int updateByPrimaryKey(MemberInfo record);

    List<MemberInfo> selectAllByIdIn(@Param("idCollection") Collection<Long> idCollection);

    int deleteByIdIn(@Param("idCollection") Collection<Long> idCollection);
}