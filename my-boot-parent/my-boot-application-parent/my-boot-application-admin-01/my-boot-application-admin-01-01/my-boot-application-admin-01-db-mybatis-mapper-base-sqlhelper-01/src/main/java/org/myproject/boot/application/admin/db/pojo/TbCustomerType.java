package org.myproject.boot.application.admin.db.pojo;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;

@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "tb_customer_type")
public class TbCustomerType extends BaseEntity implements Serializable {
    @Column(name = "`name`")
    private Integer name;

    private static final long serialVersionUID = 1L;
}