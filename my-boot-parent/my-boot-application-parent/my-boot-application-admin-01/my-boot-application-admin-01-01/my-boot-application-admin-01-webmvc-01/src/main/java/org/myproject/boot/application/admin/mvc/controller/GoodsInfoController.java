package org.myproject.boot.application.admin.mvc.controller;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import lombok.AllArgsConstructor;
import org.myproject.boot.application.admin.service.pojo.GoodsInfo;
import org.myproject.boot.application.admin.service.pojo.GoodsInfoQuery;
import org.myproject.boot.application.admin.service.pojo.GoodsInfoVo;
import org.myproject.boot.application.admin.service.api.BGoodsInfoApi;
import org.myproject.boot.mybatis.commons.pojo.IPage;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: my-boot-application-admin-01-01
 * @description:
 * @author: yuane
 * @create: 2020-07-05 16:22
 */
@RestController
@RequestMapping("goods/info")
@Validated
@AllArgsConstructor
public class GoodsInfoController {
    private final BGoodsInfoApi goodsInfoService;

    @RequestMapping(value = "data", method = {RequestMethod.GET})
    public Result<?> data(GoodsInfoQuery query,
                          @RequestParam(defaultValue = "1") int page,
                          @RequestParam(defaultValue = "20") int size) {
        IPage<GoodsInfo> result = goodsInfoService.selectByQuery(query, page, size);
        return ResultInfo.success(result.getData(), result.getTotalRows());
    }

    @RequestMapping(value = "list", method = {RequestMethod.GET})
    public Result<?> list(GoodsInfoQuery query) {
        List<GoodsInfo> list = goodsInfoService.selectByQuery(query);
        return ResultInfo.success(list, (long) list.size());
    }

    @RequestMapping(value = "get", params = "id", method = {RequestMethod.GET})
    public Result<?> get(Long id) {
        return ResultInfo.success(goodsInfoService.get(id));
    }

    @RequestMapping(value = "get/{id}", method = {RequestMethod.GET})
    public Result<?> getRs(@PathVariable Long id) {
        return ResultInfo.success(goodsInfoService.get(id));
    }


    @RequestMapping(value = "save", method = {RequestMethod.POST})
    public Result<?> save(@RequestBody @Validated GoodsInfoVo vo) {
        goodsInfoService.insert(vo);
        return ResultInfo.success();
    }

    @RequestMapping(value = "update", method = {RequestMethod.PUT, RequestMethod.POST, RequestMethod.PATCH})
    public Result<?> update(@RequestBody GoodsInfoVo vo) {
        goodsInfoService.update(vo);
        return ResultInfo.success();
    }

    @RequestMapping(value = "delete", params = "ids", method = {RequestMethod.GET, RequestMethod.DELETE})
    public Result<?> deleteList(List<Long> ids) {
        goodsInfoService.delete(ids);
        return ResultInfo.success();
    }

    @RequestMapping(value = "delete", params = "id", method = {RequestMethod.GET, RequestMethod.DELETE})
    public Result<?> deleteOne(Long id) {
        goodsInfoService.delete(id);
        return ResultInfo.success();
    }

    @RequestMapping(value = "delete/{id}", method = {RequestMethod.GET, RequestMethod.DELETE})
    public Result<?> deleteRs(@PathVariable Long id) {
        goodsInfoService.delete(id);
        return ResultInfo.success();
    }
}