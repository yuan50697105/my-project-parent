package org.myproject.boot.application.admin.mvc.pojo;

import java.io.Serializable;
import lombok.Data;

@Data
public class CustomerType implements Serializable {
    private Long id;

    private Integer name;

    private static final long serialVersionUID = 1L;
}