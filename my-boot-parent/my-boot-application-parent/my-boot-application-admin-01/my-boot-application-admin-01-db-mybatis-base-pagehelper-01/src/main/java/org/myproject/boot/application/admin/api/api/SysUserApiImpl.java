package org.myproject.boot.application.admin.api.api;

import lombok.AllArgsConstructor;
import org.myproject.boot.application.admin.db.converter.TbConverter;
import org.myproject.boot.application.admin.db.pojo.*;
import org.myproject.boot.application.admin.db.service.TbSysRoleService;
import org.myproject.boot.application.admin.db.service.TbSysUserRoleService;
import org.myproject.boot.application.admin.db.service.TbSysUserService;
import org.myproject.boot.application.admin.api.pojo.BSysUser;
import org.myproject.boot.application.admin.api.pojo.BSysUserQuery;
import org.myproject.boot.application.admin.api.pojo.BSysUserVo;
import org.myproject.boot.mybatis.commons.pojo.IPage;
import org.myproject.boot.mybatis.pojo.BaseEntity;
import org.myproject.boot.mybatis.pojo.PageResult;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-11 19:36
 */
@Service
@AllArgsConstructor
@Transactional
@Primary
public class SysUserApiImpl implements BSysUserApi {
    private final TbConverter converter;
    private final TbSysUserService sysUserService;
    private final TbSysUserRoleService sysUserRoleService;
    private final TbSysRoleService sysRoleService;

    @Override
    public IPage<BSysUser> selectByQuery(BSysUserQuery query, int page, int size) {
        TbSysUserQuery sysUserQuery = converter.sysUser(query);
        return new PageResult<>(converter.sysUser(sysUserService.selectByQuery(sysUserQuery, page, size)));
    }

    @Override
    public List<BSysUser> selectByQuery(BSysUserQuery query) {
        TbSysUserQuery sysUserQuery = converter.sysUser(query);
        return converter.sysUser(sysUserService.selectByQuery(sysUserQuery));
    }

    @Override
    public BSysUser get(Long id) {
        return converter.sysUser(sysUserService.selectByPrimaryKey(id));
    }

    @Override
    public void save(BSysUserVo BSysUserVo) {
        addUser(BSysUserVo);
    }

    @Override
    public void update(BSysUserVo sysUser) {
        sysUserService.saveOrUpdate(converter.sysUser(sysUser));
    }

    @Override
    public void delete(List<Long> ids) {
        ids.forEach(sysUserService::deleteByPrimaryKey);
    }

    @Override
    public void modify(BSysUserVo BSysUserVo) {
        switch (BSysUserVo.getOp()) {
            default:
            case ADD:
                break;
            case UPDATE_INFO:
                updateInfo(BSysUserVo);
                break;
            case UPDATE_ROLE:
                updateRole(BSysUserVo);
                break;
        }

    }

    @Override
    public void delete(Long id) {
        sysUserService.deleteByPrimaryKey(id);
    }

    private void addUser(BSysUserVo BSysUserVo) {
        TbSysUser sysUser = converter.sysUser(BSysUserVo);
        sysUserService.insert(sysUser);
        TbSysRoleExample example = new TbSysRoleExample();
        example.or().andIdIn(BSysUserVo.getRoleIds());
        List<TbSysRole> sysRoles = sysRoleService.selectByExample(example);
        List<Long> roleIds = sysRoles.stream().map(BaseEntity::getId).distinct().collect(Collectors.toList());
        List<TbSysUserRole> sysUserRoles = converter.sysUserRole(sysUser.getId(), roleIds);
        sysUserRoles.forEach(sysUserRoleService::insert);
    }

    private void updateInfo(BSysUserVo BSysUserVo) {
        sysUserService.updateByPrimaryKeySelective(converter.sysUser(BSysUserVo));
    }

    private void updateRole(BSysUserVo BSysUserVo) {
        Long id = BSysUserVo.getId();
        List<Long> roleIds = BSysUserVo.getRoleIds();
        sysUserRoleService.deleteByUserId(id);
        List<TbSysUserRole> sysUserRoles = converter.sysUserRole(id, roleIds);
        sysUserRoles.forEach(sysUserRoleService::insert);
    }
}