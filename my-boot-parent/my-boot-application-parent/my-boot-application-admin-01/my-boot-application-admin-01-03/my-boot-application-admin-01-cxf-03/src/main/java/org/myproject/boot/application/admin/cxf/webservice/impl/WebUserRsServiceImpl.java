package org.myproject.boot.application.admin.cxf.webservice.impl;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import org.myproject.boot.application.admin.cxf.webservice.WebUserRsService;
import org.myproject.boot.application.admin.db.pojo.SysUser;
import org.myproject.boot.application.admin.db.service.table.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-25 18:29
 */
@Service
public class WebUserRsServiceImpl implements WebUserRsService {
    @Autowired
    private SysUserService sysUserService;

    @Override
    public String aa() {
        return "aa";
    }

    @Override
    @Transactional
    public Result<?> save(SysUser sysUser) {
        sysUserService.save(sysUser);
        return ResultInfo.success();
    }

}