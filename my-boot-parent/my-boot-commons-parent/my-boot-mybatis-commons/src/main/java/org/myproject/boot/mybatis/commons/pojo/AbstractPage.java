package org.myproject.boot.mybatis.commons.pojo;

import lombok.Data;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-25 00:08
 */
@Data
public class AbstractPage<T> implements IPage<T> {
    private long page;
    private long size;
    private long totalRows;
    private long totalPages;
    private Iterable<T> data;

    public AbstractPage(long page, long size, long totalRows, long totalPages, Iterable<T> data) {
        this.page = page;
        this.size = size;
        this.totalRows = totalRows;
        this.totalPages = totalPages;
        this.data = data;
    }

    @Override
    public long getPage() {
        return page;
    }

    @Override
    public long getSize() {
        return size;
    }

    @Override
    public long getTotalRows() {
        return totalRows;
    }

    @Override
    public long getTotalPages() {
        return totalPages;
    }

    @Override
    public Iterable<T> getData() {
        return data;
    }
}