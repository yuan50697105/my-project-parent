package org.myproject.boot.application.admin.mvc.api.controller;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import org.myproject.boot.application.admin.api.api.BGoodsInfoApi;
import org.myproject.boot.application.admin.api.pojo.BGoodsInfo;
import org.myproject.boot.application.admin.api.pojo.BGoodsInfoQuery;
import org.myproject.boot.application.admin.api.pojo.BGoodsInfoVo;
import org.myproject.boot.mybatis.commons.pojo.IPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-25 19:06
 */
@RestController
@RequestMapping("goods/info")
public class GoodsInfoController {
    @Autowired
    private BGoodsInfoApi goodsInfoApi;

    @GetMapping(value = "data")
    public Result<?> data(BGoodsInfoQuery query,
                          @RequestParam(defaultValue = "1") int page,
                          @RequestParam(defaultValue = "20") int size) {
        IPage<BGoodsInfo> result = goodsInfoApi.selectByQuery(query, page, size);
        return ResultInfo.success(result.getData(), result.getTotalRows());
    }

    @GetMapping(value = "list")
    public Result<?> list(BGoodsInfoQuery query) {
        List<BGoodsInfo> list = goodsInfoApi.selectByQuery(query);
        return ResultInfo.success(list, (long) list.size());
    }

    @GetMapping(value = "get")
    public Result<?> getOne(Long id) {
        BGoodsInfo sysUser = goodsInfoApi.get(id);
        return ResultInfo.success(sysUser);
    }

    @GetMapping("{id}")
    public Result<?> get(@PathVariable Long id) {
        BGoodsInfo sysUser = goodsInfoApi.get(id);
        return ResultInfo.success(sysUser);
    }

    @PostMapping
    public Result<?> save(@RequestBody @Validated BGoodsInfoVo sysUserVo) {
        goodsInfoApi.save(sysUserVo);
        return ResultInfo.success();
    }

    @PutMapping
    public Result<?> update(@RequestBody @Validated BGoodsInfoVo sysUserVo) {
        goodsInfoApi.update(sysUserVo);
        return ResultInfo.success();
    }

    @DeleteMapping(params = "ids")
    public Result<?> deleteList(List<Long> ids) {
        goodsInfoApi.delete(ids);
        return ResultInfo.success();
    }

    @DeleteMapping(params = "id")
    public Result<?> deleteOne(Long id) {
        goodsInfoApi.delete(id);
        return ResultInfo.success();
    }

    @DeleteMapping("{id}")
    public Result<?> deleteRs(@PathVariable("id") Long id) {
        goodsInfoApi.delete(id);
        return ResultInfo.success();
    }
}