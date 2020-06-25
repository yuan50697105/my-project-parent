package org.myproject.application.admin.db.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import org.myproject.application.admin.db.pojo.SysUserExample;
import org.myproject.application.admin.db.mapper.SysUserMapper;
import org.myproject.application.admin.db.pojo.SysUser;
import org.myproject.application.admin.db.service.SysUserService;
@Service
public class SysUserServiceImpl implements SysUserService{

    @Resource
    private SysUserMapper sysUserMapper;

    @Override
    public long countByExample(SysUserExample example) {
        return sysUserMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(SysUserExample example) {
        return sysUserMapper.deleteByExample(example);
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
    public List<SysUser> selectByExample(SysUserExample example) {
        return sysUserMapper.selectByExample(example);
    }

    @Override
    public SysUser selectByPrimaryKey(Long id) {
        return sysUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(SysUser record,SysUserExample example) {
        return sysUserMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(SysUser record,SysUserExample example) {
        return sysUserMapper.updateByExample(record,example);
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
