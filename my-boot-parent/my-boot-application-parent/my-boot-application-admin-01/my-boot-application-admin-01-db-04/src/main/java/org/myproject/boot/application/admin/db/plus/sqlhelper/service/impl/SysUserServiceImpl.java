package org.myproject.boot.application.admin.db.plus.sqlhelper.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.plus.sqlhelper.pojo.SysUserQuery;
import org.springframework.stereotype.Service;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.myproject.boot.application.admin.db.plus.sqlhelper.mapper.SysUserMapper;
import org.myproject.boot.application.admin.db.plus.sqlhelper.pojo.SysUser;
import org.myproject.boot.application.admin.db.plus.sqlhelper.pojo.SysUserExample;
import org.myproject.boot.application.admin.db.plus.sqlhelper.service.SysUserService;
import org.springframework.transaction.annotation.Transactional;

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
}
