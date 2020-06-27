package org.myproject.boot.application.admin.db.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import org.myproject.boot.application.admin.db.mapper.SysUserRoleMapper;
import org.myproject.boot.application.admin.db.pojo.SysUserRoleExample;
import org.myproject.boot.application.admin.db.pojo.SysUserRole;
import org.myproject.boot.application.admin.db.service.impl.SysUserRoleService;

@Service
public class SysUserRoleServiceImpl extends ServiceImpl<SysUserRoleMapper, SysUserRole> implements SysUserRoleService {

    @Override
    public long countByExample(SysUserRoleExample example) {
        return baseMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(SysUserRoleExample example) {
        return baseMapper.deleteByExample(example);
    }

    @Override
    public List<SysUserRole> selectByExample(SysUserRoleExample example) {
        return baseMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(SysUserRole record, SysUserRoleExample example) {
        return baseMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(SysUserRole record, SysUserRoleExample example) {
        return baseMapper.updateByExample(record, example);
    }
}

