package org.myproject.boot.application.admin.db.service.table.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.myproject.boot.application.admin.db.mapper.SysRouteMapper;
import org.myproject.boot.application.admin.db.pojo.SysRoute;
import org.myproject.boot.application.admin.db.service.table.SysRouteService;

import java.util.List;

@Service
public class SysRouteServiceImpl extends ServiceImpl<SysRouteMapper, SysRoute> implements SysRouteService{

    @Override
    public List<SysRoute> selectByExample(Object example) {
        return baseMapper.selectByExample(example);
    }
}
