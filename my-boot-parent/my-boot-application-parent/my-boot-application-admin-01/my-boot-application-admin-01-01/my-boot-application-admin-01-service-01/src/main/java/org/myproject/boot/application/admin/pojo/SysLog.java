package org.myproject.boot.application.admin.pojo;

import java.io.Serializable;
import lombok.Data;

@Data
public class SysLog implements Serializable {
    /**
     *
     */
    private Long id;

    /**
     *
     */
    private String url;

    /**
     *
     */
    private String method;

    /**
     *
     */
    private String params;

    private static final long serialVersionUID = 1L;
}

