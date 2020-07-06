package org.myproject.boot.application.admin.db.service.table.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.myproject.boot.application.admin.db.mapper.SysRouteMapper;
import org.myproject.boot.application.admin.db.pojo.SysRoute;
import org.myproject.boot.application.admin.db.pojo.SysRouteExample;
import org.myproject.boot.application.admin.db.service.table.SysRouteService;
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
}
