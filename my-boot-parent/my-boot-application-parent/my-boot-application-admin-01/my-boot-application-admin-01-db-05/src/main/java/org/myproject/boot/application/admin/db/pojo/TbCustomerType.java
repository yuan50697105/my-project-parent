package org.myproject.boot.application.admin.db.pojo;

import lombok.*;
import org.myproject.boot.mybatis.pojo.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_customer_type")
public class TbCustomerType extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "naem")
    private Integer naem;
}