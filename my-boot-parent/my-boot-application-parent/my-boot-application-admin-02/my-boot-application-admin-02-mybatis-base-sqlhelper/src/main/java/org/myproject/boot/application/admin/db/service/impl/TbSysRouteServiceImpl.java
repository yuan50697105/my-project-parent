package org.myproject.boot.application.admin.db.service.impl;

import org.myproject.boot.application.admin.db.mapper.TbSysRouteMapper;
import org.myproject.boot.application.admin.db.pojo.TbSysRoute;
import org.myproject.boot.application.admin.db.pojo.TbSysRouteExample;import org.myproject.boot.application.admin.db.service.TbSysRouteService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TbSysRouteServiceImpl implements TbSysRouteService {

    @Resource
    private TbSysRouteMapper tbSysRouteMapper;

    @Override
    public List<TbSysRoute> selectAll() {
        return tbSysRouteMapper.selectAll();
    }

    @Override
    public int insert(TbSysRoute sysRoute) {
        return tbSysRouteMapper.insert(sysRoute);
    }

    @Override
    public long countByExample(TbSysRouteExample example) {
        return tbSysRouteMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TbSysRouteExample example) {
        return tbSysRouteMapper.deleteByExample(example);
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
    public int updateByExampleSelective(TbSysRoute record, TbSysRouteExample example) {
        return tbSysRouteMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(TbSysRoute record, TbSysRouteExample example) {
        return tbSysRouteMapper.updateByExample(record, example);
    }

    @Override
    public int batchInsert(List<TbSysRoute> list) {
        return tbSysRouteMapper.batchInsert(list);
    }
}


