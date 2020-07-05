package org.myproject.boot.application.admin.db.pojo;

import com.gitee.denger.mybatis.example.ext.MybatisExample;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.*;
import org.myproject.boot.mybatis.pojo.BaseEntity;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TbCustomerLogQuery extends BaseEntity implements Serializable, MybatisExample<TbCustomerLogExample> {
    private static final long serialVersionUID = 1L;
    @AndEqualTo
    private Long customerId;
    @AndLike
    private String customerName;
    @AndLike
    private String content;
}