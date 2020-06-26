package org.myproject.boot.application.admin.db.mapper.pagehelper.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.mapper.pagehelper.mapper.SysUserMapper;
import org.myproject.boot.application.admin.db.mapper.pagehelper.pojo.SysUser;
import org.myproject.boot.application.admin.db.mapper.pagehelper.pojo.SysUserQuery;
import org.myproject.boot.application.admin.db.mapper.pagehelper.service.SysUserService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Resource
    private SysUserMapper sysUserMapper;

    @Override
    public PageInfo<SysUser> selectByQueryWithPage(int page, int size, SysUserQuery query) {
        PageHelper.startPage(page, size);
        return new PageInfo<>(sysUserMapper.selectByExample(query.toExample()));
    }

    @Override
    public PageInfo<SysUser> selectByExampleWithPage(int page, int size, Example example) {
        PageHelper.startPage(page, size);
        return new PageInfo<>(sysUserMapper.selectByExample(example));
    }

    @Override
    public List<SysUser> selectByQuery(SysUserQuery query) {
        return sysUserMapper.selectByExample(query.toExample());
    }

    @Override
    public List<SysUser> selectByExample(Example example) {
        return sysUserMapper.selectByExample(example);
    }

    @Override
    public SysUser selectByPrimaryKey(Long id) {
        return sysUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public int insert(SysUser sysUser) {
        return sysUserMapper.insert(sysUser);
    }

    @Override
    public int updateByPrimaryKeySelective(SysUser sysUser) {
        return sysUserMapper.updateByPrimaryKeySelective(sysUser);
    }

    @Override
    public int deleteByExample(Example example) {
        return sysUserMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return sysUserMapper.deleteByPrimaryKey(id);
    }
}
