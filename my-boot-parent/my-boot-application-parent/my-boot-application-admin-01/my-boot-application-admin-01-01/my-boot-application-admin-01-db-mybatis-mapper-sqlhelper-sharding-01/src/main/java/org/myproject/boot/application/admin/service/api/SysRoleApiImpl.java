package org.myproject.boot.application.admin.service.api;

import com.github.pagehelper.PageInfo;
import lombok.AllArgsConstructor;
import org.myproject.boot.application.admin.db.converter.TbConverter;
import org.myproject.boot.application.admin.db.pojo.TbSysRole;
import org.myproject.boot.application.admin.db.pojo.TbSysRoleQuery;
import org.myproject.boot.application.admin.db.service.TbSysRoleService;
import org.myproject.boot.application.admin.service.pojo.SysRole;
import org.myproject.boot.application.admin.service.pojo.SysRoleQuery;
import org.myproject.boot.application.admin.service.pojo.SysRoleVo;
import org.myproject.boot.mybatis.commons.pojo.IPage;
import org.myproject.boot.mybatis.pojo.PageResult;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-11 19:31
 */
@Service
@AllArgsConstructor
@Transactional
@Primary
public class SysRoleApiImpl implements BSysRoleApi {
    private final TbConverter converter;
    private final TbSysRoleService sysRoleService;

    @Override
    public IPage<SysRole> selectByQuery(SysRoleQuery query, int page, int size) {
        TbSysRoleQuery sysRoleQuery = converter.sysRole(query);
        PageInfo<TbSysRole> pageInfo = sysRoleService.selectByQuery(sysRoleQuery, page, size);
        return new PageResult<>(converter.sysRole(pageInfo));
    }

    @Override
    public List<SysRole> selectByQuery(SysRoleQuery query) {
        TbSysRoleQuery sysRoleQuery = converter.sysRole(query);
        return converter.sysRole(sysRoleService.selectByQuery(sysRoleQuery));
    }

    @Override
    public SysRole get(Long id) {
        return converter.sysRole(sysRoleService.selectByPrimaryKey(id));
    }

    @Override
    public void save(SysRoleVo sysRoleVo) {
        sysRoleService.insert(converter.sysRole(sysRoleVo));
    }

    @Override
    public void update(SysRoleVo sysRoleVo) {
        sysRoleService.updateByPrimaryKeySelective(converter.sysRole(sysRoleVo));
    }

    @Override
    public void delete(List<Long> ids) {
        ids.forEach(sysRoleService::deleteByPrimaryKey);
    }

    @Override
    public void delete(Long id) {
        sysRoleService.deleteByPrimaryKey(id);
    }
}
