package org.myproject.app.device.controller;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.myproject.app.db.commons.pojo.IPage;
import org.myproject.app.device.pojo.DeviceInfo;
import org.myproject.app.device.pojo.DeviceInfoQuery;
import org.myproject.app.device.pojo.DeviceInfoVo;
import org.myproject.app.device.service.DeviceInfoService;
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
@Api(value = "设备信息", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
@RequestMapping("device/infos")
@AllArgsConstructor
public class DeviceInfoController {
    public static final String API_QUERY = "查询设备信息";
    public static final String API_ID_GET = "ID获取设备信息";
    public static final String API_INSERT = "增加设备信息";
    public static final String API_UPDATE = "更新设备信息";
    public static final String API_REMOVE = "删除设备信息";
    private final DeviceInfoService deviceInfoService;

    @GetMapping
    @ApiOperation(API_QUERY)
    @Log(API_QUERY)
    public Result<List<DeviceInfo>> list(DeviceInfoQuery query) {
        IPage<DeviceInfo> pageInfo = deviceInfoService.selectPageByQuery(query);
        return ResultInfo.success(pageInfo.getTotal(), pageInfo.getList());
    }

    @GetMapping("/{id}")
    @ApiOperation(API_ID_GET)
    @Log(API_ID_GET)
    public Result<DeviceInfo> get(@PathVariable Long id) {
        DeviceInfo DeviceInfo = deviceInfoService.selectByPrimaryKey(id);
        return ResultInfo.success(DeviceInfo);
    }

    @PostMapping
    @ApiOperation(API_INSERT)
    @Log(API_INSERT)
    public Result<?> insert(@RequestBody DeviceInfoVo DeviceInfoVo) {
        deviceInfoService.insert(DeviceInfoVo);
        return ResultInfo.success();
    }

    @PutMapping
    @ApiOperation(API_UPDATE)
    @Log(API_UPDATE)
    public Result<?> update(@RequestBody DeviceInfoVo DeviceInfoVo) {
        deviceInfoService.updateByPrimaryKeySelective(DeviceInfoVo);
        return ResultInfo.success();
    }

    @DeleteMapping("/{id}")
    @ApiOperation(API_REMOVE)
    @Log(API_REMOVE)
    public Result<?> delete(@PathVariable Long[] id) {
        deviceInfoService.deleteByIdIn(Arrays.asList(id));
        return ResultInfo.success();
    }
}