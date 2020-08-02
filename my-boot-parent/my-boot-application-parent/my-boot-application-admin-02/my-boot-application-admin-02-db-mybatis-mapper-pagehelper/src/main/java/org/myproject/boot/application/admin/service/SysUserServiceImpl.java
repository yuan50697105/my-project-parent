package org.myproject.boot.application.admin.service;

import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.pojo.TbSysUser;
import org.myproject.boot.application.admin.db.pojo.TbSysUserQuery;
import org.myproject.boot.application.admin.db.service.TbSysUserService;
import org.myproject.boot.application.admin.service.converter.EntityConverter;
import org.myproject.boot.application.admin.service.pojo.IDBPageResult;
import org.myproject.boot.application.admin.service.pojo.ao.SysUserAo;
import org.myproject.boot.application.admin.service.pojo.dto.IPageResult;
import org.myproject.boot.application.admin.service.pojo.query.SysUserQuery;
import org.myproject.boot.application.admin.service.pojo.vo.SysUserVo;
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
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private EntityConverter converter;
    @Autowired
    private TbSysUserService sysUserService;

    @Override
    @Transactional
    public boolean save(SysUserVo vo) {
        switch (vo.event()) {
            case SAVE:
            case ADD:
                return add(vo);
            case UPDATE_INFO:
                return updateInfo(vo);
            case UPDATE_ROLE:
                return updateRole(vo);
            case UPDATE:
                break;
        }
        return false;
    }

    @Override
    @Transactional
    public boolean delete(Long id) {
        return sysUserService.deleteByPrimaryKey(id) > 0;
    }

    @Override
    public SysUserAo getById(Long id) {
        TbSysUser tbSysUser = sysUserService.selectByPrimaryKey(id);
        return converter.convertSysUserForGet(tbSysUser);
    }

    @Override
    public IPageResult<SysUserAo> page(SysUserQuery query) {
        TbSysUserQuery tbQuery = converter.convertSysUserForQuery(query);
        PageInfo<TbSysUser> pageInfo = sysUserService.selectByQuery(tbQuery, query.getPage(), query.getLimit());
        return new IDBPageResult<>(converter.convertSysUserForPage(pageInfo));
    }

    @Override
    public List<SysUserAo> list(SysUserQuery query) {
        TbSysUserQuery sysUserQuery = converter.convertSysUserForQuery(query);
        List<TbSysUser> tbSysUsers = sysUserService.selectByQuery(sysUserQuery);
        return converter.convertSysUserForList(tbSysUsers);
    }

    @Override
    public CompletableFuture<SysUserAo> getByIdAsync(Long id) {
        SysUserAo ao = getById(id);
        return CompletableFuture.completedFuture(ao);
    }

    @Override
    @Async
    public CompletableFuture<IPageResult<SysUserAo>> pageAsync(SysUserQuery query) {
        return CompletableFuture.completedFuture(page(query));
    }

    @Override
    @Async
    public CompletableFuture<List<SysUserAo>> listAsync(SysUserQuery query) {
        return CompletableFuture.completedFuture(list(query));
    }

    @Override
    @Async
    @Transactional
    public CompletableFuture<Boolean> saveAsync(SysUserVo vo) {
        return CompletableFuture.completedFuture(save(vo));
    }

    @Override
    @Async
    @Transactional
    public CompletableFuture<Boolean> deleteAsync(Long id) {
        return CompletableFuture.completedFuture(delete(id));
    }

    private boolean add(SysUserVo vo) {
        TbSysUser record = converter.convertSysUserForAdd(vo);
        return sysUserService.insert(record) > 0;
    }

    private boolean updateInfo(SysUserVo vo) {
        TbSysUser tbSysUser = sysUserService.selectByPrimaryKey(vo.id());
        converter.convertSysUserForUpdateInfo(vo, tbSysUser);
        return sysUserService.updateByPrimaryKeySelective(tbSysUser) > 0;
    }

    private boolean updateRole(SysUserVo vo) {
        return false;
    }
}