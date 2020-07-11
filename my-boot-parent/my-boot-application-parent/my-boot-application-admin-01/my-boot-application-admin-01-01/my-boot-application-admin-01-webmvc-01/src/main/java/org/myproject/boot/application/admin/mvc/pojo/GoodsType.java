package org.myproject.boot.application.admin.mvc.pojo;

import java.io.Serializable;
import lombok.Data;

@Data
public class GoodsType implements Serializable {
    private Long id;

    private String name;

    private static final long serialVersionUID = 1L;
}