package org.myproject.boot.application.admin.db.service.impl;

import org.myproject.boot.application.admin.db.mapper.TbSysRoleRouteMapper;
import org.myproject.boot.application.admin.db.pojo.TbSysRoleRoute;
import org.myproject.boot.application.admin.db.pojo.TbSysRoleRouteExample;
import org.myproject.boot.application.admin.db.service.TbSysRoleRouteService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TbSysRoleRouteServiceImpl implements TbSysRoleRouteService {

    @Resource
    private TbSysRoleRouteMapper tbSysRoleRouteMapper;

    @Override
    public long countByExample(TbSysRoleRouteExample example) {
        return tbSysRoleRouteMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TbSysRoleRouteExample example) {
        return tbSysRoleRouteMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return tbSysRoleRouteMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TbSysRoleRoute record) {
        return tbSysRoleRouteMapper.insert(record);
    }

    @Override
    public int insertSelective(TbSysRoleRoute record) {
        return tbSysRoleRouteMapper.insertSelective(record);
    }

    @Override
    public List<TbSysRoleRoute> selectByExample(TbSysRoleRouteExample example) {
        return tbSysRoleRouteMapper.selectByExample(example);
    }

    @Override
    public TbSysRoleRoute selectByPrimaryKey(Long id) {
        return tbSysRoleRouteMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(TbSysRoleRoute record, TbSysRoleRouteExample example) {
        return tbSysRoleRouteMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(TbSysRoleRoute record, TbSysRoleRouteExample example) {
        return tbSysRoleRouteMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(TbSysRoleRoute record) {
        return tbSysRoleRouteMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TbSysRoleRoute record) {
        return tbSysRoleRouteMapper.updateByPrimaryKey(record);
    }

}

