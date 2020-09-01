package org.myproject.app.area.controller;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.myproject.app.db.area.pojo.AreaInfo;
import org.myproject.app.db.area.pojo.AreaInfoQuery;
import org.myproject.app.db.area.pojo.AreaInfoVo;
import org.myproject.app.db.area.service.AreaInfoService;
import org.myproject.app.db.commons.pojo.IPage;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import wiki.xsx.core.log.Level;
import wiki.xsx.core.log.Log;

import java.util.Arrays;
import java.util.List;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-08-23 14:47
 */
@Api(value = "区域信息", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
@RequestMapping("area/infos")
@AllArgsConstructor
public class AreaInfoController {
    private final AreaInfoService areaInfoService;

    @GetMapping
    @ApiOperation("查询")
    @Log(value = "查询", level = Level.INFO)
    public Result<List<AreaInfo>> list(AreaInfoQuery query) {
        IPage<AreaInfo> pageInfo = areaInfoService.selectPageByQuery(query);
        return ResultInfo.success(pageInfo.getTotal(), pageInfo.getList());
    }

    @GetMapping("/{id}")
    @ApiOperation("ID获取")
    public Result<AreaInfo> get(@PathVariable Long id) {
        AreaInfo AreaInfo = areaInfoService.selectByPrimaryKey(id);
        return ResultInfo.success(AreaInfo);
    }

    @PostMapping
    @ApiOperation("增加")
    public Result<?> insert(@RequestBody AreaInfoVo AreaInfoVo) {
        areaInfoService.insert(AreaInfoVo);
        return ResultInfo.success();
    }

    @PutMapping
    @ApiOperation("更新")
    public Result<?> update(AreaInfoVo AreaInfoVo) {
        areaInfoService.updateByPrimaryKeySelective(AreaInfoVo);
        return ResultInfo.success();
    }

    @DeleteMapping("/{id}")
    @ApiOperation("删除")
    public Result<?> delete(@PathVariable Long[] id) {
        areaInfoService.deleteByIdIn(Arrays.asList(id));
        return ResultInfo.success();
    }
}