package org.myproject.boot.application.admin.db.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
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
@EqualsAndHashCode(callSuper=true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "sys_route")
public class SysRoute extends BaseEntity implements Serializable {
    @TableField(value = "url")
    private String url;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_URL = "url";
}