package org.myproject.boot.application.admin.db.service.business.impl;

import lombok.AllArgsConstructor;
import org.myproject.boot.application.admin.db.pojo.SysRole;
import org.myproject.boot.application.admin.db.pojo.SysRoleQuery;
import org.myproject.boot.application.admin.db.pojo.SysRoleVo;
import org.myproject.boot.application.admin.db.service.business.BSysRoleService;
import org.myproject.boot.application.admin.db.service.table.SysRoleService;
import org.myproject.boot.mybatis.pojo.PageResult;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.util.Sqls;

import java.util.List;

/**
 * @program: my-boot-application-admin-01-06
 * @description:
 * @author: yuane
 * @create: 2020-07-06 20:51
 */
@Service
@AllArgsConstructor
@Transactional
public class BSysRoleServiceImpl implements BSysRoleService {
    private final SysRoleService sysRoleService;

    @Override
    public PageResult<SysRole> selectByQuery(SysRoleQuery query, int page, int size) {
        return new PageResult<>(sysRoleService.selectByQuery(query, page, size));
    }

    @Override
    public List<SysRole> selectByQuery(SysRoleQuery query) {
        return sysRoleService.selectByQuery(query);
    }

    @Override
    public SysRole selectById(Long id) {
        return sysRoleService.selectByPrimaryKey(id);
    }

    @Override
    public void save(SysRoleVo sysRoleVo) {
        sysRoleService.insert(convert(sysRoleVo));
    }

    @Override
    public void update(SysRoleVo sysRoleVo) {
        sysRoleService.updateByPrimaryKeySelective(convert(sysRoleVo));
    }

    @Override
    public void delete(List<Long> ids) {
        Example id = Example.builder(SysRole.class).where(Sqls.custom().andIn("id", ids)).build();
        sysRoleService.deleteByExample(id);
    }

    @Override
    public void delete(Long id) {
        sysRoleService.deleteByPrimaryKey(id);
    }

    private SysRole convert(SysRoleVo sysRoleVo) {
        SysRole sysRole = new SysRole();
        sysRole.setName(sysRoleVo.getName());
        sysRole.setDescription(sysRoleVo.getDescription());
        sysRole.setEnabled(sysRoleVo.getEnabled());
        sysRole.setId(sysRoleVo.getId());
        return sysRole;
    }
}