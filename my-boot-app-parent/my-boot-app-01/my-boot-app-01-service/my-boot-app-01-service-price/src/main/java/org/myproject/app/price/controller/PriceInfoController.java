package org.myproject.app.price.controller;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.myproject.app.db.commons.pojo.IPage;
import org.myproject.app.db.price.pojo.PriceInfo;
import org.myproject.app.db.price.pojo.PriceInfoQuery;
import org.myproject.app.db.price.pojo.PriceInfoVo;
import org.myproject.app.db.price.service.PriceInfoService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import wiki.xsx.core.log.Log;

import java.util.Arrays;
import java.util.List;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-08-23 14:47
 */
@Api(value = "定价信息", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
@RequestMapping("price/infos")
@AllArgsConstructor
public class PriceInfoController {
    public static final String API_QUERY = "查询定价信息";
    public static final String API_ID_GET = "ID获取定价信息";
    public static final String API_INSERT = "增加定价信息";
    public static final String API_UPDATE = "更新定价信息";
    public static final String API_REMOVE = "删除定价信息";
    private static final String API_LIST_BY_CODE = "编码获取定价信息";
    private final PriceInfoService priceInfoService;

    @GetMapping
    @ApiOperation(API_QUERY)
    @Log(API_QUERY)
    public Result<List<PriceInfo>> list(PriceInfoQuery query) {
        IPage<PriceInfo> pageInfo = priceInfoService.selectPageByQuery(query);
        return ResultInfo.success(pageInfo.getTotal(), pageInfo.getList());
    }

    @GetMapping("/{id}")
    @ApiOperation(API_ID_GET)
    @Log(API_ID_GET)
    public Result<PriceInfo> get(@PathVariable Long id) {
        PriceInfo priceInfo = priceInfoService.selectByPrimaryKey(id);
        return ResultInfo.success(priceInfo);
    }

    @GetMapping("/code/{code}")
    @ApiOperation(API_LIST_BY_CODE)
    @Log(API_LIST_BY_CODE)
    public Result<List<PriceInfo>> listByCode(@PathVariable String code) {
        List<PriceInfo> priceInfos = priceInfoService.selectAllByCode(code);
        return ResultInfo.success(priceInfos);
    }

    @PostMapping
    @ApiOperation(API_INSERT)
    @Log(API_INSERT)
    public Result<?> insert(@RequestBody PriceInfoVo priceInfoVo) {
        priceInfoService.insert(priceInfoVo);
        return ResultInfo.success();
    }

    @PutMapping
    @ApiOperation(API_UPDATE)
    @Log(API_UPDATE)
    public Result<?> update(@RequestBody PriceInfoVo PriceInfoVo) {
        priceInfoService.updateByPrimaryKeySelective(PriceInfoVo);
        return ResultInfo.success();
    }

    @DeleteMapping("/{id}")
    @ApiOperation(API_REMOVE)
    @Log(API_REMOVE)
    public Result<?> delete(@PathVariable Long[] id) {
        priceInfoService.deleteByIdIn(Arrays.asList(id));
        return ResultInfo.success();
    }
}