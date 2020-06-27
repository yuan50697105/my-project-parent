package org.myproject.boot.application.admin.db.mapper.plus.sqlhelper.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.myproject.boot.application.admin.db.mapper.plus.sqlhelper.pojo.SysUser;
import org.myproject.boot.application.admin.db.mapper.plus.sqlhelper.pojo.SysUserExample;

import java.util.List;

@Mapper
public interface SysUserMapper extends BaseMapper<SysUser>, tk.mybatis.mapper.common.Mapper<SysUser> {
    long countByExample(SysUserExample example);

    int deleteByExample(SysUserExample example);

    List<SysUser> selectByExample(SysUserExample example);

    int updateByExampleSelective(@Param("record") SysUser record, @Param("example") SysUserExample example);

    int updateByExample(@Param("record") SysUser record, @Param("example") SysUserExample example);
}