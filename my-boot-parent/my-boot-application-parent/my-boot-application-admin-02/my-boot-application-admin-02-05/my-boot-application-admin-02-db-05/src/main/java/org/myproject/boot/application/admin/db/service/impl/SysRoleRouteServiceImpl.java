package org.myproject.boot.application.admin.db.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import org.myproject.boot.application.admin.db.pojo.SysRoleRoute;
import java.util.List;
import org.myproject.boot.application.admin.db.pojo.SysRoleRouteExample;
import org.myproject.boot.application.admin.db.mapper.SysRoleRouteMapper;
import org.myproject.boot.application.admin.db.service.SysRoleRouteService;

@Service
public class SysRoleRouteServiceImpl implements SysRoleRouteService {

    @Resource
    private SysRoleRouteMapper sysRoleRouteMapper;

    @Override
    public long countByExample(SysRoleRouteExample example) {
        return sysRoleRouteMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(SysRoleRouteExample example) {
        return sysRoleRouteMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return sysRoleRouteMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SysRoleRoute record) {
        return sysRoleRouteMapper.insert(record);
    }

    @Override
    public int insertSelective(SysRoleRoute record) {
        return sysRoleRouteMapper.insertSelective(record);
    }

    @Override
    public List<SysRoleRoute> selectByExample(SysRoleRouteExample example) {
        return sysRoleRouteMapper.selectByExample(example);
    }

    @Override
    public SysRoleRoute selectByPrimaryKey(Long id) {
        return sysRoleRouteMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(SysRoleRoute record, SysRoleRouteExample example) {
        return sysRoleRouteMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(SysRoleRoute record, SysRoleRouteExample example) {
        return sysRoleRouteMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(SysRoleRoute record) {
        return sysRoleRouteMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SysRoleRoute record) {
        return sysRoleRouteMapper.updateByPrimaryKey(record);
    }

}

