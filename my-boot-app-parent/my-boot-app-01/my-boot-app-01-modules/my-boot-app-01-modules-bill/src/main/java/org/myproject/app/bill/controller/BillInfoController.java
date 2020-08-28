package org.myproject.app.bill.controller;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.myproject.app.bill.pojo.BillInfo;
import org.myproject.app.bill.pojo.BillInfoQuery;
import org.myproject.app.bill.pojo.BillInfoVo;
import org.myproject.app.bill.service.BillInfoService;
import org.myproject.app.commons.pojo.IPage;
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
@Api(value = "认证用户", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
@RequestMapping("bill/infos")
@AllArgsConstructor
public class BillInfoController {
    private final BillInfoService service;

    @GetMapping
    @ApiOperation("查询")
    public Result<List<BillInfo>> list(BillInfoQuery query) {
        IPage<BillInfo> pageInfo = service.selectPageByQuery(query);
        return ResultInfo.success(pageInfo.getTotal(), pageInfo.getList());
    }

    @GetMapping("/{id}")
    @ApiOperation("ID获取")
    public Result<BillInfo> get(@PathVariable Long id) {
        BillInfo authUser = service.selectByPrimaryKey(id);
        return ResultInfo.success(authUser);
    }

    @PostMapping
    @ApiOperation("增加")
    public Result<?> insert(@RequestBody BillInfoVo vo) {
        service.insert(vo);
        return ResultInfo.success();
    }

    @PutMapping
    @ApiOperation("更新")
    public Result<?> update(@RequestBody BillInfoVo vo) {
        service.updateByPrimaryKeySelective(vo);
        return ResultInfo.success();
    }

    @DeleteMapping("/{id}")
    @ApiOperation("删除")
    public Result<?> delete(@PathVariable Long[] id) {
        service.deleteByIdIn(Arrays.asList(id));
        return ResultInfo.success();
    }
}