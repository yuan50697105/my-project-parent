package org.myproject.boot.application.admin.db.service.table.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import org.myproject.boot.application.admin.db.mapper.SysRouteMapper;
import java.util.List;
import org.myproject.boot.application.admin.db.pojo.SysRoute;
import org.myproject.boot.application.admin.db.pojo.SysRouteExample;
import org.myproject.boot.application.admin.db.service.table.SysRouteService;

@Service
public class SysRouteServiceImpl implements SysRouteService {

    @Resource
    private SysRouteMapper sysRouteMapper;

    @Override
    public long countByExample(SysRouteExample example) {
        return sysRouteMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(SysRouteExample example) {
        return sysRouteMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return sysRouteMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SysRoute record) {
        return sysRouteMapper.insert(record);
    }

    @Override
    public int insertSelective(SysRoute record) {
        return sysRouteMapper.insertSelective(record);
    }

    @Override
    public List<SysRoute> selectByExample(SysRouteExample example) {
        return sysRouteMapper.selectByExample(example);
    }

    @Override
    public SysRoute selectByPrimaryKey(Long id) {
        return sysRouteMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(SysRoute record, SysRouteExample example) {
        return sysRouteMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(SysRoute record, SysRouteExample example) {
        return sysRouteMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(SysRoute record) {
        return sysRouteMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SysRoute record) {
        return sysRouteMapper.updateByPrimaryKey(record);
    }

}

