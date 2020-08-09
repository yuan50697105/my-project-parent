package org.myproject.boot.application.admin.web.db.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.myproject.boot.application.admin.web.db.mapper.TbSysRoleMapper;
import org.myproject.boot.application.admin.web.db.pojo.TbSysRole;
import org.myproject.boot.application.admin.web.db.pojo.TbSysRoleExample;
import org.myproject.boot.application.admin.web.db.service.TbSysRoleService;
import org.myproject.boot.mybatis.pojo.BaseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TbSysRoleServiceImpl extends ServiceImpl<TbSysRoleMapper, TbSysRole> implements TbSysRoleService {

    @Override
    public long countByExample(TbSysRoleExample example) {
        return baseMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TbSysRoleExample example) {
        return baseMapper.deleteByExample(example);
    }

    @Override
    public List<TbSysRole> selectByExample(TbSysRoleExample example) {
        return baseMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(TbSysRole record, TbSysRoleExample example) {
        return baseMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(TbSysRole record, TbSysRoleExample example) {
        return baseMapper.updateByExample(record, example);
    }

    @Override
    public List<Long> listRoleIdByIds(List<Long> roleIds) {
        return lambdaQuery().in(BaseEntity::getId, roleIds).list().stream().map(BaseEntity::getId).collect(Collectors.toList());
    }
}
