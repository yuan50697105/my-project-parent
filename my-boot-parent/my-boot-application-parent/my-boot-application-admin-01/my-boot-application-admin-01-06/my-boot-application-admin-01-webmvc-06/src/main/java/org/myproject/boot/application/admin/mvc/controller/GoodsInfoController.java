package org.myproject.boot.application.admin.mvc.controller;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import org.myproject.boot.application.admin.db.pojo.TbGoodsInfo;
import org.myproject.boot.application.admin.db.pojo.TbGoodsInfoQuery;
import org.myproject.boot.application.admin.db.pojo.TbGoodsInfoVo;
import org.myproject.boot.application.admin.db.service.business.BGoodsInfoService;
import org.myproject.boot.mybatis.pojo.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: my-boot-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-29 22:12
 */
@RestController
@RequestMapping("goods/info")
public class GoodsInfoController {
    @Autowired
    private BGoodsInfoService goodsInfoService;

    @RequestMapping(value = "data", method = {RequestMethod.GET})
    public Result<?> data(TbGoodsInfoQuery query,
                          @RequestParam(defaultValue = "1") int page,
                          @RequestParam(defaultValue = "20") int size) {
        PageResult<TbGoodsInfo> pageResult = goodsInfoService.selectByQuery(query, page, size);
        return ResultInfo.success(pageResult.getData(), pageResult.getTotalRows());
    }

    @RequestMapping(value = "list", method = {RequestMethod.GET})
    public Result<?> list(TbGoodsInfoQuery query) {
        List<TbGoodsInfo> list = goodsInfoService.selectByQuery(query);
        return ResultInfo.success(list, (long) list.size());
    }

    @RequestMapping(value = "get",params = "id",method = {RequestMethod.GET})
    public Result<?> get(Long id){
        return ResultInfo.success(goodsInfoService.selectById(id));
    }


    @RequestMapping(value = "save", method = {RequestMethod.POST})
    public Result<?> save(@RequestBody @Validated TbGoodsInfoVo vo) {
        goodsInfoService.save(vo);
        return ResultInfo.success();
    }

    @RequestMapping(value = "update", method = {RequestMethod.GET, RequestMethod.POST})
    public Result<?> update(@RequestBody TbGoodsInfoVo vo) {
        goodsInfoService.update(vo);
        return ResultInfo.success();
    }

    @RequestMapping(value = "delete", params = "ids", method = {RequestMethod.GET})
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