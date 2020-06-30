package org.myproject.boot.application.admin.db.pojo;

import lombok.*;
import org.myproject.boot.mybatis.pojo.BaseEntity;

import javax.persistence.Column;
import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TbCustomerTypeVo extends BaseEntity implements Serializable {
    @Column(name = "naem")
    private Integer naem;

    private static final long serialVersionUID = 1L;
}