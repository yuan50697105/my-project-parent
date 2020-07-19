package org.myproject.cloud.application.admin.api.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-25 00:09
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class IPage<T> implements Serializable {
    private long page;
    private long size;
    private long totalRows;
    private long totalPages;
    private List<T> data;
}
