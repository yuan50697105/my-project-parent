package org.myproject.boot.mybatis.commons.pojo;

import java.util.List;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-25 00:09
 */
public interface IPage<T> {
    long getPage();

    long getSize();

    long getTotalRows();

    long getTotalPages();

    List<T> getData();
}
