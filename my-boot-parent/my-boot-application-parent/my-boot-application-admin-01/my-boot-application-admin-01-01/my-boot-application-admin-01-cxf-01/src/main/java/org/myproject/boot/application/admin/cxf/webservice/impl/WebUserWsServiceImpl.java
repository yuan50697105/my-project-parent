package org.myproject.boot.application.admin.cxf.webservice.impl;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import cn.hutool.json.JSONUtil;
import org.myproject.boot.application.admin.cxf.pojo.User;
import org.myproject.boot.application.admin.cxf.webservice.WebUserWsService;
import org.myproject.boot.application.admin.db.converter.SysUserConverter;
import org.myproject.boot.application.admin.db.pojo.SysUser;
import org.myproject.boot.application.admin.db.pojo.SysUserQuery;
import org.myproject.boot.application.admin.db.pojo.SysUserVo;
import org.myproject.boot.application.admin.db.service.table.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.jws.WebService;
import java.util.List;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-25 15:47
 */
@WebService(targetNamespace = WebUserWsService.NAMESPACE,
        serviceName = WebUserWsService.SERVICE_NAME,
        portName = WebUserWsService.SERVICE_NAME,
        endpointInterface = "org.myproject.boot.application.admin.cxf.webservice.WebUserWsService")
@Component
public class WebUserWsServiceImpl implements WebUserWsService {
    @Autowired
    private SysUserService sysUserService;
    @Autowired
    private SysUserConverter sysUserConverter;

    @Override
    public String user() {
        User user = new User();
        user.setId(1L);
        user.setName("aaa");
        return JSONUtil.toJsonPrettyStr(user);
    }

    @Override
    @Transactional
    public Result<?> save(SysUserVo sysUserVo) {
        SysUser sysUser = sysUserConverter.voToPo(sysUserVo);
        sysUserService.insert(sysUser);
        return ResultInfo.success();
    }

    @Override
    @Transactional
    public Result<?> update(SysUserVo sysUserVo) {
        SysUser sysUser = sysUserConverter.voToPo(sysUserVo);
        sysUserService.updateByPrimaryKeySelective(sysUser);
        return ResultInfo.success();
    }

    @Override
    public Result<?> list(SysUserQuery query) {
        List<SysUser> list = sysUserService.selectByQuery(query);
        return ResultInfo.success(list);
    }
}