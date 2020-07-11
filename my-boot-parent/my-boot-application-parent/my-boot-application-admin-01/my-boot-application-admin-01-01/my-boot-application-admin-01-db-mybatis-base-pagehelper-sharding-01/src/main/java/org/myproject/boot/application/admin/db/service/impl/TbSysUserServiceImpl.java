package org.myproject.boot.application.admin.db.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.pojo.TbSysUserQuery;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import org.myproject.boot.application.admin.db.mapper.TbSysUserMapper;
import java.util.List;
import org.myproject.boot.application.admin.db.pojo.TbSysUserExample;
import org.myproject.boot.application.admin.db.pojo.TbSysUser;
import org.myproject.boot.application.admin.db.service.TbSysUserService;
@Service
public class TbSysUserServiceImpl implements TbSysUserService{

    @Resource
    private TbSysUserMapper tbSysUserMapper;

    @Override
    public long countByExample(TbSysUserExample example) {
        return tbSysUserMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TbSysUserExample example) {
        return tbSysUserMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return tbSysUserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TbSysUser record) {
        return tbSysUserMapper.insert(record);
    }

    @Override
    public int insertSelective(TbSysUser record) {
        return tbSysUserMapper.insertSelective(record);
    }

    @Override
    public List<TbSysUser> selectByExample(TbSysUserExample example) {
        return tbSysUserMapper.selectByExample(example);
    }

    @Override
    public TbSysUser selectByPrimaryKey(Long id) {
        return tbSysUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(TbSysUser record,TbSysUserExample example) {
        return tbSysUserMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(TbSysUser record,TbSysUserExample example) {
        return tbSysUserMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(TbSysUser record) {
        return tbSysUserMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TbSysUser record) {
        return tbSysUserMapper.updateByPrimaryKey(record);
    }

    @Override
    public PageInfo<TbSysUser> selectByQuery(TbSysUserQuery sysUserQuery, int page, int size) {
        PageHelper.startPage(page, size);
        return new PageInfo<>(selectByExample(sysUserQuery.toExample()));
    }

    @Override
    public List<TbSysUser> selectByQuery(TbSysUserQuery sysUserQuery) {
        return selectByExample(sysUserQuery.toExample());
    }

}
