package org.myproject.boot.application.admin.db.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;
import org.myproject.boot.mybatis.pojo.BaseEntity;

import java.io.Serializable;

/**
 * 路由表
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "sys_route")
public class SysRoute extends BaseEntity implements Serializable {
    public static final String COL_ID = "id";
    public static final String COL_URL = "url";
    private static final long serialVersionUID = 1L;
    @TableField(value = "url")
    private String url;
}