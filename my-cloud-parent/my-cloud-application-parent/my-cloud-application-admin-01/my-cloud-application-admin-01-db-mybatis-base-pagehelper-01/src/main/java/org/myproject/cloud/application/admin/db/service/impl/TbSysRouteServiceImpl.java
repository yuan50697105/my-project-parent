package org.myproject.cloud.application.admin.db.service.impl;

import org.myproject.cloud.application.admin.db.mapper.TbSysRouteMapper;
import org.myproject.cloud.application.admin.db.pojo.TbSysRoute;
import org.myproject.cloud.application.admin.db.pojo.TbSysRouteExample;
import org.myproject.cloud.application.admin.db.service.TbSysRouteService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TbSysRouteServiceImpl implements TbSysRouteService {

    @Resource
    private TbSysRouteMapper tbSysRouteMapper;

    @Override
    public long countByExample(TbSysRouteExample example) {
        return tbSysRouteMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TbSysRouteExample example) {
        return tbSysRouteMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return tbSysRouteMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TbSysRoute record) {
        return tbSysRouteMapper.insert(record);
    }

    @Override
    public int insertSelective(TbSysRoute record) {
        return tbSysRouteMapper.insertSelective(record);
    }

    @Override
    public List<TbSysRoute> selectByExample(TbSysRouteExample example) {
        return tbSysRouteMapper.selectByExample(example);
    }

    @Override
    public TbSysRoute selectByPrimaryKey(Long id) {
        return tbSysRouteMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(TbSysRoute record, TbSysRouteExample example) {
        return tbSysRouteMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(TbSysRoute record, TbSysRouteExample example) {
        return tbSysRouteMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(TbSysRoute record) {
        return tbSysRouteMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TbSysRoute record) {
        return tbSysRouteMapper.updateByPrimaryKey(record);
    }

}

