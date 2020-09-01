package org.myproject.app.db.bill.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-08-30 00:23
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class BillInfoDetailResult extends BillInfo {
    private List<BillItem> items;
    private BillDeviceInfo device;
}