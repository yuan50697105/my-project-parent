package org.myproject.boot.application.admin.db.service.impl;

import cn.hutool.core.lang.Validator;
import cn.hutool.core.util.ObjectUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.mapper.TbSysUserMapper;
import org.myproject.boot.application.admin.db.pojo.TbSysUser;
import org.myproject.boot.application.admin.db.pojo.TbSysUserExample;
import org.myproject.boot.application.admin.db.pojo.TbSysUserQuery;
import org.myproject.boot.application.admin.db.service.TbSysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TbSysUserServiceImpl implements TbSysUserService {

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
        validateInsert(record);
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
    public int updateByExampleSelective(TbSysUser record, TbSysUserExample example) {
        return tbSysUserMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(TbSysUser record, TbSysUserExample example) {
        return tbSysUserMapper.updateByExample(record, example);
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


    @Override
    public void saveOrUpdate(TbSysUser sysUser) {
        if (ObjectUtil.isEmpty(sysUser.getId())) {
            insert(sysUser);
        } else {
            updateByPrimaryKeySelective(sysUser);
        }
    }

    private void validateInsert(TbSysUser record) {
        Validator.validateEmpty(record.getUsername(), "用户名不能为空");
        Validator.validateEmpty(record.getPassword(), "密码不能为空");
        Validator.validateEmpty(record.getName(), "昵称不能为空");
    }
}


