package org.myproject.boot.application.admin.service;

import org.myproject.boot.application.admin.db.pojo.TbSysUser;
import org.myproject.boot.application.admin.db.service.TbSysUserService;
import org.myproject.boot.application.admin.service.pojo.SysUserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
        }
        return false;
    }

    @Override
    @Async
    @Transactional
    public CompletableFuture<Boolean> saveAsync(SysUserVo vo) {
        return CompletableFuture.completedFuture(save(vo));
    }

    private boolean add(SysUserVo vo) {
        TbSysUser record = converter.sysUserForAdd(vo);
        return sysUserService.insert(record) > 0;
    }

    private boolean updateInfo(SysUserVo vo) {
        TbSysUser record = converter.sysUserForUpdateInfo(vo);
        return sysUserService.updateByPrimaryKeySelective(record) > 0;
    }

    private boolean updateRole(SysUserVo vo) {
        return false;
    }
}