package org.myproject.boot.application.admin.db.pojo;

import lombok.*;
import org.myproject.boot.mybatis.pojo.BaseEntity;

import java.io.Serializable;

/**
    * 路由表
    */
@Data
@EqualsAndHashCode(callSuper=true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SysRouteVo extends BaseEntity implements Serializable {
    private String url;

    private static final long serialVersionUID = 1L;
}