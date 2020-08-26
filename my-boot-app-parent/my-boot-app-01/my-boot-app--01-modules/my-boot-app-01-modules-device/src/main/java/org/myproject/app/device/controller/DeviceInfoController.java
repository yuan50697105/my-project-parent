package org.myproject.app.device.controller;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.myproject.app.commons.pojo.IPage;
import org.myproject.app.device.pojo.DeviceInfo;
import org.myproject.app.device.pojo.DeviceInfoQuery;
import org.myproject.app.device.pojo.DeviceInfoVo;
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
@Api(value = "设备信息", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
@RequestMapping("device/infos")
@AllArgsConstructor
public class DeviceInfoController {
    private final org.myproject.app.device.service.DeviceInfoService deviceInfoService;

    @GetMapping
    @ApiOperation("查询")
    public Result<List<DeviceInfo>> list(DeviceInfoQuery query) {
        IPage<DeviceInfo> pageInfo = deviceInfoService.selectPageByQuery(query);
        return ResultInfo.success(pageInfo.getTotal(), pageInfo.getList());
    }

    @GetMapping("/{id}")
    @ApiOperation("ID获取")
    public Result<DeviceInfo> get(@PathVariable Long id) {
        DeviceInfo DeviceInfo = deviceInfoService.selectByPrimaryKey(id);
        return ResultInfo.success(DeviceInfo);
    }

    @PostMapping
    @ApiOperation("增加")
    public Result<?> insert(@RequestBody DeviceInfoVo DeviceInfoVo) {
        deviceInfoService.insert(DeviceInfoVo);
        return ResultInfo.success();
    }

    @PutMapping
    @ApiOperation("更新")
    public Result<?> update(DeviceInfoVo DeviceInfoVo) {
        deviceInfoService.updateByPrimaryKeySelective(DeviceInfoVo);
        return ResultInfo.success();
    }

    @DeleteMapping("/{id}")
    @ApiOperation("删除")
    public Result<?> delete(@PathVariable Long[] id) {
        deviceInfoService.deleteByIdIn(Arrays.asList(id));
        return ResultInfo.success();
    }
}