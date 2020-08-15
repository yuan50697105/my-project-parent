package org.myproject.boot.application.admin.db.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.myproject.boot.application.admin.db.mapper.TbSysPermissionMapper;
import org.myproject.boot.application.admin.db.pojo.TbSysPermission;
import org.myproject.boot.application.admin.db.pojo.TbSysPermissionExample;
import org.myproject.boot.application.admin.db.service.TbSysPermissionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbSysPermissionServiceImpl extends ServiceImpl<TbSysPermissionMapper, TbSysPermission> implements TbSysPermissionService {

    @Override
    public long countByExample(TbSysPermissionExample example) {
        return baseMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TbSysPermissionExample example) {
        return baseMapper.deleteByExample(example);
    }

    @Override
    public List<TbSysPermission> selectByExample(TbSysPermissionExample example) {
        return baseMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(TbSysPermission record, TbSysPermissionExample example) {
        return baseMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(TbSysPermission record, TbSysPermissionExample example) {
        return baseMapper.updateByExample(record, example);
    }

    @Override
    public void removeByRoleId(Long roleId) {
        remove(lambdaQuery().eq(TbSysPermission::getRoleId, roleId));
    }
}
