package org.myproject.boot.application.admin.db.pojo;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.myproject.boot.mybatis.pojo.BaseEntity;

/**
 * tb_customer_info
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TbCustomerInfo extends BaseEntity implements Serializable {
    /**
     * name
     */
    private String name;

    /**
     * namePy
     */
    private String namePy;

    /**
     * namePyF
     */
    private String namePyF;

    /**
     * phone
     */
    private String phone;

    /**
     * age
     */
    private Integer age;

    private static final long serialVersionUID = 1L;
}