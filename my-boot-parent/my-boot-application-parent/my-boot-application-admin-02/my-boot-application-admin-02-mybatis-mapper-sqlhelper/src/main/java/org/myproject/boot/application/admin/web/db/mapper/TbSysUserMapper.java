package org.myproject.boot.application.admin.web.db.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.myproject.boot.application.admin.web.db.pojo.TbSysUser;

@Mapper
public interface TbSysUserMapper extends tk.mybatis.mapper.common.Mapper<TbSysUser> {
}