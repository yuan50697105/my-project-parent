package org.myproject.boot.application.admin.db.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.myproject.boot.application.admin.db.pojo.TbSysUser;
import org.myproject.boot.application.admin.db.pojo.TbSysUserExample;

import java.util.List;

@Mapper
public interface TbSysUserMapper extends BaseMapper<TbSysUser> {
    long countByExample(TbSysUserExample example);

    int deleteByExample(TbSysUserExample example);

    List<TbSysUser> selectByExample(TbSysUserExample example);

    int updateByExampleSelective(@Param("record") TbSysUser record, @Param("example") TbSysUserExample example);

    int updateByExample(@Param("record") TbSysUser record, @Param("example") TbSysUserExample example);
}