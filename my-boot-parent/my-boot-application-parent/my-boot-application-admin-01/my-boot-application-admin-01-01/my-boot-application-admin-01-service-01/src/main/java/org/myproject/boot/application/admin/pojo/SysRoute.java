package org.myproject.boot.application.admin.pojo;

import java.io.Serializable;
import lombok.Data;

@Data
public class SysRoute implements Serializable {
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
    private String name;

    /**
     *
     */
    private Long parentId;

    /**
     *
     */
    private Integer weight;

    private static final long serialVersionUID = 1L;
}

