package org.myproject.boot.application.admin.db.pojo;

import java.io.Serializable;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.myproject.boot.mybatis.pojo.BaseEntity;

@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "sys_log")
public class SysLog extends BaseEntity implements Serializable {
    @Column(name = "url")
    private String url;

    @Column(name = "`method`")
    private String method;

    @Column(name = "params")
    private String params;

    private static final long serialVersionUID = 1L;
}