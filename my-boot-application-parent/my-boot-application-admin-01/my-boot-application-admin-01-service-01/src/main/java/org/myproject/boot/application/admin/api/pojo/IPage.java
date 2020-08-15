package org.myproject.boot.application.admin.api.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Delegate;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-20 08:09
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class IPage<T> {
    private long page;
    private long size;
    private long totalRows;
    private long totalPages;
    @Delegate
    private List<T> data = new ArrayList<>();

}