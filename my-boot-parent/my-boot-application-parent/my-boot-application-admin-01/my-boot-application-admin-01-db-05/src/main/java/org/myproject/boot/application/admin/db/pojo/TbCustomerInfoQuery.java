package org.myproject.boot.application.admin.db.pojo;

import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.annotation.AndGreaterThanOrEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLessThanOrEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.*;
import org.myproject.boot.mybatis.pojo.BaseEntity;
import tk.mybatis.mapper.entity.Example;

import javax.persistence.Column;
import java.io.Serializable;

/**
 * tb_customer_info
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TbCustomerInfoQuery extends BaseEntity implements Serializable, MybatisExampleForTk<TbCustomerInfo, Example> {
    private static final long serialVersionUID = 1L;
    /**
     * name
     */
    @AndLike
    @Column(name = "`name`")
    private String name;
    /**
     * namePy
     */
    @Column(name = "name_py")
    @AndLike
    private String namePy;
    /**
     * namePyF
     */
    @Column(name = "name_py_f")
    @AndLike
    private String namePyF;
    /**
     * phone
     */
    @Column(name = "phone")
    @AndLike
    private String phone;
    /**
     * age
     */
    @Column(name = "age")
    @AndGreaterThanOrEqualTo(property = "age")
    private Integer ageStart;
    @AndLessThanOrEqualTo(property = "age")
    private Integer ageEnd;
}