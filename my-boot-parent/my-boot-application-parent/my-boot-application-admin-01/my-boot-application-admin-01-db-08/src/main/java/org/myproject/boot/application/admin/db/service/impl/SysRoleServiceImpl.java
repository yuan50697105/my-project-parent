package org.myproject.boot.application.admin.db.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.myproject.boot.application.admin.db.mapper.SysRoleMapper;
import org.myproject.boot.application.admin.db.pojo.SysRoleExample;
import java.util.List;
import org.myproject.boot.application.admin.db.pojo.SysRole;
import org.myproject.boot.application.admin.db.service.SysRoleService;
@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements SysRoleService{

    @Override
    public long countByExample(SysRoleExample example) {
        return baseMapper.countByExample(example);
    }
    @Override
    public int deleteByExample(SysRoleExample example) {
        return baseMapper.deleteByExample(example);
    }
    @Override
    public List<SysRole> selectByExample(SysRoleExample example) {
        return baseMapper.selectByExample(example);
    }
    @Override
    public int updateByExampleSelective(SysRole record,SysRoleExample example) {
        return baseMapper.updateByExampleSelective(record,example);
    }
    @Override
    public int updateByExample(SysRole record,SysRoleExample example) {
        return baseMapper.updateByExample(record,example);
    }
}
