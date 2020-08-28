package org.myproject.app.member.pojo;

import com.gitee.denger.mybatis.example.ext.MybatisExample;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.myproject.boot.mybatis.pojo.BaseEntity;

import java.io.Serializable;

/**
 * member_info
 */
@ApiModel(value = "org-myproject-app-member-pojo-MemberInfo")
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberInfoQuery extends BaseEntity implements Serializable, MybatisExample<MemberInfoExample> {
    private static final long serialVersionUID = 1L;
    /**
     * 会员编号
     */
    @ApiModelProperty(value = "会员编号")
    @AndLike
    private String memberNo;
    /**
     * 会员姓名
     */
    @ApiModelProperty(value = "会员姓名")
    @AndLike
    private String memberName;
    /**
     * 客户ID
     */
    @ApiModelProperty(value = "客户ID")
    @AndLike
    private Long customerId;
    /**
     * 客户编号
     */
    @ApiModelProperty(value = "客户编号")
    @AndLike
    private String customerCode;
    /**
     * 客户类型
     */
    @ApiModelProperty(value = "客户类型")
    @AndLike
    private String customerName;
}