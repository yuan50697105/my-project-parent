package org.myproject.boot.application.admin.db.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.myproject.boot.application.admin.db.mapper.SysRouteMapper;
import org.myproject.boot.application.admin.db.pojo.SysRoute;
import org.myproject.boot.application.admin.db.pojo.SysRouteExample;
import org.myproject.boot.application.admin.db.service.SysRouteService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysRouteServiceImpl extends ServiceImpl<SysRouteMapper, SysRoute> implements SysRouteService {

    @Override
    public long countByExample(SysRouteExample example) {
        return baseMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(SysRouteExample example) {
        return baseMapper.deleteByExample(example);
    }

    @Override
    public List<SysRoute> selectByExample(SysRouteExample example) {
        return baseMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(SysRoute record, SysRouteExample example) {
        return baseMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(SysRoute record, SysRouteExample example) {
        return baseMapper.updateByExample(record, example);
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
    public SysRoute selectByPrimaryKey(Long id) {
        return sysRouteMapper.selectByPrimaryKey(id);
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

