package org.myproject.boot.application.admin.db.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.myproject.boot.application.admin.db.pojo.SysUserRole;

@Mapper
public interface SysUserRoleMapper extends BaseMapper<SysUserRole>, tk.mybatis.mapper.common.Mapper<SysUserRole> {
}