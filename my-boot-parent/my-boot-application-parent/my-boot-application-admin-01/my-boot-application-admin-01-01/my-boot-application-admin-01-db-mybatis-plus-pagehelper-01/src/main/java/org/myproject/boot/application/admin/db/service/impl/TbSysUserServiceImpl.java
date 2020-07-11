package org.myproject.boot.application.admin.db.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.pojo.TbSysUserQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.myproject.boot.application.admin.db.mapper.TbSysUserMapper;
import org.myproject.boot.application.admin.db.pojo.TbSysUserExample;
import org.myproject.boot.application.admin.db.pojo.TbSysUser;
import org.myproject.boot.application.admin.db.service.TbSysUserService;
@Service
public class TbSysUserServiceImpl extends ServiceImpl<TbSysUserMapper, TbSysUser> implements TbSysUserService{

    @Override
    public long countByExample(TbSysUserExample example) {
        return baseMapper.countByExample(example);
    }
    @Override
    public int deleteByExample(TbSysUserExample example) {
        return baseMapper.deleteByExample(example);
    }
    @Override
    public List<TbSysUser> selectByExample(TbSysUserExample example) {
        return baseMapper.selectByExample(example);
    }
    @Override
    public int updateByExampleSelective(TbSysUser record,TbSysUserExample example) {
        return baseMapper.updateByExampleSelective(record,example);
    }
    @Override
    public int updateByExample(TbSysUser record,TbSysUserExample example) {
        return baseMapper.updateByExample(record,example);
    }

    @Override
    public PageInfo<TbSysUser> selectByQuery(TbSysUserQuery query, int page, int size) {
        PageHelper.startPage(page, size);
        return new PageInfo<>(selectByExample(query.toExample()));
    }

    @Override
    public List<TbSysUser> selectByQuery(TbSysUserQuery sysUserQuery) {
        return selectByExample(sysUserQuery.toExample());
    }
}
