package org.myproject.app.member.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.myproject.boot.mybatis.pojo.BaseEntity;

/**
 * member_info
 */
@ApiModel(value = "org-myproject-app-member-pojo-MemberInfo")
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberInfo extends BaseEntity implements Serializable {
    /**
     * 会员编号
     */
    @ApiModelProperty(value = "会员编号")
    private String memberNo;

    /**
     * 会员姓名
     */
    @ApiModelProperty(value = "会员姓名")
    private String memberName;

    /**
     * 客户ID
     */
    @ApiModelProperty(value = "客户ID")
    private Long customerId;

    /**
     * 客户编号
     */
    @ApiModelProperty(value = "客户编号")
    private String customerCode;

    /**
     * 客户类型
     */
    @ApiModelProperty(value = "客户类型")
    private String customerName;

    private static final long serialVersionUID = 1L;
}