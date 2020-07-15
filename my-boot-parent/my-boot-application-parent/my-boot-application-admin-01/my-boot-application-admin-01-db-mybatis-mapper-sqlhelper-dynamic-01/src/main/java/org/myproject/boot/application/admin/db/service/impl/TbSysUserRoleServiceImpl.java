package org.myproject.boot.application.admin.db.service.impl;

import org.myproject.boot.application.admin.db.mapper.TbSysUserRoleMapper;
import org.myproject.boot.application.admin.db.pojo.TbSysUserRole;
import org.myproject.boot.application.admin.db.service.TbSysUserRoleService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Condition;

import javax.annotation.Resource;

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
        Condition example = new Condition(TbSysUserRole.class);
        example.or().andEqualTo("userId", userId);
        return tbSysUserRoleMapper.deleteByExample(example);
    }
}

