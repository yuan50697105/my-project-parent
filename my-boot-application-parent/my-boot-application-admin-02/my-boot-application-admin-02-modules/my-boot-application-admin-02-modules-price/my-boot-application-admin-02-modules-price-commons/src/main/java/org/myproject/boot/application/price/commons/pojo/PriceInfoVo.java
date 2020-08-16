package org.myproject.boot.application.price.commons.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@ApiModel(value = "定价信息")
@Data
public class PriceInfoVo implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * ID
     */
    @ApiModelProperty(value = "ID")
    private Long id;
    /**
     * 方案名称
     */
    @ApiModelProperty(value = "方案名称")
    private String name;
    /**
     * 方案编号
     */
    @ApiModelProperty(value = "方案编号")
    private Long code;
    /**
     * 定价
     */
    @ApiModelProperty(value = "定价")
    private BigDecimal price;
    private Event event;

    public enum Event {
        ADD, UPDATE
    }
}

