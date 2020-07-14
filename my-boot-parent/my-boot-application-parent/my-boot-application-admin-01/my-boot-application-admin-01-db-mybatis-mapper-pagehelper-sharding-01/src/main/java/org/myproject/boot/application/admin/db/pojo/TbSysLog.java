package org.myproject.boot.application.admin.db.pojo;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;

@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "tb_sys_log")
public class TbSysLog extends BaseEntity implements Serializable {
    @Column(name = "url")
    private String url;

    @Column(name = "`method`")
    private String method;

    @Column(name = "params")
    private String params;

    private static final long serialVersionUID = 1L;
}