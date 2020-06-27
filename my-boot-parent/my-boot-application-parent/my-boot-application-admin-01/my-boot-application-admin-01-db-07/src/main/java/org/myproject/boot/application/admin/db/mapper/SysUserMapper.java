package org.myproject.boot.application.admin.db.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.myproject.boot.application.admin.db.pojo.SysUser;
import org.myproject.boot.application.admin.db.pojo.SysUserExample;

import java.util.List;

@Mapper
public interface SysUserMapper extends BaseMapper<SysUser>, tk.mybatis.mapper.common.Mapper<SysUser> {
    Long countByExample(SysUserExample example);

    Integer deleteByExample(SysUserExample example);

    List<SysUser> selectByExample(SysUserExample example);

    Integer updateByExampleSelective(@Param("record") SysUser record, @Param("example") SysUserExample example);

    Integer updateByExample(@Param("record") SysUser record, @Param("example") SysUserExample example);
}