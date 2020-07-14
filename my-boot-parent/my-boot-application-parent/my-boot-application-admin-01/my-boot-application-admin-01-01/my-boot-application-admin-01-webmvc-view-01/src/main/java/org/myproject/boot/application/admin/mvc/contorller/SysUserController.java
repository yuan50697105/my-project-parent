package org.myproject.boot.application.admin.mvc.contorller;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import lombok.AllArgsConstructor;
import org.myproject.boot.application.admin.service.api.BSysUserApi;
import org.myproject.boot.application.admin.service.pojo.SysUser;
import org.myproject.boot.application.admin.service.pojo.SysUserQuery;
import org.myproject.boot.application.admin.service.pojo.SysUserVo;
import org.myproject.boot.mybatis.commons.pojo.IPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import retrofit2.http.POST;

import java.util.List;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-14 20:34
 */
@Controller
@RequestMapping("sys/user")
@AllArgsConstructor
public class SysUserController {
    private final static String BASE_URL = "sys/user/";
    @Autowired
    private final BSysUserApi sysUserApi;


    @GetMapping
    public String index() {
        return BASE_URL + "index";
    }

    @GetMapping("data")
    public IPage<SysUser> data(SysUserQuery query, int page, int size) {
        return sysUserApi.selectByQuery(query, page, size);
    }

    @GetMapping("list")
    public List<SysUser> list(SysUserQuery query) {
        return sysUserApi.selectByQuery(query);
    }

    @GetMapping("get")
    public SysUser get(Long id) {
        return sysUserApi.get(id);
    }

    @PostMapping("save")
    public Result<?> save(SysUserVo sysUserVo) {
        sysUserApi.save(sysUserVo);
        return ResultInfo.success();
    }

    @PostMapping("update")
    public Result<?> update(SysUserVo sysUserVo) {
        sysUserApi.update(sysUserVo);
        return ResultInfo.success();
    }

    @GetMapping(value = "delete", params = "id")
    public Result<?> delete(Long id) {
        sysUserApi.delete(id);
        return ResultInfo.success();
    }

    @GetMapping(value = "delete", params = "ids")
    public Result<?> delete(List<Long> ids) {
        sysUserApi.delete(ids);
        return ResultInfo.success();
    }
}