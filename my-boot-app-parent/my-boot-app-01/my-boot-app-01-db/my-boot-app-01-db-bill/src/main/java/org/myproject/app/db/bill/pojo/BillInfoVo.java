package org.myproject.app.db.bill.pojo;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * bill_info
 */
@ApiModel(value = "org-myproject-app-bill-pojo-BillInfo")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class BillInfoVo extends BillInfo implements Serializable {
    private List<BillItem> items;
}