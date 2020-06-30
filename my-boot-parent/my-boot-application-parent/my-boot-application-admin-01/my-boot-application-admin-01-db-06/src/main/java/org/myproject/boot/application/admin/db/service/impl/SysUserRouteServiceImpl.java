package org.myproject.boot.application.admin.db.service.impl;

import org.myproject.boot.application.admin.db.mapper.SysUserRouteMapper;
import org.myproject.boot.application.admin.db.service.SysUserRouteService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: my-boot-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-30 19:14
 */
@Service
public class SysUserRouteServiceImpl implements SysUserRouteService {
    @Resource
    private SysUserRouteMapper sysUserRouteMapper;

    @Override
    public List<String> selectByUserId(Long userId) {
        return sysUserRouteMapper.selectRouteUrlByUserId(userId);
    }
}