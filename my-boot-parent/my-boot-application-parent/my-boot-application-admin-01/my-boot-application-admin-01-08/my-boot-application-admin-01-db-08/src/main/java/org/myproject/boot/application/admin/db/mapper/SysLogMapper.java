package org.myproject.boot.application.admin.db.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.myproject.boot.application.admin.db.pojo.SysLog;

@Mapper
public interface SysLogMapper extends BaseMapper<SysLog>, tk.mybatis.mapper.common.Mapper<SysLog> {
}