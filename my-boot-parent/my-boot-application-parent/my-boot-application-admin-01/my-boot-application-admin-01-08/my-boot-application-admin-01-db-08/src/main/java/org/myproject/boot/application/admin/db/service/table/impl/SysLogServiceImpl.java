package org.myproject.boot.application.admin.db.service.table.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.myproject.boot.application.admin.db.mapper.SysLogMapper;
import org.myproject.boot.application.admin.db.pojo.SysLog;
import org.myproject.boot.application.admin.db.service.table.SysLogService;
@Service
public class SysLogServiceImpl extends ServiceImpl<SysLogMapper, SysLog> implements SysLogService{

}
