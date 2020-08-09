package org.myproject.boot.application.commons.pojo;

import lombok.*;

import java.util.List;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-08-05 14:57
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@With
@Builder(toBuilder = true)
public class IPage<T> {
    private long page;
    private long limit;
    private long totalPages;
    private long totalRows;
    private List<T> list;
}