package org.myproject.boot.application.admin.service.pojo;

import com.github.pagehelper.PageInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.application.admin.service.pojo.dto.IPageResult;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-28 21:11
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class IDBPageResult<T> extends IPageResult<T> {
    public IDBPageResult(PageInfo<T> pageInfo) {
        super(pageInfo.getPageNum(), pageInfo.getPageSize(), pageInfo.getList(), pageInfo.getPages(), pageInfo.getTotal());
    }
}