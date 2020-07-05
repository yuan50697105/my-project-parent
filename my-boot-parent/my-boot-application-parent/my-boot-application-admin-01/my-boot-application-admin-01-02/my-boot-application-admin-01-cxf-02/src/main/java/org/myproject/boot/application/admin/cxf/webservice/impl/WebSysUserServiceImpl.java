package org.myproject.boot.application.admin.cxf.webservice.impl;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import org.myproject.boot.application.admin.cxf.webservice.WebSysUserService;
import org.myproject.boot.application.admin.db.converter.SysUserConverter;
import org.myproject.boot.application.admin.db.pojo.SysUser;
import org.myproject.boot.application.admin.db.pojo.SysUserVo;
import org.myproject.boot.application.admin.db.service.base.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.jws.WebService;

/**
 * @program: my-boot-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-27 18:07
 */
@WebService(targetNamespace = WebSysUserService.TARGET_NAMESPACE,
        serviceName = WebSysUserService.SERVICE_NAME, endpointInterface = "org.myproject.boot.application.admin.cxf.webservice.WebSysUserService")
@Component
public class WebSysUserServiceImpl implements WebSysUserService {
    @Autowired
    private SysUserService sysUserService;
    @Autowired
    private SysUserConverter sysUserConverter;

    @Override
    @Transactional
    public Result<?> save(SysUserVo sysUserVo) {
        SysUser sysUser = sysUserConverter.voToPo(sysUserVo);
        sysUserService.insert(sysUser);
        return ResultInfo.success();
    }
}