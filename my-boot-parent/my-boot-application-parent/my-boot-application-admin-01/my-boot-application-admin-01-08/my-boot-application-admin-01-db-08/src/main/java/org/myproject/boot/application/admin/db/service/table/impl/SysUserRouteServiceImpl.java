package org.myproject.boot.application.admin.db.service.table.impl;

import lombok.AllArgsConstructor;
import org.myproject.boot.application.admin.db.mapper.SysUserRouteMapper;
import org.myproject.boot.application.admin.db.service.table.SysUserRouteService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: my-boot-application-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-07-02 23:44
 */
@Service
@Transactional
@AllArgsConstructor
public class SysUserRouteServiceImpl implements SysUserRouteService {
    private final SysUserRouteMapper sysUserRouteMapper;

    @Override
    public List<String> selectByUserId(Long userId) {
        return sysUserRouteMapper.selectByUserId(userId);
    }
}