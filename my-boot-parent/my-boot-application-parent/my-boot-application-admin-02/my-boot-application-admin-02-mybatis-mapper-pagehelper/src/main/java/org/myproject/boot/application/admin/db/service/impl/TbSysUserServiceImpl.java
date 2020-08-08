package org.myproject.boot.application.admin.db.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.pojo.TbSysUser;
import org.myproject.boot.application.admin.db.pojo.TbSysUserQuery;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import org.myproject.boot.application.admin.db.mapper.TbSysUserMapper;
import org.myproject.boot.application.admin.db.service.TbSysUserService;

import java.util.List;

@Service
public class TbSysUserServiceImpl implements TbSysUserService{

    @Resource
    private TbSysUserMapper tbSysUserMapper;

    @Override
    public TbSysUser selectByPrimaryKey(Long id) {
        return tbSysUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<TbSysUser> selectByQuery(TbSysUserQuery query) {
        return tbSysUserMapper.selectByExample(query.toExample());
    }

    @Override
    public PageInfo<TbSysUser> selectByQuery(TbSysUserQuery query, int page, int limit) {
        PageHelper.startPage(page, limit);
        return new PageInfo<>(selectByQuery(query));
    }

    @Override
    public void deleteByPrimaryKey(Long id) {
        tbSysUserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void updateByPrimaryKeySelective(TbSysUser tbSysUser) {
        tbSysUserMapper.updateByPrimaryKeySelective(tbSysUser);
    }

    @Override
    public void insert(TbSysUser tbSysUser) {
        tbSysUserMapper.insert(tbSysUser);
    }
}
