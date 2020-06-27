package org.myproject.boot.application.admin.db.service.impl;

import cn.hutool.core.util.ObjectUtil;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.mapper.SysUserMapper;
import org.myproject.boot.application.admin.db.pojo.SysUser;
import org.myproject.boot.application.admin.db.pojo.SysUserExample;
import org.myproject.boot.application.admin.db.pojo.SysUserQuery;
import org.myproject.boot.application.admin.db.service.SysUserService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper,SysUser> implements SysUserService {

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
    public int updateByExampleSelective(SysUser record, SysUserExample example) {
        return sysUserMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(SysUser record, SysUserExample example) {
        return sysUserMapper.updateByExample(record, example);
    }

    @Override
    public IPage<SysUser> pageByQuery(Page<SysUser> page, SysUserQuery query) {
        return page(page,createCondition(query));
    }

    @Override
    public int updateByPrimaryKeySelective(SysUser record) {
        return sysUserMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByExample(Example example) {
        return sysUserMapper.deleteByExample(example);
    }

    @Override
    public int updateByPrimaryKey(SysUser record) {
        return sysUserMapper.updateByPrimaryKey(record);
    }

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
    public PageInfo<SysUser> selectByExampleWithPage(int page, int pageSize, SysUserExample example) {
        PageHelper.startPage(page, pageSize);
        return new PageInfo<>(sysUserMapper.selectByExample(example));
    }

    @Override
    public List<SysUser> listByQuery(SysUserQuery query) {
        return list(createCondition(query));
    }

    private Wrapper<SysUser> createCondition(SysUserQuery query) {
        QueryWrapper<SysUser> queryWrapper = new QueryWrapper<>();
        if (ObjectUtil.isNotEmpty(query)) {
            queryWrapper.like(ObjectUtil.isNotEmpty(query.getName()), SysUser.COL_NAME, query.getName());
        }
        return queryWrapper;
    }

}


