package org.myproject.boot.application.admin.db.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.myproject.boot.application.admin.db.pojo.TbSysUser;

@Mapper
public interface TbSysUserMapper extends tk.mybatis.mapper.common.Mapper<TbSysUser> {
}