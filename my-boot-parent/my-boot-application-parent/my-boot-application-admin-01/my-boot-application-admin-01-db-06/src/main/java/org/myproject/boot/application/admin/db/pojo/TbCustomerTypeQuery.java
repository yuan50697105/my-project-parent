package org.myproject.boot.application.admin.db.pojo;

import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.*;
import org.myproject.boot.mybatis.pojo.BaseEntity;

import javax.persistence.Column;
import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TbCustomerTypeQuery extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "naem")
    @AndLike
    private Integer naem;
}