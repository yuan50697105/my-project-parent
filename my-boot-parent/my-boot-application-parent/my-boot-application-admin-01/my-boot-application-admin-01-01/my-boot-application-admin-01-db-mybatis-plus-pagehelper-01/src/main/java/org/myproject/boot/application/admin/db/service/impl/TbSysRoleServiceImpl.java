package org.myproject.boot.application.admin.db.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.pojo.TbSysRoleQuery;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.myproject.boot.application.admin.db.mapper.TbSysRoleMapper;
import org.myproject.boot.application.admin.db.pojo.TbSysRole;

import java.util.List;

import org.myproject.boot.application.admin.db.pojo.TbSysRoleExample;
import org.myproject.boot.application.admin.db.service.TbSysRoleService;

@Service
public class TbSysRoleServiceImpl extends ServiceImpl<TbSysRoleMapper, TbSysRole> implements TbSysRoleService {

    @Override
    public long countByExample(TbSysRoleExample example) {
        return baseMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TbSysRoleExample example) {
        return baseMapper.deleteByExample(example);
    }

    @Override
    public List<TbSysRole> selectByExample(TbSysRoleExample example) {
        return baseMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(TbSysRole record, TbSysRoleExample example) {
        return baseMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(TbSysRole record, TbSysRoleExample example) {
        return baseMapper.updateByExample(record, example);
    }

    @Override
    public PageInfo<TbSysRole> selectByQuery(TbSysRoleQuery sysRoleQuery, int page, int size) {
        PageHelper.startPage(page, size);
        return new PageInfo<>(selectByExample(sysRoleQuery.toExample()));
    }

    @Override
    public List<TbSysRole> selectByQuery(TbSysRoleQuery sysRoleQuery) {
        return selectByExample(sysRoleQuery.toExample());
    }
}
