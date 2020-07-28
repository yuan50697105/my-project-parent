package org.myproject.boot.application.admin.service.pojo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-28 21:00
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class IPageResult<T> {
    private long page;
    private long limit;
    private Iterable<T> list;
    private long totalPages;
    private long totalRows;
}