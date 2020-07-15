package org.myproject.boot.application.admin.service.api;


import com.github.pagehelper.PageInfo;
import lombok.AllArgsConstructor;
import org.myproject.boot.application.admin.db.converter.TbConverter;
import org.myproject.boot.application.admin.db.pojo.TbSysUser;
import org.myproject.boot.application.admin.db.pojo.TbSysUserQuery;
import org.myproject.boot.application.admin.db.service.TbSysUserService;
import org.myproject.boot.application.admin.service.pojo.BSysUser;
import org.myproject.boot.application.admin.service.pojo.BSysUserQuery;
import org.myproject.boot.application.admin.service.pojo.BSysUserVo;
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
    public IPage<BSysUser> selectByQuery(BSysUserQuery query, int page, int size) {
        TbSysUserQuery sysUserQuery = converter.sysUser(query);
        PageInfo<TbSysUser> pageInfo = sysUserService.selectByQuery(sysUserQuery, page, size);
        return new PageResult<>(converter.sysUser(pageInfo));
    }

    @Override
    public List<BSysUser> selectByQuery(BSysUserQuery query) {
        TbSysUserQuery sysUserQuery = converter.sysUser(query);
        List<TbSysUser> list = sysUserService.selectByQuery(sysUserQuery);
        return converter.sysUser(list);
    }

    @Override
    public BSysUser get(Long id) {
        TbSysUser sysUser = sysUserService.getById(id);
        return converter.sysUser(sysUser);
    }

    @Override
    public void save(BSysUserVo sysUser) {
        sysUserService.save(converter.sysUser(sysUser));
    }

    @Override
    public void update(BSysUserVo sysUser) {
        sysUserService.updateById(converter.sysUserUpdate(sysUser));
    }

    @Override
    public void delete(Long id) {
        sysUserService.removeById(id);
    }

    @Override
    public void delete(List<Long> ids) {
        sysUserService.removeByIds(ids);
    }

    @Override
    public void modify(BSysUserVo BSysUserVo) {
        sysUserService.updateById(converter.sysUserUpdate(BSysUserVo));
    }
}
