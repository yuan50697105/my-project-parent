package org.myproject.boot.application.admin.db.service.impl;

import cn.hutool.core.util.ObjectUtil;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.mapper.SysRoleMapper;
import org.myproject.boot.application.admin.db.pojo.SysRole;
import org.myproject.boot.application.admin.db.pojo.SysRoleExample;
import org.myproject.boot.application.admin.db.pojo.SysRoleQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements SysRoleService {

    @Autowired
    private SysRoleMapper sysRoleMapper;

    @Override
    public long countByExample(SysRoleExample example) {
        return baseMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(SysRoleExample example) {
        return baseMapper.deleteByExample(example);
    }

    @Override
    public List<SysRole> selectByExample(SysRoleExample example) {
        return baseMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(SysRole record, SysRoleExample example) {
        return baseMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(SysRole record, SysRoleExample example) {
        return baseMapper.updateByExample(record, example);
    }

    @Override
    public PageInfo<SysRole> selectByExampleWithPage(int page, int pageSize, SysRoleExample example) {
        PageHelper.startPage(page, pageSize);
        return new PageInfo<>(sysRoleMapper.selectByExample(example));
    }

    @Override
    public PageInfo<SysRole> selectByQueryWithPage(int page, int pageSize, SysRoleQuery query) {
        return selectByExampleWithPage(page, pageSize, query.toExample());
    }

    @Override
    public List<SysRole> selectByQuery(SysRoleQuery query) {
        return selectByExample(query.toExample());
    }

    @Override
    public List<SysRole> listByQuery(SysRoleQuery query) {
        return list(query(query));
    }

    @Override
    public IPage<SysRole> pageByQuery(Page<SysRole> page, SysRoleQuery query) {
        return page(page, query(query));
    }

    private Wrapper<SysRole> query(SysRoleQuery query) {
        QueryWrapper<SysRole> queryWrapper = new QueryWrapper<>();
        if (ObjectUtil.isNotEmpty(query)) {
            queryWrapper.like(ObjectUtil.isNotEmpty(query.getName()), SysRole.COL_NAME, query.getName());
        }
        return queryWrapper;
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return sysRoleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SysRole record) {
        return sysRoleMapper.insert(record);
    }

    @Override
    public int insertSelective(SysRole record) {
        return sysRoleMapper.insertSelective(record);
    }

    @Override
    public SysRole selectByPrimaryKey(Long id) {
        return sysRoleMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SysRole record) {
        return sysRoleMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SysRole record) {
        return sysRoleMapper.updateByPrimaryKey(record);
    }
}

