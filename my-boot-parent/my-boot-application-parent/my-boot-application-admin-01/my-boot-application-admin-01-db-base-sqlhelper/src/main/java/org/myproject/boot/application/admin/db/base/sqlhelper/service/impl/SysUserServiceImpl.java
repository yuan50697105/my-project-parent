package org.myproject.boot.application.admin.db.base.sqlhelper.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.base.sqlhelper.mapper.SysUserMapper;
import org.myproject.boot.application.admin.db.base.sqlhelper.pojo.SysUser;
import org.myproject.boot.application.admin.db.base.sqlhelper.pojo.SysUserExample;
import org.myproject.boot.application.admin.db.base.sqlhelper.pojo.SysUserQuery;
import org.myproject.boot.application.admin.db.base.sqlhelper.service.SysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService {

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
    public List<SysUser> selectByQuery(SysUserQuery query) {
        return sysUserMapper.selectByExample(query.toExample());
    }

    @Override
    public SysUser selectByPrimaryKey(Long id) {
        return sysUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(SysUser record, SysUserExample example) {
        return sysUserMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(SysUser record, SysUserExample example) {
        return sysUserMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(SysUser record) {
        return sysUserMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SysUser record) {
        return sysUserMapper.updateByPrimaryKey(record);
    }

    @Override
    public PageInfo<SysUser> selectByExampleWithPage(int page, int pageSize, SysUserExample example) {
        PageHelper.startPage(page, pageSize);
        return new PageInfo<>(sysUserMapper.selectByExample(example));
    }

    @Override
    public PageInfo<SysUser> selectByQueryWithPage(int page, int pageSize, SysUserQuery query) {
        return selectByExampleWithPage(page, pageSize, query.toExample());
    }
}
