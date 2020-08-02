package org.myproject.boot.application.admin.db.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.mapper.TbSysRoleMapper;
import org.myproject.boot.application.admin.db.pojo.TbSysRole;
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
    public int deleteByPrimaryKey(Long id) {
        return tbSysRoleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public TbSysRole selectByPrimaryKey(Long id) {
        return tbSysRoleMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageInfo<TbSysRole> selectByQuery(TbSysRoleQuery tbQuery, int page, int limit) {
        PageHelper.startPage(page, limit);
        return new PageInfo<>(tbSysRoleMapper.selectByExample(tbQuery.toExample()));
    }

    @Override
    public List<TbSysRole> selectByQuery(TbSysRoleQuery sysUserQuery) {
        return tbSysRoleMapper.selectByExample(sysUserQuery.toExample());
    }

    @Override
    public int insert(TbSysRole record) {
        return tbSysRoleMapper.insert(record);
    }

    @Override
    public int updateByPrimaryKeySelective(TbSysRole tbSysRole) {
        return tbSysRoleMapper.updateByPrimaryKeySelective(tbSysRole);
    }
}
