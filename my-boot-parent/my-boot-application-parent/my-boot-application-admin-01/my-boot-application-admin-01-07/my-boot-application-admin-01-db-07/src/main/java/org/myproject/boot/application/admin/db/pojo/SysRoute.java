package org.myproject.boot.application.admin.db.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName(value = "sys_route")
public class SysRoute extends BaseEntity {
    private static final long serialVersionUID = 1L;
    @TableField(value = "url")
    private String url;

    @TableField(value = "name")
    private String name;

    @TableField(value = "parent_id")
    private Long parentId;

    @TableField(value = "weight")
    private Integer weight;

    public static final String COL_ID = "id";

    public static final String COL_URL = "url";

    public static final String COL_NAME = "name";

    public static final String COL_PARENT_ID = "parent_id";

    public static final String COL_WEIGHT = "weight";
}