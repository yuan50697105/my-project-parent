package org.myproject.boot.application.admin.db.service.impl;

import org.myproject.boot.application.admin.db.mapper.TbSysLogMapper;
import org.myproject.boot.application.admin.db.pojo.TbSysLog;
import org.myproject.boot.application.admin.db.pojo.TbSysLogExample;
import org.myproject.boot.application.admin.db.service.TbSysLogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TbSysLogServiceImpl implements TbSysLogService {

    @Resource
    private TbSysLogMapper tbSysLogMapper;

    @Override
    public long countByExample(TbSysLogExample example) {
        return tbSysLogMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TbSysLogExample example) {
        return tbSysLogMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return tbSysLogMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TbSysLog record) {
        return tbSysLogMapper.insert(record);
    }

    @Override
    public int insertSelective(TbSysLog record) {
        return tbSysLogMapper.insertSelective(record);
    }

    @Override
    public List<TbSysLog> selectByExample(TbSysLogExample example) {
        return tbSysLogMapper.selectByExample(example);
    }

    @Override
    public TbSysLog selectByPrimaryKey(Long id) {
        return tbSysLogMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(TbSysLog record, TbSysLogExample example) {
        return tbSysLogMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(TbSysLog record, TbSysLogExample example) {
        return tbSysLogMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(TbSysLog record) {
        return tbSysLogMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TbSysLog record) {
        return tbSysLogMapper.updateByPrimaryKey(record);
    }

}
