package org.myproject.boot.application.admin.db.service.impl;

import org.myproject.boot.application.admin.db.mapper.SysLogMapper;
import org.myproject.boot.application.admin.db.pojo.SysLog;
import org.myproject.boot.application.admin.db.pojo.SysLogExample;
import org.myproject.boot.application.admin.db.service.SysLogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysLogServiceImpl implements SysLogService {

    @Resource
    private SysLogMapper sysLogMapper;

    @Override
    public long countByExample(SysLogExample example) {
        return sysLogMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(SysLogExample example) {
        return sysLogMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return sysLogMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SysLog record) {
        return sysLogMapper.insert(record);
    }

    @Override
    public int insertSelective(SysLog record) {
        return sysLogMapper.insertSelective(record);
    }

    @Override
    public List<SysLog> selectByExample(SysLogExample example) {
        return sysLogMapper.selectByExample(example);
    }

    @Override
    public SysLog selectByPrimaryKey(Long id) {
        return sysLogMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(SysLog record, SysLogExample example) {
        return sysLogMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(SysLog record, SysLogExample example) {
        return sysLogMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(SysLog record) {
        return sysLogMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SysLog record) {
        return sysLogMapper.updateByPrimaryKey(record);
    }

}
