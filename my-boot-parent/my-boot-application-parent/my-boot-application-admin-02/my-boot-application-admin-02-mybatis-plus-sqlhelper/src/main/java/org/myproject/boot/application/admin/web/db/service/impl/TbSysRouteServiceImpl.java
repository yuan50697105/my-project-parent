package org.myproject.boot.application.admin.web.db.service.impl;

import org.myproject.boot.application.admin.web.db.mapper.TbSysRouteMapper;
import org.myproject.boot.application.admin.web.db.pojo.TbSysRoute;
import org.myproject.boot.application.admin.web.db.pojo.TbSysRouteExample;
import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.myproject.boot.application.admin.web.db.service.TbSysRouteService;
@Service
public class TbSysRouteServiceImpl extends ServiceImpl<TbSysRouteMapper, TbSysRoute> implements TbSysRouteService{

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
    public int updateByExampleSelective(TbSysRoute record,TbSysRouteExample example) {
        return baseMapper.updateByExampleSelective(record,example);
    }
    @Override
    public int updateByExample(TbSysRoute record,TbSysRouteExample example) {
        return baseMapper.updateByExample(record,example);
    }

    @Override
    public void removeByRoleId(Long roleId) {
        remove(lambdaQuery().eq(TbSysRoute::getRoleId, roleId));
    }
}
