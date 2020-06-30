package org.myproject.boot.application.admin.db.pojo;

import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.*;
import org.myproject.boot.mybatis.pojo.BaseEntity;
import tk.mybatis.mapper.entity.Example;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_customer_log")
public class TbCustomerLogQuery extends BaseEntity implements Serializable, MybatisExampleForTk<TbCustomerLog, Example> {
    @Column(name = "customer_id")
    @AndEqualTo
    private Long customerId;

    @Column(name = "customer_name")
    @AndLike
    private String customerName;

    @Column(name = "content")
    @AndLike
    private String content;

    private static final long serialVersionUID = 1L;
}