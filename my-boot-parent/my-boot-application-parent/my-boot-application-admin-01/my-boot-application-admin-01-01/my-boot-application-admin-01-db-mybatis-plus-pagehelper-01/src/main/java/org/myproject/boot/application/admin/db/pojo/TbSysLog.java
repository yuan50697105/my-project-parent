package org.myproject.boot.application.admin.db.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;

@Data
@EqualsAndHashCode(callSuper=true)
@TableName(value = "tb_sys_log")
public class TbSysLog extends BaseEntity implements Serializable {
    @TableField(value = "url")
    private String url;

    @TableField(value = "method")
    private String method;

    @TableField(value = "params")
    private String params;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_URL = "url";

    public static final String COL_METHOD = "method";

    public static final String COL_PARAMS = "params";
}