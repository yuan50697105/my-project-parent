package org.myproject.app.customer.pojo;

import com.gitee.denger.mybatis.example.ext.MybatisExample;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.myproject.app.db.commons.pojo.BaseQuery;

import java.io.Serializable;

@ApiModel(value = "org-myproject-app-customer-pojo-CustomerAddress")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@With
public class CustomerAddressQuery extends BaseQuery implements Serializable, MybatisExample<CustomerAddressExample> {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value = "")
    @AndEqualTo
    private Long customerId;
    @ApiModelProperty(value = "")
    private String address;
}