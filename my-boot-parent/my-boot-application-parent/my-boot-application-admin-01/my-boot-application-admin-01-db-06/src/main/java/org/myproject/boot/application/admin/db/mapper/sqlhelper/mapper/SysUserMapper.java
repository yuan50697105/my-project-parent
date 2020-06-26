package org.myproject.boot.application.admin.db.mapper.sqlhelper.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.myproject.boot.application.admin.db.mapper.sqlhelper.pojo.SysUser;

@Mapper
public interface SysUserMapper extends tk.mybatis.mapper.common.Mapper<SysUser> {
}