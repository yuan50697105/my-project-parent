package org.myproject.boot.application.admin.db.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.mapper.TbSysRoleMapper;
import org.myproject.boot.application.admin.db.pojo.TbSysRole;
import org.myproject.boot.application.admin.db.pojo.TbSysRoleExample;
import org.myproject.boot.application.admin.db.pojo.TbSysRoleQuery;
import org.myproject.boot.application.admin.db.service.TbSysRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TbSysRoleServiceImpl implements TbSysRoleService {

    @Resource
    private TbSysRoleMapper tbSysRoleMapper;

    @Override
    public List<TbSysRole> selectByIds(List<Long> roleIds) {
        TbSysRoleExample example = new TbSysRoleExample();
        example.or().andIdIn(roleIds);
        return tbSysRoleMapper.selectByExample(example);
    }

    @Override
    public PageInfo<TbSysRole> selectByQuery(TbSysRoleQuery sysRoleQuery, int page, int size) {
        PageHelper.startPage(page, size);
        return new PageInfo<>(tbSysRoleMapper.selectByExample(sysRoleQuery.toExample()));
    }

    @Override
    public List<TbSysRole> selectByQuery(TbSysRoleQuery sysRoleQuery) {
        return tbSysRoleMapper.selectByExample(sysRoleQuery.toExample());
    }

    @Override
    public TbSysRole selectByPrimaryKey(Long id) {
        return tbSysRoleMapper.selectByPrimaryKey(id);
    }

    @Override
    public int insert(TbSysRole sysRole) {
        return tbSysRoleMapper.insert(sysRole);
    }

    @Override
    public int updateByPrimaryKeySelective(TbSysRole sysRole) {
        return tbSysRoleMapper.updateByPrimaryKeySelective(sysRole);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return tbSysRoleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public long countByExample(TbSysRoleExample example) {
        return tbSysRoleMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TbSysRoleExample example) {
        return tbSysRoleMapper.deleteByExample(example);
    }

    @Override
    public int insertSelective(TbSysRole record) {
        return tbSysRoleMapper.insertSelective(record);
    }

    @Override
    public List<TbSysRole> selectByExample(TbSysRoleExample example) {
        return tbSysRoleMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(TbSysRole record, TbSysRoleExample example) {
        return tbSysRoleMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(TbSysRole record, TbSysRoleExample example) {
        return tbSysRoleMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKey(TbSysRole record) {
        return tbSysRoleMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<TbSysRole> list) {
        return tbSysRoleMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<TbSysRole> list) {
        return tbSysRoleMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<TbSysRole> list) {
        return tbSysRoleMapper.batchInsert(list);
    }
}


