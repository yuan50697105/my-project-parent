package org.myproject.boot.application.admin.db.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.myproject.boot.application.admin.db.pojo.TbSysUser;
import org.myproject.boot.application.admin.db.pojo.TbSysUserExample;

import java.util.List;

@Mapper
public interface TbSysUserMapper {
    long countByExample(TbSysUserExample example);

    int deleteByExample(TbSysUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbSysUser record);

    int insertSelective(TbSysUser record);

    List<TbSysUser> selectByExample(TbSysUserExample example);

    TbSysUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbSysUser record, @Param("example") TbSysUserExample example);

    int updateByExample(@Param("record") TbSysUser record, @Param("example") TbSysUserExample example);

    int updateByPrimaryKeySelective(TbSysUser record);

    int updateByPrimaryKey(TbSysUser record);
}