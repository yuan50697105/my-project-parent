package org.myproject.boot.application.admin.mvc.controller;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import org.myproject.boot.application.admin.db.pojo.TbGoodsType;
import org.myproject.boot.application.admin.db.pojo.TbGoodsTypeQuery;
import org.myproject.boot.application.admin.db.pojo.TbGoodsTypeVo;
import org.myproject.boot.application.admin.db.service.business.BGoodsTypeService;
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
@RequestMapping("goods/type")
public class GoodsTypeController {
    @Autowired
    private BGoodsTypeService goodsTypeService;

    @Autowired

    @RequestMapping(value = "data", method = {RequestMethod.GET})
    public Result<?> data(TbGoodsTypeQuery query,
                          @RequestParam(defaultValue = "1") int page,
                          @RequestParam(defaultValue = "20") int size) {
        PageResult<TbGoodsType> pageResult = goodsTypeService.selectByQuery(query, page, size);
        return ResultInfo.success(pageResult.getData(), pageResult.getTotalRows());
    }

    @RequestMapping(value = "list", method = {RequestMethod.GET})
    public Result<?> list(TbGoodsTypeQuery query) {
        List<TbGoodsType> list = goodsTypeService.selectByQuery(query);
        return ResultInfo.success(list, (long) list.size());
    }


    @RequestMapping(value = "save", method = {RequestMethod.POST})
    public Result<?> save(@RequestBody @Validated TbGoodsTypeVo vo) {
        goodsTypeService.save(vo);
        return ResultInfo.success();
    }

    @RequestMapping(value = "update", method = {RequestMethod.GET, RequestMethod.POST})
    public Result<?> update(@RequestBody TbGoodsTypeVo vo) {
        goodsTypeService.update(vo);
        return ResultInfo.success();
    }

    @RequestMapping(value = "delete", params = "ids", method = {RequestMethod.GET})
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
    public Result<?> deleteRs(@PathVariable Long id) {
        goodsTypeService.delete(id);
        return ResultInfo.success();
    }
}