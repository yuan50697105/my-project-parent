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

@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "sys_log")
public class SysLog extends BaseEntity {
    @TableField(value = "url")
    private String url;

    @TableField(value = "method")
    private String method;

    @TableField(value = "params")
    private String params;

    public static final String COL_ID = "id";

    public static final String COL_URL = "url";

    public static final String COL_METHOD = "method";

    public static final String COL_PARAMS = "params";
}