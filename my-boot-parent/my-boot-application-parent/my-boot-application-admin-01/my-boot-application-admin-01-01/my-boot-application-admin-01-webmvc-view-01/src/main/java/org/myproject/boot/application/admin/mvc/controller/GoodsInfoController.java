package org.myproject.boot.application.admin.mvc.controller;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import lombok.AllArgsConstructor;
import org.myproject.boot.application.admin.db.pojo.TbCustomerInfoVo;
import org.myproject.boot.application.admin.db.pojo.TbGoodsInfo;
import org.myproject.boot.application.admin.db.pojo.TbGoodsInfoQuery;
import org.myproject.boot.application.admin.db.pojo.TbGoodsInfoVo;
import org.myproject.boot.application.admin.db.service.business.BGoodsInfoService;
import org.myproject.boot.mybatis.pojo.PageResult;
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
    private final BGoodsInfoService goodsInfoService;

    @RequestMapping(value = "data",method = {RequestMethod.GET})
    public Result<?> data(TbGoodsInfoQuery query,
                          @RequestParam(defaultValue = "1") int page,
                          @RequestParam(defaultValue = "20") int size) {
        PageResult<TbGoodsInfo> result = goodsInfoService.selectByQuery(query,page, size);
        return ResultInfo.success(result.getData(), result.getTotalRows());
    }

    @RequestMapping(value = "list",method = {RequestMethod.GET})
    public Result<?> list(TbGoodsInfoQuery query) {
        List<TbGoodsInfo> list = goodsInfoService.selectByQuery(query);
        return ResultInfo.success(list, (long) list.size());
    }


    @RequestMapping(value = "save", method = {RequestMethod.POST})
    public Result<?> save(@RequestBody @Validated TbGoodsInfoVo vo) {
        goodsInfoService.insert(vo);
        return ResultInfo.success();
    }

    @RequestMapping(value = "update", method = {RequestMethod.PUT, RequestMethod.POST, RequestMethod.PATCH})
    public Result<?> update(@RequestBody TbGoodsInfoVo vo) {
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