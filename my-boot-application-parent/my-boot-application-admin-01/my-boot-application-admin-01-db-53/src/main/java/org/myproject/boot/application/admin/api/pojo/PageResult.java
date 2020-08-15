package org.myproject.boot.application.admin.api.pojo;

import com.github.pagehelper.PageInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-08-04 14:39
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class PageResult<T> extends IPage<T> {
    public PageResult(PageInfo<T> pageInfo) {
        super(pageInfo.getPageNum(), pageInfo.getSize(), pageInfo.getTotal(), pageInfo.getPages(), pageInfo.getList());
    }

    public PageResult(com.baomidou.mybatisplus.core.metadata.IPage<T> iPage) {
        super(iPage.getCurrent(), iPage.getSize(), iPage.getTotal(), iPage.getPages(), iPage.getRecords());
    }
}