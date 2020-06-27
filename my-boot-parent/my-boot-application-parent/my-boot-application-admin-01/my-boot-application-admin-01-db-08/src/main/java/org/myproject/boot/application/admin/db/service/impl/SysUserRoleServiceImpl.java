package org.myproject.boot.application.admin.db.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.mapper.SysUserMapper;
import org.myproject.boot.application.admin.db.mapper.SysUserRoleMapper;
import org.myproject.boot.application.admin.db.pojo.*;
import org.myproject.boot.application.admin.db.service.SysUserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysUserRoleServiceImpl extends ServiceImpl<SysUserRoleMapper, SysUserRole> implements SysUserRoleService {

    @Resource
    private SysUserRoleMapper sysUserRoleMapper;
    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public long countByExample(SysUserRoleExample example) {
        return sysUserRoleMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(SysUserRoleExample example) {
        return sysUserRoleMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return sysUserRoleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SysUserRole record) {
        return sysUserRoleMapper.insert(record);
    }

    @Override
    public int insertSelective(SysUserRole record) {
        return sysUserRoleMapper.insertSelective(record);
    }

    @Override
    public List<SysUserRole> selectByExample(SysUserRoleExample example) {
        return sysUserRoleMapper.selectByExample(example);
    }

    @Override
    public SysUserRole selectByPrimaryKey(Long id) {
        return sysUserRoleMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(SysUserRole record, SysUserRoleExample example) {
        return sysUserRoleMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(SysUserRole record, SysUserRoleExample example) {
        return sysUserRoleMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(SysUserRole record) {
        return sysUserRoleMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SysUserRole record) {
        return sysUserRoleMapper.updateByPrimaryKey(record);
    }

    @Override
    public PageInfo<SysUser> selectByExampleWithPage(int page, int pageSize, SysUserExample example) {
        PageHelper.startPage(page, pageSize);
        return new PageInfo<>(sysUserMapper.selectByExample(example));
    }

}


