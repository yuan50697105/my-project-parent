package org.myproject.boot.application.admin.cxf.service;

import ai.yue.library.base.view.Result;
import org.myproject.boot.application.admin.service.pojo.SysUserVo;
import org.springframework.validation.annotation.Validated;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.ws.rs.core.Context;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-11 23:28
 */
@WebService
public interface WebSysUserService {
    @WebMethod
    Result<?> save(@Context @Validated SysUserVo sysUserVo);
}
