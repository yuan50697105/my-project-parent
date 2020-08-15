package org.myproject.boot.application.admin.db.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.myproject.boot.application.admin.db.mapper.TbSysLogMapper;
import org.myproject.boot.application.admin.db.pojo.TbSysLog;
import org.myproject.boot.application.admin.db.pojo.TbSysLogExample;
import org.myproject.boot.application.admin.db.service.TbSysLogService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbSysLogServiceImpl extends ServiceImpl<TbSysLogMapper, TbSysLog> implements TbSysLogService {

    @Override
    public long countByExample(TbSysLogExample example) {
        return baseMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TbSysLogExample example) {
        return baseMapper.deleteByExample(example);
    }

    @Override
    public List<TbSysLog> selectByExample(TbSysLogExample example) {
        return baseMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(TbSysLog record, TbSysLogExample example) {
        return baseMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(TbSysLog record, TbSysLogExample example) {
        return baseMapper.updateByExample(record, example);
    }
}

