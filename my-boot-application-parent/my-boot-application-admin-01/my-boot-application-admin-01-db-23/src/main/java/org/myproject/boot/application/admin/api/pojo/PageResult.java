package org.myproject.boot.application.admin.api.pojo;

import com.github.pagehelper.PageInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-20 08:13
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class PageResult<T> extends IPage<T> {
    public PageResult(PageInfo<T> pageInfo) {
        super(pageInfo.getPageNum(), pageInfo.getPageSize(), pageInfo.getTotal(), pageInfo.getPages(), pageInfo.getList());
    }
}