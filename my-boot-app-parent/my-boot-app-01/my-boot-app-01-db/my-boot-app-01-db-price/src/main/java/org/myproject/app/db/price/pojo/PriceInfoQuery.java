package org.myproject.app.db.price.pojo;

import com.gitee.denger.mybatis.example.ext.MybatisExample;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.myproject.app.db.commons.pojo.BaseQuery;

import java.io.Serializable;

/**
 * price_info
 */
@ApiModel(value = "org-myproject-app-price-pojo-PriceInfo")
@Data
@EqualsAndHashCode(callSuper = true)

@AllArgsConstructor
@NoArgsConstructor
public class PriceInfoQuery extends BaseQuery implements Serializable, MybatisExample<PriceInfoExample> {
    private static final long serialVersionUID = 1L;
    /**
     * code
     */
    @ApiModelProperty(value = "code")
    @AndLike
    private String code;
    /**
     * type
     */
    @ApiModelProperty(value = "type")
    @AndEqualTo
    private String type;
}