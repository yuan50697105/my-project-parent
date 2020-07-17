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
public class TbSysUserServiceImpl implements TbSysUserService {

    @Resource
    private TbSysUserMapper tbSysUserMapper;

    @Override
    public PageInfo<TbSysUser> selectByQuery(TbSysUserQuery sysUserQuery, int page, int size) {
        PageHelper.startPage(page, size);
        return new PageInfo<>(tbSysUserMapper.selectByExample(sysUserQuery.toExample()));
    }

    @Override
    public List<TbSysUser> selectByQuery(TbSysUserQuery sysUserQuery) {
        return tbSysUserMapper.selectByExample(sysUserQuery.toExample());
    }

    @Override
    public TbSysUser selectByPrimaryKey(Long id) {
        return tbSysUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return tbSysUserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKey(TbSysUser sysUser) {
        return tbSysUserMapper.updateByPrimaryKey(sysUser);
    }

    @Override
    public int insert(TbSysUser sysUser) {
        return tbSysUserMapper.insert(sysUser);
    }

    @Override
    public int updateByPrimaryKeySelective(TbSysUser sysUserUpdateInfo) {
        return tbSysUserMapper.updateByPrimaryKeySelective(sysUserUpdateInfo);
    }
}

