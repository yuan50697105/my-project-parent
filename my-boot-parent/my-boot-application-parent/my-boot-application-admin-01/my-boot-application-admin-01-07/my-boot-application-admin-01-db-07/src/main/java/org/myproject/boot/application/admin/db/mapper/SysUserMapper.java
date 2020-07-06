package org.myproject.boot.application.admin.db.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.myproject.boot.application.admin.db.pojo.SysUser;

@Mapper
public interface SysUserMapper extends BaseMapper<SysUser>, tk.mybatis.mapper.common.Mapper<SysUser> {
}