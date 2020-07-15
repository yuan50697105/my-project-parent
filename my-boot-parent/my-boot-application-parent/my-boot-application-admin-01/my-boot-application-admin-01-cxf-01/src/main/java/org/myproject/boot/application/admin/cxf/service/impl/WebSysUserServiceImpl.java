package org.myproject.boot.application.admin.cxf.service.impl;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import org.myproject.boot.application.admin.cxf.service.WebSysUserService;
import org.myproject.boot.application.admin.service.api.BSysUserApi;
import org.myproject.boot.application.admin.service.pojo.BSysUserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import javax.jws.WebService;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-11 23:28
 */
@Component
@WebService(targetNamespace = "http://web.sys.user",endpointInterface = "org.myproject.boot.application.admin.cxf.service.WebSysUserService")
@Transactional
public class WebSysUserServiceImpl implements WebSysUserService {
    @Autowired
    private BSysUserApi sysUserApi;

    @Override
    public Result<?> save(@Validated BSysUserVo BSysUserVo) {
        sysUserApi.save(BSysUserVo);
        return ResultInfo.success();
    }
}