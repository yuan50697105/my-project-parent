package org.myproject.app.member.mapper;

import java.util.Collection;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.myproject.app.member.pojo.MemberInfo;
import org.myproject.app.member.pojo.MemberInfoExample;

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