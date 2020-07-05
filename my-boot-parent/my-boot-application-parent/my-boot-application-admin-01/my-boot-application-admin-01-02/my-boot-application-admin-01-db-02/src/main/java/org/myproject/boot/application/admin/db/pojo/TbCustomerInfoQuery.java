package org.myproject.boot.application.admin.db.pojo;

import com.gitee.denger.mybatis.example.ext.MybatisExample;
import com.gitee.denger.mybatis.example.ext.annotation.AndGreaterThanOrEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLessThanOrEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.*;
import org.myproject.boot.mybatis.pojo.BaseEntity;

import java.io.Serializable;

/**
 * tb_customer_info
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TbCustomerInfoQuery extends BaseEntity implements Serializable, MybatisExample<TbCustomerInfoExample> {
    private static final long serialVersionUID = 1L;
    /**
     * name
     */
    @AndLike
    private String name;
    /**
     * namePy
     */
    @AndLike
    private String namePy;
    /**
     * namePyF
     */
    @AndLike
    private String namePyF;
    /**
     * phone
     */
    @AndLike
    private String phone;
    /**
     * age
     */
    @AndGreaterThanOrEqualTo(property = "age")
    private Integer ageStart;
    @AndLessThanOrEqualTo(property = "age")
    private Integer ageEnd;
}