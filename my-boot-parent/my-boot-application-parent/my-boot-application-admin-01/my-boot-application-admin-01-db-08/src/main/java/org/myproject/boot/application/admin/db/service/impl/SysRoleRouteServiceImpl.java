package org.myproject.boot.application.admin.db.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import org.myproject.boot.application.admin.db.pojo.SysRoleRoute;
import org.myproject.boot.application.admin.db.pojo.SysRoleRouteExample;
import org.myproject.boot.application.admin.db.mapper.SysRoleRouteMapper;
import org.myproject.boot.application.admin.db.service.SysRoleRouteService;
@Service
public class SysRoleRouteServiceImpl extends ServiceImpl<SysRoleRouteMapper, SysRoleRoute> implements SysRoleRouteService{

    @Override
    public long countByExample(SysRoleRouteExample example) {
        return baseMapper.countByExample(example);
    }
    @Override
    public int deleteByExample(SysRoleRouteExample example) {
        return baseMapper.deleteByExample(example);
    }
    @Override
    public List<SysRoleRoute> selectByExample(SysRoleRouteExample example) {
        return baseMapper.selectByExample(example);
    }
    @Override
    public int updateByExampleSelective(SysRoleRoute record,SysRoleRouteExample example) {
        return baseMapper.updateByExampleSelective(record,example);
    }
    @Override
    public int updateByExample(SysRoleRoute record,SysRoleRouteExample example) {
        return baseMapper.updateByExample(record,example);
    }
}
