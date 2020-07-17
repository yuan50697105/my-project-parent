package org.myproject.cloud.application.admin.api.api;

import com.github.pagehelper.PageInfo;
import lombok.AllArgsConstructor;
import org.myproject.boot.mybatis.commons.pojo.IPage;
import org.myproject.boot.mybatis.pojo.PageResult;
import org.myproject.cloud.application.admin.api.pojo.BSysRole;
import org.myproject.cloud.application.admin.api.pojo.BSysRoleQuery;
import org.myproject.cloud.application.admin.api.pojo.BSysRoleVo;
import org.myproject.cloud.application.admin.db.converter.TbConverter;
import org.myproject.cloud.application.admin.db.pojo.TbSysRole;
import org.myproject.cloud.application.admin.db.pojo.TbSysRoleQuery;
import org.myproject.cloud.application.admin.db.service.TbSysRoleService;
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
    public IPage<BSysRole> selectByQuery(BSysRoleQuery query, int page, int size) {
        TbSysRoleQuery sysRoleQuery = converter.sysRole(query);
        PageInfo<TbSysRole> pageInfo = sysRoleService.selectByQuery(sysRoleQuery, page, size);
        return new PageResult<>(converter.sysRole(pageInfo));
    }

    @Override
    public List<BSysRole> selectByQuery(BSysRoleQuery query) {
        TbSysRoleQuery sysRoleQuery = converter.sysRole(query);
        return converter.sysRole(sysRoleService.selectByQuery(sysRoleQuery));
    }

    @Override
    public BSysRole get(Long id) {
        return converter.sysRole(sysRoleService.selectByPrimaryKey(id));
    }

    @Override
    public void save(BSysRoleVo BSysRoleVo) {
        sysRoleService.insert(converter.sysRole(BSysRoleVo));
    }

    @Override
    public void update(BSysRoleVo BSysRoleVo) {
        switch (BSysRoleVo.getOp()) {
            case UPDATE_INFO:
                updateInfo(BSysRoleVo);
                break;
            case UPDATE_ROUTE:
                updateRoute(BSysRoleVo);
                break;
            case ADD:
            case UPDATE:
            default:
                break;
        }
    }

    private int updateInfo(BSysRoleVo BSysRoleVo) {
        return sysRoleService.updateByPrimaryKeySelective(converter.sysRole(BSysRoleVo));
    }

    private void updateRoute(BSysRoleVo bSysRoleVo) {
        throw new RuntimeException("不可用");
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
