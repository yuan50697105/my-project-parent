package org.myproject.app.db.customer.pojo;

import com.gitee.denger.mybatis.example.ext.MybatisExample;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.myproject.app.db.commons.pojo.BaseQuery;

import java.io.Serializable;

/**
 * customer_type
 */
@ApiModel(value = "org-myproject-app-customer-pojo-CustomerType")
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@With
public class CustomerTypeQuery extends BaseQuery implements Serializable, MybatisExample<CustomerTypeExample> {
    private static final long serialVersionUID = 1L;
    /**
     * name
     */
    @ApiModelProperty(value = "name")
    private String name;
    /**
     * description
     */
    @ApiModelProperty(value = "description")
    private String description;
    /**
     * enabled
     */
    @ApiModelProperty(value = "enabled")
    private Integer enabled;
}