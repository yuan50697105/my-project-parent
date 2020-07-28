package org.myproject.boot.application.admin.service;

import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.pojo.TbSysRole;
import org.myproject.boot.application.admin.db.pojo.TbSysRoleQuery;
import org.myproject.boot.application.admin.db.service.EntityConverter;
import org.myproject.boot.application.admin.db.service.TbSysRoleService;
import org.myproject.boot.application.admin.service.pojo.IDBPageResult;
import org.myproject.boot.application.admin.service.pojo.ao.SysRoleAo;
import org.myproject.boot.application.admin.service.pojo.dto.IPageResult;
import org.myproject.boot.application.admin.service.pojo.query.SysRoleQuery;
import org.myproject.boot.application.admin.service.pojo.vo.SysRoleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.concurrent.CompletableFuture;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-28 09:16
 */
@Service
public class SysRoleServiceImpl implements SysRoleService {
    @Autowired
    private EntityConverter converter;
    @Autowired
    private TbSysRoleService service;

    @Override
    @Transactional
    public boolean save(SysRoleVo vo) {
        switch (vo.event()) {
            case ADD:
                return add(vo);
            case UPDATE:
                return update(vo);
        }
        return false;
    }

    @Override
    @Transactional
    public boolean delete(Long id) {
        return service.deleteByPrimaryKey(id) > 0;
    }

    @Override
    public SysRoleAo getById(Long id) {
        TbSysRole tbSysRole = service.selectByPrimaryKey(id);
        return converter.convertSysRoleForGet(tbSysRole);
    }

    @Override
    public IPageResult<SysRoleAo> page(SysRoleQuery query) {
        TbSysRoleQuery tbQuery = converter.convertSysRoleForQuery(query);
        PageInfo<TbSysRole> pageInfo = service.selectByQuery(tbQuery, query.getPage(), query.getLimit());
        return new IDBPageResult<>(converter.convertSysRoleForPage(pageInfo));
    }

    @Override
    public List<SysRoleAo> list(SysRoleQuery query) {
        TbSysRoleQuery sysUserQuery = converter.convertSysRoleForQuery(query);
        List<TbSysRole> tbSysRoles = service.selectByQuery(sysUserQuery);
        return converter.convertSysRoleForList(tbSysRoles);
    }

    @Override
    public CompletableFuture<SysRoleAo> getByIdAsync(Long id) {
        SysRoleAo ao = getById(id);
        return CompletableFuture.completedFuture(ao);
    }

    @Override
    @Async
    public CompletableFuture<IPageResult<SysRoleAo>> pageAsync(SysRoleQuery query) {
        return CompletableFuture.completedFuture(page(query));
    }

    @Override
    @Async
    public CompletableFuture<List<SysRoleAo>> listAsync(SysRoleQuery query) {
        return CompletableFuture.completedFuture(list(query));
    }

    @Override
    @Async
    @Transactional
    public CompletableFuture<Boolean> saveAsync(SysRoleVo vo) {
        return CompletableFuture.completedFuture(save(vo));
    }

    @Override
    @Async
    @Transactional
    public CompletableFuture<Boolean> deleteAsync(Long id) {
        return CompletableFuture.completedFuture(delete(id));
    }

    private boolean add(SysRoleVo vo) {
        TbSysRole record = converter.convertSysRoleForAdd(vo);
        return service.insert(record) > 0;
    }

    private boolean update(SysRoleVo vo) {
        TbSysRole tbSysRole = service.selectByPrimaryKey(vo.id());
        converter.convertSysRoleForUpdateInfo(vo, tbSysRole);
        return service.updateByPrimaryKeySelective(tbSysRole) > 0;
    }

}