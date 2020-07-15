package org.myproject.boot.application.admin.db.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.myproject.boot.application.admin.db.mapper.TbSysUserRoleMapper;
import org.myproject.boot.application.admin.db.pojo.TbSysUserRole;
import org.myproject.boot.application.admin.db.pojo.TbSysUserRoleExample;
import org.myproject.boot.application.admin.db.service.TbSysUserRoleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbSysUserRoleServiceImpl extends ServiceImpl<TbSysUserRoleMapper, TbSysUserRole> implements TbSysUserRoleService {

    @Override
    public long countByExample(TbSysUserRoleExample example) {
        return baseMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TbSysUserRoleExample example) {
        return baseMapper.deleteByExample(example);
    }

    @Override
    public List<TbSysUserRole> selectByExample(TbSysUserRoleExample example) {
        return baseMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(TbSysUserRole record, TbSysUserRoleExample example) {
        return baseMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(TbSysUserRole record, TbSysUserRoleExample example) {
        return baseMapper.updateByExample(record, example);
    }

    @Override
    public boolean removeByUserId(Long userId) {
        return remove(lambdaQuery().eq(TbSysUserRole::getUserId, userId));
    }
}

