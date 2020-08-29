package org.myproject.app.customer.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-08-30 01:15
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
public class CustomerAddressVo extends CustomerAddress {
}