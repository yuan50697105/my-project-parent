package org.myproject.boot.application.admin.db.pojo;

import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;
import tk.mybatis.mapper.entity.Example;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "tb_customer_log")
public class TbCustomerLogQuery extends BaseEntity implements Serializable, MybatisExampleForTk<TbCustomerLog, Example> {
    public static final String COL_ID = "id";
    public static final String COL_CUSTOMER_ID = "customer_id";
    public static final String COL_CUSTOMER_NAME = "customer_name";
    public static final String COL_CONTENT = "content";
    private static final long serialVersionUID = 1L;
    @Column(name = "customer_id")
    @AndEqualTo
    private Long customerId;
    @Column(name = "customer_name")
    @AndLike
    private String customerName;
    @Column(name = "content")
    private String content;
}