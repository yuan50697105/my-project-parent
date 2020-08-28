package org.myproject.app.member.service;

import java.util.List;
import org.myproject.app.member.pojo.MemberInfoExample;
import org.myproject.app.member.pojo.MemberInfo;
public interface MemberInfoService{


    long countByExample(MemberInfoExample example);

    int deleteByExample(MemberInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MemberInfo record);

    int insertSelective(MemberInfo record);

    List<MemberInfo> selectByExample(MemberInfoExample example);

    MemberInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(MemberInfo record,MemberInfoExample example);

    int updateByExample(MemberInfo record,MemberInfoExample example);

    int updateByPrimaryKeySelective(MemberInfo record);

    int updateByPrimaryKey(MemberInfo record);

    List<MemberInfo> selectAllByIdIn(Collection<Long> idCollection);

    int deleteByIdIn(Collection<Long> idCollection);

}
