package org.myproject.boot.application.admin.db.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.myproject.boot.application.admin.db.mapper.TbSysRouteMapper;
import org.myproject.boot.application.admin.db.pojo.TbSysRoute;
import org.myproject.boot.application.admin.db.pojo.TbSysRouteExample;
import org.myproject.boot.application.admin.db.service.TbSysRouteService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbSysRouteServiceImpl extends ServiceImpl<TbSysRouteMapper, TbSysRoute> implements TbSysRouteService {

    @Override
    public long countByExample(TbSysRouteExample example) {
        return baseMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TbSysRouteExample example) {
        return baseMapper.deleteByExample(example);
    }

    @Override
    public List<TbSysRoute> selectByExample(TbSysRouteExample example) {
        return baseMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(TbSysRoute record, TbSysRouteExample example) {
        return baseMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(TbSysRoute record, TbSysRouteExample example) {
        return baseMapper.updateByExample(record, example);
    }
}
