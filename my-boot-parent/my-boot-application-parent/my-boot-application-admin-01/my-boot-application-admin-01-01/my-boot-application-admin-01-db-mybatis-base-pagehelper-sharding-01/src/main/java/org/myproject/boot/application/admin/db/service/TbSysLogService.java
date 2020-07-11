package org.myproject.boot.application.admin.db.service;

import org.myproject.boot.application.admin.db.pojo.TbSysLog;
import org.myproject.boot.application.admin.db.pojo.TbSysLogExample;

import java.util.List;

public interface TbSysLogService{


    long countByExample(TbSysLogExample example);

    int deleteByExample(TbSysLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbSysLog record);

    int insertSelective(TbSysLog record);

    List<TbSysLog> selectByExample(TbSysLogExample example);

    TbSysLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(TbSysLog record,TbSysLogExample example);

    int updateByExample(TbSysLog record,TbSysLogExample example);

    int updateByPrimaryKeySelective(TbSysLog record);

    int updateByPrimaryKey(TbSysLog record);

}
