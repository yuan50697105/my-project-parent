package org.myproject.app.price.controller;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.myproject.app.commons.pojo.IPage;
import org.myproject.app.price.pojo.PriceInfo;
import org.myproject.app.price.pojo.PriceInfoQuery;
import org.myproject.app.price.pojo.PriceInfoVo;
import org.myproject.app.price.service.PriceInfoService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

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
    private final PriceInfoService priceInfoService;

    @GetMapping
    @ApiOperation("查询")
    public Result<List<PriceInfo>> list(PriceInfoQuery query) {
        IPage<PriceInfo> pageInfo = priceInfoService.selectPageByQuery(query);
        return ResultInfo.success(pageInfo.getTotal(), pageInfo.getList());
    }

    @GetMapping("/{id}")
    @ApiOperation("ID获取")
    public Result<PriceInfo> get(@PathVariable Long id) {
        PriceInfo PriceInfo = priceInfoService.selectByPrimaryKey(id);
        return ResultInfo.success(PriceInfo);
    }

    @PostMapping
    @ApiOperation("增加")
    public Result<?> insert(@RequestBody PriceInfoVo priceInfoVo) {
        priceInfoService.insert(priceInfoVo);
        return ResultInfo.success();
    }

    @PutMapping
    @ApiOperation("更新")
    public Result<?> update(PriceInfoVo PriceInfoVo) {
        priceInfoService.updateByPrimaryKeySelective(PriceInfoVo);
        return ResultInfo.success();
    }

    @DeleteMapping("/{id}")
    @ApiOperation("删除")
    public Result<?> delete(@PathVariable Long[] id) {
        priceInfoService.deleteByIdIn(Arrays.asList(id));
        return ResultInfo.success();
    }
}