package org.myproject.boot.application.admin.db.pojo;

import com.gitee.denger.mybatis.example.ext.MybatisExample;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndGreaterThanOrEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLessThanOrEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;

/**
 * tb_customer_info
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TbCustomerInfoQuery extends BaseEntity implements MybatisExample<TbCustomerInfoExample> {
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
    @AndEqualTo
    private Integer age;
    @AndGreaterThanOrEqualTo(property = "age")
    private Integer ageStart;
    @AndLessThanOrEqualTo(property = "age")
    private Integer ageEnd;
    @AndEqualTo
    private Long typeId;
}