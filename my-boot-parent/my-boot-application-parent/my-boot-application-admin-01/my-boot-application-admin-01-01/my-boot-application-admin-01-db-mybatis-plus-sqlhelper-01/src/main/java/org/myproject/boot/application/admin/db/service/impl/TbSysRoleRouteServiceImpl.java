package org.myproject.boot.application.admin.db.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.myproject.boot.application.admin.db.mapper.TbSysRoleRouteMapper;
import org.myproject.boot.application.admin.db.pojo.TbSysRoleRoute;
import org.myproject.boot.application.admin.db.pojo.TbSysRoleRouteExample;
import org.myproject.boot.application.admin.db.service.TbSysRoleRouteService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbSysRoleRouteServiceImpl extends ServiceImpl<TbSysRoleRouteMapper, TbSysRoleRoute> implements TbSysRoleRouteService {

    @Override
    public long countByExample(TbSysRoleRouteExample example) {
        return baseMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TbSysRoleRouteExample example) {
        return baseMapper.deleteByExample(example);
    }

    @Override
    public List<TbSysRoleRoute> selectByExample(TbSysRoleRouteExample example) {
        return baseMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(TbSysRoleRoute record, TbSysRoleRouteExample example) {
        return baseMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(TbSysRoleRoute record, TbSysRoleRouteExample example) {
        return baseMapper.updateByExample(record, example);
    }
}
