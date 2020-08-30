package org.myproject.app.customer.pojo;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-08-30 01:15
 */
@ApiModel
@EqualsAndHashCode(callSuper = true)
@Data
public class CustomerAddressVo extends CustomerAddress {
}