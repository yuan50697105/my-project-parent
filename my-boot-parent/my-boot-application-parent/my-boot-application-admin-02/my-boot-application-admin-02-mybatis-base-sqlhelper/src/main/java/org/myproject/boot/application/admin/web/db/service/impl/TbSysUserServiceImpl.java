package org.myproject.boot.application.admin.web.db.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.web.db.mapper.TbSysUserMapper;
import org.myproject.boot.application.admin.web.db.pojo.TbSysUser;
import org.myproject.boot.application.admin.web.db.pojo.TbSysUserExample;
import org.myproject.boot.application.admin.web.db.pojo.TbSysUserQuery;
import org.myproject.boot.application.admin.web.db.service.TbSysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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

    @Override
    public long countByExample(TbSysUserExample example) {
        return tbSysUserMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TbSysUserExample example) {
        return tbSysUserMapper.deleteByExample(example);
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
    public int updateByExampleSelective(TbSysUser record, TbSysUserExample example) {
        return tbSysUserMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(TbSysUser record, TbSysUserExample example) {
        return tbSysUserMapper.updateByExample(record, example);
    }

    @Override
    public int updateBatch(List<TbSysUser> list) {
        return tbSysUserMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<TbSysUser> list) {
        return tbSysUserMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<TbSysUser> list) {
        return tbSysUserMapper.batchInsert(list);
    }
}


