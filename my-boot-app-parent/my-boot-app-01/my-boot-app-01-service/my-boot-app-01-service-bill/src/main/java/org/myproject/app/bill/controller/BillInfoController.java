package org.myproject.app.bill.controller;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.myproject.app.bill.pojo.*;
import org.myproject.app.bill.service.BillDeviceInfoService;
import org.myproject.app.bill.service.BillInfoService;
import org.myproject.app.bill.service.BillItemService;
import org.myproject.app.db.commons.pojo.IPage;
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
@Api(value = "订单信息", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
@RequestMapping("bill/infos")
@AllArgsConstructor
public class BillInfoController {
    public static final String API_QUERY = "查询订单";
    public static final String API_ID_GET = "ID获取订单";
    public static final String API_INSERT = "增加订单";
    public static final String API_UPDATE = "更新订单";
    public static final String API_REMOVE = "删除订单";
    private static final String API_ID_GET_DETAIL = "ID获取订单详情";
    private static final String API_ID_GET_ITEMS = "ID获取订单项目";
    private static final String API_ID_GET_DEVICE = "ID获取订单设备";
    private final BillInfoService billInfoService;
    private final BillItemService billItemService;
    private final BillDeviceInfoService billDeviceInfoService;

    @GetMapping
    @ApiOperation(API_QUERY)
    @Log(API_QUERY)
    public Result<List<BillInfo>> list(BillInfoQuery query) {
        IPage<BillInfo> pageInfo = billInfoService.selectPageByQuery(query);
        return ResultInfo.success(pageInfo.getTotal(), pageInfo.getList());
    }

    @GetMapping({"/{id}", "/{id}/basic"})
    @ApiOperation(API_ID_GET)
    @Log(API_ID_GET)
    public Result<BillInfo> get(@PathVariable Long id) {
        BillInfo authUser = billInfoService.selectByPrimaryKey(id);
        return ResultInfo.success(authUser);
    }

    @GetMapping({"/{id}/detail"})
    @ApiOperation(API_ID_GET_DETAIL)
    @Log(API_ID_GET_DETAIL)
    public Result<BillInfoDetailResult> getDetail(@PathVariable Long id) {
        BillInfoDetailResult billInfo = billInfoService.selectDetailById(id);
        return ResultInfo.success(billInfo);
    }

    @GetMapping("/{billId}/items")
    @ApiOperation(API_ID_GET_ITEMS)
    @Log(API_ID_GET_ITEMS)
    public Result<List<BillItem>> listItemsById(@PathVariable("billId") Long billId) {
        List<BillItem> items = billItemService.selectAllByBillId(billId);
        return ResultInfo.success(items);
    }

    @GetMapping("/{billId}/device")
    @ApiOperation(API_ID_GET_DEVICE)
    @Log(API_ID_GET_DEVICE)
    public Result<BillDeviceInfo> getDeviceInfo(@PathVariable("billId") Long billId) {
        BillDeviceInfo deviceInfo = billDeviceInfoService.selectOneByBillId(billId);
        return ResultInfo.success(deviceInfo);
    }

    @PostMapping
    @ApiOperation(API_INSERT)
    @Log(API_INSERT)
    public Result<?> insert(@RequestBody BillInfoVo vo) {
        billInfoService.insert(vo);
        return ResultInfo.success();
    }

    @PutMapping
    @ApiOperation(API_UPDATE)
    @Log(API_UPDATE)
    public Result<?> update(@RequestBody BillInfoVo vo) {
        billInfoService.updateByPrimaryKeySelective(vo);
        return ResultInfo.success();
    }

    @DeleteMapping("/{id}")
    @ApiOperation(API_REMOVE)
    @Log(API_REMOVE)
    public Result<?> delete(@PathVariable Long[] id) {
        billInfoService.deleteByIdIn(Arrays.asList(id));
        return ResultInfo.success();
    }

}