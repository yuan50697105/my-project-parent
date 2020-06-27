package org.myproject.boot.application.admin.db.service.impl;

import cn.hutool.core.util.ObjectUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.mapper.SysUserMapper;
import org.myproject.boot.application.admin.db.pojo.SysUser;
import org.myproject.boot.application.admin.db.pojo.SysUserExample;
import org.myproject.boot.application.admin.db.pojo.SysUserQuery;
import org.myproject.boot.application.admin.db.service.SysUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

    @Override
    public long countByExample(SysUserExample example) {
        return baseMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(SysUserExample example) {
        return baseMapper.deleteByExample(example);
    }

    @Override
    public List<SysUser> selectByExample(SysUserExample example) {
        return baseMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(SysUser record, SysUserExample example) {
        return baseMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(SysUser record, SysUserExample example) {
        return baseMapper.updateByExample(record, example);
    }

    @Override
    public PageInfo<SysUser> selectByQueryWithPage(int page, int size, SysUserQuery query) {
        PageHelper.startPage(page, size);
        return new PageInfo<>(baseMapper.selectByExample(query.toExample()));
    }

    @Override
    public List<SysUser> selectByQuery(SysUserQuery query) {
        return baseMapper.selectByExample(query.toExample());
    }

    @Override
    public List<SysUser> listByQuery(SysUserQuery query) {
        QueryWrapper<SysUser> queryWrapper = queryWrapper(query);
        return list(queryWrapper);
    }

    @Override
    public IPage<SysUser> pageByQuery(Page<SysUser> page, SysUserQuery query) {
        QueryWrapper<SysUser> queryWrapper = queryWrapper(query);
        return page(page, queryWrapper);
    }

    private QueryWrapper<SysUser> queryWrapper(SysUserQuery query) {
        QueryWrapper<SysUser> queryWrapper = new QueryWrapper<>();
        if (ObjectUtil.isNotEmpty(query)) {
            queryWrapper.like(ObjectUtil.isNotEmpty(query.getUsername()), SysUser.COL_USERNAME, query.getUsername());
        }
        return queryWrapper;
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return sysUserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SysUser record) {
        return sysUserMapper.insert(record);
    }

    @Override
    public int insertSelective(SysUser record) {
        return sysUserMapper.insertSelective(record);
    }

    @Override
    public SysUser selectByPrimaryKey(Long id) {
        return sysUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SysUser record) {
        return sysUserMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SysUser record) {
        return sysUserMapper.updateByPrimaryKey(record);
    }
}

