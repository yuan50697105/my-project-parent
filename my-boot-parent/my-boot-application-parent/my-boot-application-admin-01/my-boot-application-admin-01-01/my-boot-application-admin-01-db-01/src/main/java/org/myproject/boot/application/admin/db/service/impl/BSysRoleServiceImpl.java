package org.myproject.boot.application.admin.db.service.impl;

import com.google.common.collect.Lists;

import lombok.AllArgsConstructor;
import org.myproject.boot.application.admin.db.pojo.*;
import org.myproject.boot.application.admin.db.service.BSysRoleService;
import org.myproject.boot.application.admin.db.service.SysRoleRouteService;
import org.myproject.boot.application.admin.db.service.SysRoleService;
import org.myproject.boot.application.admin.db.service.SysRouteService;
import org.myproject.boot.mybatis.pojo.PageResult;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: my-boot-application-admin-01-01
 * @description:
 * @author: yuane
 * @create: 2020-07-04 23:35
 */
@Service
@Transactional
@AllArgsConstructor
public class BSysRoleServiceImpl implements BSysRoleService {
    private final SysRoleService sysRoleService;
    private final SysRouteService sysRouteService;
    private final SysRoleRouteService sysRoleRouteService;

    @Override
    public PageResult<SysRole> selectByQueryWithPage(int page, int size, SysRoleQuery query) {
        return new PageResult<>(sysRoleService.selectByQueryWithPage(page, size, query));
    }

    @Override
    public List<SysRole> selectByQuery(SysRoleQuery query) {
        return sysRoleService.selectByQuery(query);
    }

    @Override
    public SysRole selectByPrimaryKey(Long id) {
        return sysRoleService.selectByPrimaryKey(id);
    }

    @Override
    public void insert(SysRoleVo sysRoleVo) {
        SysRole sysRole = createRole(sysRoleVo);
        sysRoleService.insert(sysRole);
        List<SysRoute> sysRoutes = selectRoutesByIds(sysRoleVo.getRouteIds());
        List<SysRoleRoute> sysRoleRoutes = createRoleRoute(sysRole, sysRoutes);
        sysRoleRoutes.forEach(sysRoleRouteService::insert);
    }

    private List<SysRoleRoute> createRoleRoute(SysRole sysRole, List<SysRoute> sysRoutes) {
        List<SysRoleRoute> sysRoleRoutes = Lists.newArrayList();
        for (SysRoute sysRoute : sysRoutes) {
            sysRoleRoutes.add(new SysRoleRoute(sysRole.getId(), sysRoute.getId()));
        }
        return sysRoleRoutes;
    }

    private List<SysRoute> selectRoutesByIds(List<Long> routeIds) {
        SysRouteExample example = new SysRouteExample();
        example.or().andIdIn(routeIds);
        return sysRouteService.selectByExample(example);
    }

    private SysRole createRole(SysRoleVo sysRoleVo) {
        SysRole sysRole = new SysRole();
        sysRole.setName(sysRoleVo.getName());
        sysRole.setDescription(sysRoleVo.getDescription());
        sysRole.setEnabled(sysRoleVo.getEnabled());
        sysRole.setId(sysRoleVo.getId());
        return sysRole;
    }

    @Override
    public void updateByPrimaryKeySelective(SysRoleVo sysRoleVo) {

    }

    @Override
    public void deleteByIds(List<Long> ids) {

    }

    @Override
    public void deleteByPrimaryKey(Long id) {

    }
}