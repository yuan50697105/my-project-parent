package org.myproject.boot.application.admin.db.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.myproject.boot.application.admin.db.pojo.SysUserRole;
import org.myproject.boot.application.admin.db.pojo.SysUserRoleExample;

import java.util.List;

@Mapper
public interface SysUserRoleMapper extends BaseMapper<SysUserRole>, tk.mybatis.mapper.common.Mapper<SysUserRole> {
    long countByExample(SysUserRoleExample example);

    int deleteByExample(SysUserRoleExample example);

    List<SysUserRole> selectByExample(SysUserRoleExample example);

    int updateByExampleSelective(@Param("record") SysUserRole record, @Param("example") SysUserRoleExample example);

    int updateByExample(@Param("record") SysUserRole record, @Param("example") SysUserRoleExample example);
}