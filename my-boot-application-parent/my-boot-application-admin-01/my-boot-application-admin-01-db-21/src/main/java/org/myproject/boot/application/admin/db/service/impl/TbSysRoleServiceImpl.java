package org.myproject.boot.application.admin.db.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.mapper.TbSysRoleMapper;
import org.myproject.boot.application.admin.db.pojo.TbSysRole;
import org.myproject.boot.application.admin.db.pojo.TbSysRoleQuery;
import org.myproject.boot.application.admin.db.service.TbSysRoleService;
import org.myproject.boot.mybatis.pojo.BaseEntity;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.weekend.Weekend;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TbSysRoleServiceImpl implements TbSysRoleService {

    @Resource
    private TbSysRoleMapper tbSysRoleMapper;

    @Override
    public List<TbSysRole> selectByIds(List<Long> roleIds) {
        Weekend<TbSysRole> example = Weekend.of(TbSysRole.class);
        example.weekendCriteria().andIn(BaseEntity::getId, roleIds);
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
}

