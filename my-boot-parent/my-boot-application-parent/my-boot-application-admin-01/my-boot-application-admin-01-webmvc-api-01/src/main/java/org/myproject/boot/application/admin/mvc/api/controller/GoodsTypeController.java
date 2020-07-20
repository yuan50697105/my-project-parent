package org.myproject.boot.application.admin.mvc.api.controller;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import org.myproject.boot.application.admin.api.api.BGoodsTypeApi;
import org.myproject.boot.application.admin.api.pojo.BGoodsType;
import org.myproject.boot.application.admin.api.pojo.BGoodsTypeQuery;
import org.myproject.boot.application.admin.api.pojo.BGoodsTypeVo;
import org.myproject.boot.application.admin.api.pojo.IPage;
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
@RequestMapping("goods/type")
public class GoodsTypeController {
    @Autowired
    private BGoodsTypeApi goodsTypeApi;

    @GetMapping(value = "data")
    public Result<?> data(BGoodsTypeQuery query,
                          @RequestParam(defaultValue = "1") int page,
                          @RequestParam(defaultValue = "20") int size) {
        IPage<BGoodsType> result = goodsTypeApi.selectByQuery(query, page, size);
        return ResultInfo.success(result.getData(), result.getTotalRows());
    }

    @GetMapping(value = "list")
    public Result<?> list(BGoodsTypeQuery query) {
        List<BGoodsType> list = goodsTypeApi.selectByQuery(query);
        return ResultInfo.success(list, (long) list.size());
    }

    @GetMapping(value = "get")
    public Result<?> getOne(Long id) {
        BGoodsType sysUser = goodsTypeApi.get(id);
        return ResultInfo.success(sysUser);
    }

    @GetMapping("{id}")
    public Result<?> get(@PathVariable Long id) {
        BGoodsType sysUser = goodsTypeApi.get(id);
        return ResultInfo.success(sysUser);
    }

    @PostMapping
    public Result<?> save(@RequestBody @Validated BGoodsTypeVo sysUserVo) {
        goodsTypeApi.save(sysUserVo);
        return ResultInfo.success();
    }

    @PutMapping
    public Result<?> update(@RequestBody @Validated BGoodsTypeVo sysUserVo) {
        goodsTypeApi.update(sysUserVo);
        return ResultInfo.success();
    }

    @DeleteMapping(params = "ids")
    public Result<?> deleteList(List<Long> ids) {
        goodsTypeApi.delete(ids);
        return ResultInfo.success();
    }

    @DeleteMapping(params = "id")
    public Result<?> deleteOne(Long id) {
        goodsTypeApi.delete(id);
        return ResultInfo.success();
    }

    @DeleteMapping("{id}")
    public Result<?> deleteRs(@PathVariable("id") Long id) {
        goodsTypeApi.delete(id);
        return ResultInfo.success();
    }
}