package org.myproject.boot.application.admin.db.plus.pagehelper.service.impl;

import cn.hutool.core.util.ObjectUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.plus.pagehelper.mapper.SysUserMapper;
import org.myproject.boot.application.admin.db.plus.pagehelper.pojo.SysUser;
import org.myproject.boot.application.admin.db.plus.pagehelper.pojo.SysUserExample;
import org.myproject.boot.application.admin.db.plus.pagehelper.pojo.SysUserQuery;
import org.myproject.boot.application.admin.db.plus.pagehelper.service.SysUserService;
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
    public IPage<SysUser> pageByQuery(Page<SysUser> page, SysUserQuery query) {
        return page(page, queryWrapper(query));
    }

    @Override
    public List<SysUser> listByQuery(SysUserQuery query) {
        return list(queryWrapper(query));
    }

    private QueryWrapper<SysUser> queryWrapper(SysUserQuery query) {
        QueryWrapper<SysUser> queryWrapper = new QueryWrapper<>();
        if (ObjectUtil.isNotEmpty(query)) {
            queryWrapper.like(ObjectUtil.isNotEmpty(query.getUsername()), SysUser.COL_USERNAME, query.getUsername());
        }
        return queryWrapper;
    }
}
