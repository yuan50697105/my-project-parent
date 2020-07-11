package org.myproject.boot.application.admin.db.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.myproject.boot.application.admin.db.pojo.TbSysRoleRoute;
import org.myproject.boot.application.admin.db.pojo.TbSysRoleRouteExample;
import java.util.List;
import org.myproject.boot.application.admin.db.mapper.TbSysRoleRouteMapper;
import org.myproject.boot.application.admin.db.service.TbSysRoleRouteService;
@Service
public class TbSysRoleRouteServiceImpl extends ServiceImpl<TbSysRoleRouteMapper, TbSysRoleRoute> implements TbSysRoleRouteService{

    @Override
    public long countByExample(TbSysRoleRouteExample example) {
        return baseMapper.countByExample(example);
    }
    @Override
    public int deleteByExample(TbSysRoleRouteExample example) {
        return baseMapper.deleteByExample(example);
    }
    @Override
    public List<TbSysRoleRoute> selectByExample(TbSysRoleRouteExample example) {
        return baseMapper.selectByExample(example);
    }
    @Override
    public int updateByExampleSelective(TbSysRoleRoute record,TbSysRoleRouteExample example) {
        return baseMapper.updateByExampleSelective(record,example);
    }
    @Override
    public int updateByExample(TbSysRoleRoute record,TbSysRoleRouteExample example) {
        return baseMapper.updateByExample(record,example);
    }
}
