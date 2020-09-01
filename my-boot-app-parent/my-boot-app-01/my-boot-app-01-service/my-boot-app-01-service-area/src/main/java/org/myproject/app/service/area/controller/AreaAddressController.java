package org.myproject.app.service.area.controller;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.myproject.app.db.area.pojo.AreaAddress;
import org.myproject.app.db.area.pojo.AreaAddressQuery;
import org.myproject.app.db.area.pojo.AreaAddressVo;
import org.myproject.app.db.area.service.AreaAddressService;
import org.myproject.app.db.commons.pojo.IPage;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import wiki.xsx.core.log.Level;
import wiki.xsx.core.log.Log;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-08-23 14:47
 */
@Api(value = "区域信息", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
@RequestMapping("area/addresses")
@AllArgsConstructor
public class AreaAddressController {
    private final AreaAddressService areaAddressService;

    @GetMapping
    @ApiOperation("查询")
    @Log(value = "查询", level = Level.INFO)
    public Result<List<AreaAddress>> list(AreaAddressQuery query) {
        IPage<AreaAddress> pageInfo = areaAddressService.selectPageByQuery(query);
        return ResultInfo.success(pageInfo.getTotal(), pageInfo.getList());
    }

    @GetMapping("/{id}")
    @ApiOperation("ID获取")
    public Result<AreaAddress> get(@PathVariable Long id) {
        AreaAddress AreaAddress = areaAddressService.selectByPrimaryKey(id);
        return ResultInfo.success(AreaAddress);
    }

    @GetMapping("/{areaId}/areas")
    public Result<List<AreaAddress>> getByAreaId(@PathVariable Long areaId) {
        List<AreaAddress> areaAddresses = areaAddressService.selectAllByAreaIdIn(Collections.singleton(areaId));
        return ResultInfo.success((long) areaAddresses.size(), areaAddresses);
    }

    @PostMapping
    @ApiOperation("增加")

    public Result<?> insert(@RequestBody AreaAddressVo AreaAddressVo) {
        areaAddressService.insert(AreaAddressVo);
        return ResultInfo.success();
    }

    @PutMapping
    @ApiOperation("更新")
    public Result<?> update(AreaAddressVo AreaAddressVo) {
        areaAddressService.updateByPrimaryKeySelective(AreaAddressVo);
        return ResultInfo.success();
    }

    @DeleteMapping("/{id}")
    @ApiOperation("删除")
    public Result<?> delete(@PathVariable Long[] id) {
        areaAddressService.deleteByIdIn(Arrays.asList(id));
        return ResultInfo.success();
    }
}