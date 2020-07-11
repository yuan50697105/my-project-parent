package org.myproject.boot.application.admin.db.service;

import java.util.List;
import org.myproject.boot.application.admin.db.pojo.TbSysLog;
import org.myproject.boot.application.admin.db.pojo.TbSysLogExample;
import com.baomidou.mybatisplus.extension.service.IService;
public interface TbSysLogService extends IService<TbSysLog>{


    long countByExample(TbSysLogExample example);

    int deleteByExample(TbSysLogExample example);

    List<TbSysLog> selectByExample(TbSysLogExample example);

    int updateByExampleSelective(TbSysLog record,TbSysLogExample example);

    int updateByExample(TbSysLog record,TbSysLogExample example);

}
