package org.myproject.boot.application.admin.mvc.view.contorller;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import lombok.AllArgsConstructor;
import org.myproject.boot.application.admin.api.api.BSysUserApi;
import org.myproject.boot.application.admin.api.pojo.BSysUser;
import org.myproject.boot.application.admin.api.pojo.BSysUserQuery;
import org.myproject.boot.application.admin.api.pojo.BSysUserVo;
import org.myproject.boot.application.admin.api.pojo.IPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
    public IPage<BSysUser> data(BSysUserQuery query, int page, int size) {
        return sysUserApi.selectByQuery(query, page, size);
    }

    @GetMapping("list")
    public List<BSysUser> list(BSysUserQuery query) {
        return sysUserApi.selectByQuery(query);
    }

    @GetMapping("get")
    public BSysUser get(Long id) {
        return sysUserApi.get(id);
    }

    @PostMapping("save")
    public Result<?> save(BSysUserVo BSysUserVo) {
        sysUserApi.save(BSysUserVo);
        return ResultInfo.success();
    }

    @PostMapping("update")
    public Result<?> update(BSysUserVo BSysUserVo) {
        sysUserApi.update(BSysUserVo);
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