package org.myproject.boot.application.admin.db.pojo;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;

@Data
@EqualsAndHashCode(callSuper = true)
public class TbSysLog extends BaseEntity implements Serializable {
    public static final String COL_ID = "id";
    public static final String COL_URL = "url";
    public static final String COL_METHOD = "method";
    public static final String COL_PARAMS = "params";
    private String url;

    private String method;

    private String params;

    private static final long serialVersionUID = 1L;
}