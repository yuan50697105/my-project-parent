package org.myproject.boot.application.admin.db.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SysLog {
    private static final long serialVersionUID = 1L;
    private Long id;

    private String url;

    private String method;

    private String params;
}