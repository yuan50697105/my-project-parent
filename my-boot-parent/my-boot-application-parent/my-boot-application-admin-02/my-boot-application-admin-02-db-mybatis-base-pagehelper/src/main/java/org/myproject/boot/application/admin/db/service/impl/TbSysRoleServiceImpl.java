package org.myproject.boot.application.admin.db.service.impl;

import org.myproject.boot.application.admin.db.mapper.TbSysRoleMapper;
import org.myproject.boot.application.admin.db.pojo.TbSysRole;
import org.myproject.boot.application.admin.db.pojo.TbSysRoleExample;
import org.myproject.boot.application.admin.db.service.TbSysRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TbSysRoleServiceImpl implements TbSysRoleService {

    @Resource
    private TbSysRoleMapper tbSysRoleMapper;

    @Override
    public long countByExample(TbSysRoleExample example) {
        return tbSysRoleMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TbSysRoleExample example) {
        return tbSysRoleMapper.deleteByExample(example);
    }

    @Override
    public int insert(TbSysRole record) {
        return tbSysRoleMapper.insert(record);
    }

    @Override
    public int insertSelective(TbSysRole record) {
        return tbSysRoleMapper.insertSelective(record);
    }

    @Override
    public List<TbSysRole> selectByExample(TbSysRoleExample example) {
        return tbSysRoleMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(TbSysRole record, TbSysRoleExample example) {
        return tbSysRoleMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(TbSysRole record, TbSysRoleExample example) {
        return tbSysRoleMapper.updateByExample(record, example);
    }

}
