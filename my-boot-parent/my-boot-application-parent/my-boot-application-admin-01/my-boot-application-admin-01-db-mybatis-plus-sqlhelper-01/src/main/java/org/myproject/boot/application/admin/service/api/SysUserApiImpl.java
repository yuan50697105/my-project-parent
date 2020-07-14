package org.myproject.boot.application.admin.service.api;


import com.github.pagehelper.PageInfo;
import lombok.AllArgsConstructor;
import org.myproject.boot.application.admin.db.converter.TbConverter;
import org.myproject.boot.application.admin.db.pojo.TbSysUser;
import org.myproject.boot.application.admin.db.pojo.TbSysUserQuery;
import org.myproject.boot.application.admin.db.service.TbSysUserService;
import org.myproject.boot.application.admin.service.pojo.SysUser;
import org.myproject.boot.application.admin.service.pojo.SysUserQuery;
import org.myproject.boot.application.admin.service.pojo.SysUserVo;
import org.myproject.boot.mybatis.commons.pojo.IPage;
import org.myproject.boot.mybatis.pojo.PageResult;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: my-boot-application-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-07-04 23:17
 */
@Service
@AllArgsConstructor
@Transactional
public class SysUserApiImpl implements BSysUserApi {
    private final TbConverter converter;
    private final TbSysUserService sysUserService;

    @Override
    public IPage<SysUser> selectByQuery(SysUserQuery query, int page, int size) {
        TbSysUserQuery sysUserQuery = converter.sysUser(query);
        PageInfo<TbSysUser> pageInfo = sysUserService.selectByQuery(sysUserQuery, page, size);
        return new PageResult<>(converter.sysUser(pageInfo));
    }

    @Override
    public List<SysUser> selectByQuery(SysUserQuery query) {
        TbSysUserQuery sysUserQuery = converter.sysUser(query);
        List<TbSysUser> list = sysUserService.selectByQuery(sysUserQuery);
        return converter.sysUser(list);
    }

    @Override
    public SysUser get(Long id) {
        TbSysUser sysUser = sysUserService.getById(id);
        return converter.sysUser(sysUser);
    }

    @Override
    public void save(SysUserVo sysUser) {
        sysUserService.save(converter.sysUser(sysUser));
    }

    @Override
    public void update(SysUserVo sysUser) {
        sysUserService.updateById(converter.sysUser(sysUser));
    }

    @Override
    public void delete(Long id) {
        sysUserService.removeById(id);
    }

    @Override
    public void delete(List<Long> ids) {
        sysUserService.removeByIds(ids);
    }
}
