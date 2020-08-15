package org.myproject.boot.application.admin.db.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "tb_customer_log")
public class TbCustomerLog extends BaseEntity implements Serializable {
    public static final String COL_ID = "id";
    public static final String COL_CUSTOMER_ID = "customer_id";
    public static final String COL_CUSTOMER_NAME = "customer_name";
    public static final String COL_CONTENT = "content";
    private static final long serialVersionUID = 1L;
    @Column(name = "customer_id")
    private Long customerId;
    @Column(name = "customer_name")
    private String customerName;
    @Column(name = "content")
    private String content;
}