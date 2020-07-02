package org.myproject.boot.application.admin.db.pojo;

import java.io.Serializable;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.myproject.boot.mybatis.pojo.BaseEntity;

/**
 * 路由表
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "sys_route")
public class SysRoute extends BaseEntity implements Serializable {
    @Column(name = "url")
    private String url;

    @Column(name = "`name`")
    private String name;

    @Column(name = "parent_id")
    private Long parentId;

    @Column(name = "weight")
    private Integer weight;

    private static final long serialVersionUID = 1L;
}