package org.myproject.boot.application.admin.db.service;

import com.github.pagehelper.PageInfo;
import lombok.AllArgsConstructor;
import org.myproject.boot.application.admin.db.converter.SysRoleConverter;
import org.myproject.boot.application.admin.db.converter.SysRoleRouteConverter;
import org.myproject.boot.application.admin.db.pojo.SysRoleExample;
import org.myproject.boot.application.admin.db.pojo.SysRoleRoute;
import org.myproject.boot.application.admin.db.pojo.SysRoute;
import org.myproject.boot.application.admin.db.pojo.SysRouteExample;
import org.myproject.boot.application.admin.db.service.table.SysRoleRouteService;
import org.myproject.boot.application.admin.db.service.table.SysRoleService;
import org.myproject.boot.application.admin.db.service.table.SysRouteService;
import org.myproject.boot.application.admin.pojo.SysRole;
import org.myproject.boot.application.admin.pojo.SysRoleQuery;
import org.myproject.boot.application.admin.pojo.SysRoleVo;
import org.myproject.boot.application.admin.service.BSysRoleService;
import org.myproject.boot.mybatis.commons.pojo.IPage;
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
    private final SysRoleConverter sysRoleConverter;
    private final SysRoleRouteConverter sysRoleRouteConverter;

    @Override
    public IPage<SysRole> selectByQuery(SysRoleQuery query, int page, int size) {
        org.myproject.boot.application.admin.db.pojo.SysRoleQuery sysRoleQuery = sysRoleConverter.convert(query);
        PageInfo<org.myproject.boot.application.admin.db.pojo.SysRole> pageInfo = sysRoleService.selectByQuery(sysRoleQuery, page, size);
        return new PageResult<>(sysRoleConverter.convert(pageInfo));
    }

    @Override
    public List<SysRole> selectByQuery(SysRoleQuery query) {
        org.myproject.boot.application.admin.db.pojo.SysRoleQuery sysRoleQuery = sysRoleConverter.convert(query);
        List<org.myproject.boot.application.admin.db.pojo.SysRole> list = sysRoleService.selectByQuery(sysRoleQuery);
        return sysRoleConverter.convert(list);
    }

    @Override
    public SysRole selectById(Long id) {
        org.myproject.boot.application.admin.db.pojo.SysRole sysRole = sysRoleService.selectByPrimaryKey(id);
        return sysRoleConverter.convert(sysRole);
    }

    @Override
    public void insert(SysRoleVo sysRoleVo) {
        org.myproject.boot.application.admin.db.pojo.SysRole sysRole = sysRoleConverter.convert(sysRoleVo);
        sysRoleService.insert(sysRole);
        List<SysRoute> sysRoutes = selectRoutesByIds(sysRoleVo.getRouteIds());
        List<SysRoleRoute> sysRoleRoutes = sysRoleRouteConverter.convert(sysRole, sysRoutes);
        sysRoleRoutes.forEach(sysRoleRouteService::insert);
    }

    private List<SysRoute> selectRoutesByIds(List<Long> routeIds) {
        SysRouteExample example = new SysRouteExample();
        example.or().andIdIn(routeIds);
        return sysRouteService.selectByExample(example);
    }

    @Override
    public void update(SysRoleVo sysRoleVo) {
        org.myproject.boot.application.admin.db.pojo.SysRole sysRole = sysRoleConverter.convert(sysRoleVo);
        sysRoleService.updateByPrimaryKeySelective(sysRole);
    }

    @Override
    public void delete(List<Long> ids) {
        SysRoleExample example = new SysRoleExample();
        example.or().andIdIn(ids);
        sysRoleService.deleteByExample(example);
    }

    @Override
    public void delete(Long id) {
        sysRoleService.deleteByPrimaryKey(id);
    }
}