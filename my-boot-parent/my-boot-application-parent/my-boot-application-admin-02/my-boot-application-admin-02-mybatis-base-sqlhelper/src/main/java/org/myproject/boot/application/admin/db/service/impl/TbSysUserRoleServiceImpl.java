package org.myproject.boot.application.admin.db.service.impl;

import org.myproject.boot.application.admin.db.mapper.TbSysUserRoleMapper;
import org.myproject.boot.application.admin.db.pojo.TbSysUserRole;
import org.myproject.boot.application.admin.db.pojo.TbSysUserRoleExample;
import org.myproject.boot.application.admin.db.service.TbSysUserRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TbSysUserRoleServiceImpl implements TbSysUserRoleService {

    @Resource
    private TbSysUserRoleMapper tbSysUserRoleMapper;

    @Override
    public int insert(TbSysUserRole tbSysUserRole) {
        return tbSysUserRoleMapper.insert(tbSysUserRole);
    }

    @Override
    public int deleteByUserId(Long userId) {
        TbSysUserRoleExample example = new TbSysUserRoleExample();
        example.or().andUserIdEqualTo(userId);
        return tbSysUserRoleMapper.deleteByExample(example);
    }

    @Override
    public long countByExample(TbSysUserRoleExample example) {
        return tbSysUserRoleMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TbSysUserRoleExample example) {
        return tbSysUserRoleMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return tbSysUserRoleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(TbSysUserRole record) {
        return tbSysUserRoleMapper.insertSelective(record);
    }

    @Override
    public List<TbSysUserRole> selectByExample(TbSysUserRoleExample example) {
        return tbSysUserRoleMapper.selectByExample(example);
    }

    @Override
    public TbSysUserRole selectByPrimaryKey(Long id) {
        return tbSysUserRoleMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(TbSysUserRole record, TbSysUserRoleExample example) {
        return tbSysUserRoleMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(TbSysUserRole record, TbSysUserRoleExample example) {
        return tbSysUserRoleMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(TbSysUserRole record) {
        return tbSysUserRoleMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TbSysUserRole record) {
        return tbSysUserRoleMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<TbSysUserRole> list) {
        return tbSysUserRoleMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<TbSysUserRole> list) {
        return tbSysUserRoleMapper.batchInsert(list);
    }
}


