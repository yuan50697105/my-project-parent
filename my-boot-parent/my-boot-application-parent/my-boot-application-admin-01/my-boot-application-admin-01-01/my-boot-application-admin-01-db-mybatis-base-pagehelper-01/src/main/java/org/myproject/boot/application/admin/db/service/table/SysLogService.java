package org.myproject.boot.application.admin.db.service.table;

import org.myproject.boot.application.admin.db.pojo.SysLog;
import org.myproject.boot.application.admin.db.pojo.SysLogExample;

import java.util.List;

public interface SysLogService {


    long countByExample(SysLogExample example);

    int deleteByExample(SysLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysLog record);

    int insertSelective(SysLog record);

    List<SysLog> selectByExample(SysLogExample example);

    SysLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(SysLog record, SysLogExample example);

    int updateByExample(SysLog record, SysLogExample example);

    int updateByPrimaryKeySelective(SysLog record);

    int updateByPrimaryKey(SysLog record);

}
