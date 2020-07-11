package org.myproject.boot.application.admin.mvc.controller;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import lombok.AllArgsConstructor;
import org.myproject.boot.application.admin.service.pojo.GoodsType;
import org.myproject.boot.application.admin.service.pojo.GoodsTypeQuery;
import org.myproject.boot.application.admin.service.pojo.GoodsTypeVo;
import org.myproject.boot.application.admin.service.api.BGoodsTypeApi;
import org.myproject.boot.mybatis.commons.pojo.IPage;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: my-boot-application-admin-01-01
 * @description:
 * @author: yuane
 * @create: 2020-07-05 16:03
 */
@RestController
@RequestMapping("goods/type")
@Validated
@AllArgsConstructor
public class GoodsTypeController {
    private final BGoodsTypeApi goodsTypeService;

    @RequestMapping(value = "data", method = {RequestMethod.GET})
    public Result<?> data(GoodsTypeQuery query,
                          @RequestParam(defaultValue = "1") int page,
                          @RequestParam(defaultValue = "20") int size) {
        IPage<GoodsType> result = goodsTypeService.selectByQuery(query, page, size);
        return ResultInfo.success(result.getData(), result.getTotalRows());
    }

    @RequestMapping(value = "list", method = {RequestMethod.GET})
    public Result<?> list(GoodsTypeQuery query) {
        List<GoodsType> result = goodsTypeService.selectByQuery(query);
        return ResultInfo.success(result, (long) result.size());
    }

    @RequestMapping(value = "get", params = "id", method = {RequestMethod.GET})
    public Result<?> get(Long id) {
        return ResultInfo.success(goodsTypeService.get(id));
    }

    @RequestMapping(value = "get/{id}", method = {RequestMethod.GET})
    public Result<?> getRs(@PathVariable Long id) {
        return get(id);
    }

    @RequestMapping(value = "save", method = {RequestMethod.POST})
    public Result<?> save(@RequestBody @Validated GoodsTypeVo vo) {
        goodsTypeService.insert(vo);
        return ResultInfo.success();
    }

    @RequestMapping(value = "update", method = {RequestMethod.POST, RequestMethod.PUT, RequestMethod.PATCH})
    public Result<?> update(@RequestBody @Validated GoodsTypeVo vo) {
        goodsTypeService.update(vo);
        return ResultInfo.success();
    }

    @RequestMapping(value = "delete", params = "ids", method = {RequestMethod.GET, RequestMethod.DELETE})
    public Result<?> deleteList(List<Long> ids) {
        goodsTypeService.delete(ids);
        return ResultInfo.success();
    }

    @RequestMapping(value = "delete", params = "id", method = {RequestMethod.GET, RequestMethod.DELETE})
    public Result<?> deleteOne(Long id) {
        goodsTypeService.delete(id);
        return ResultInfo.success();
    }

    @RequestMapping(value = "delete/{id}", method = {RequestMethod.GET, RequestMethod.DELETE})
    public Result<?> delete(@PathVariable Long id) {
        goodsTypeService.delete(id);
        return ResultInfo.success();
    }


}