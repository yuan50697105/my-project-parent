package org.myproject.boot.application.admin.db.service.impl;

import cn.hutool.core.util.ObjectUtil;
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
import org.myproject.boot.application.admin.db.service.SysRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper,SysRole> implements SysRoleService {

    @Resource
    private SysRoleMapper sysRoleMapper;

    @Override
    public long countByExample(SysRoleExample example) {
        return sysRoleMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(SysRoleExample example) {
        return sysRoleMapper.deleteByExample(example);
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
    public List<SysRole> selectByExample(SysRoleExample example) {
        return sysRoleMapper.selectByExample(example);
    }

    @Override
    public SysRole selectByPrimaryKey(Long id) {
        return sysRoleMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(SysRole record, SysRoleExample example) {
        return sysRoleMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(SysRole record, SysRoleExample example) {
        return sysRoleMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(SysRole record) {
        return sysRoleMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SysRole record) {
        return sysRoleMapper.updateByPrimaryKey(record);
    }

    @Override
    public PageInfo<SysRole> selectByQueryWithPage(int page, int size, SysRoleQuery query) {
        PageHelper.startPage(page, size);
        return new PageInfo<>(sysRoleMapper.selectByExample(query.toExample()));
    }

    @Override
    public IPage<SysRole> pageByQuery(Page<SysRole> page, SysRoleQuery query) {
        return page(page, createCondition(query));
    }

    @Override
    public List<SysRole> selectByQuery(SysRoleQuery query) {
        return sysRoleMapper.selectByExample(query.toExample());
    }

    @Override
    public PageInfo<SysRole> selectByExampleWithPage(int page, int pageSize, SysRoleExample example) {
        PageHelper.startPage(page, pageSize);
        return new PageInfo<>(sysRoleMapper.selectByExample(example));
    }

    @Override
    public List<SysRole> listByQuery(SysRoleQuery query) {
        return list(createCondition(query));
    }

    private QueryWrapper<SysRole> createCondition(SysRoleQuery query) {
        QueryWrapper<SysRole> queryWrapper = new QueryWrapper<>();
        if (ObjectUtil.isNotEmpty(query)) {
            queryWrapper.like(ObjectUtil.isNotEmpty(query.getName()), SysRole.COL_NAME, query.getName());
        }
        return queryWrapper;
    }
}

