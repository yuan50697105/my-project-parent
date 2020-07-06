package org.myproject.boot.application.admin.db.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.myproject.boot.application.admin.db.pojo.SysRole;

@Mapper
public interface SysRoleMapper extends BaseMapper<SysRole>, tk.mybatis.mapper.common.Mapper<SysRole> {
}