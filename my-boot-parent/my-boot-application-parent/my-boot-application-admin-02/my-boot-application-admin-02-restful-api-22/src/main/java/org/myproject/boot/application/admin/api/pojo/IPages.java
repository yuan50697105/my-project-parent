package org.myproject.boot.application.admin.api.pojo;

import lombok.Data;

import java.util.List;

/**
 * @program: my-boot-application-admin-02
 * @description:
 * @author: yuane
 * @create: 2020-08-07 22:26
 */
@Data
public class IPages<T> {
    private long page;
    private long limit;
    private long totalPages;
    private long totalRows;
    private List<T> list;

}