package org.myproject.boot.application.admin.db.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.myproject.boot.application.admin.db.pojo.TbSysUserRoleExample;
import org.myproject.boot.application.admin.db.mapper.TbSysUserRoleMapper;
import java.util.List;
import org.myproject.boot.application.admin.db.pojo.TbSysUserRole;
import org.myproject.boot.application.admin.db.service.TbSysUserRoleService;
@Service
public class TbSysUserRoleServiceImpl extends ServiceImpl<TbSysUserRoleMapper, TbSysUserRole> implements TbSysUserRoleService{

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
    public int updateByExampleSelective(TbSysUserRole record,TbSysUserRoleExample example) {
        return baseMapper.updateByExampleSelective(record,example);
    }
    @Override
    public int updateByExample(TbSysUserRole record,TbSysUserRoleExample example) {
        return baseMapper.updateByExample(record,example);
    }
}
