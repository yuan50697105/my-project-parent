package org.myproject.boot.application.admin.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class SysLogQuery implements Serializable {
    private static final long serialVersionUID = 1L;
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
}

