package org.myproject.boot.application.admin.db.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.myproject.boot.application.admin.db.pojo.TbSysLog;
import org.myproject.boot.application.admin.db.pojo.TbSysLogExample;

import java.util.List;

public interface TbSysLogService extends IService<TbSysLog> {


    long countByExample(TbSysLogExample example);

    int deleteByExample(TbSysLogExample example);

    List<TbSysLog> selectByExample(TbSysLogExample example);

    int updateByExampleSelective(TbSysLog record, TbSysLogExample example);

    int updateByExample(TbSysLog record, TbSysLogExample example);

}

