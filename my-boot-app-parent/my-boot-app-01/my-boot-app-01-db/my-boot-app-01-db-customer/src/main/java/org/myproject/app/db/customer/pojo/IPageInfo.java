package org.myproject.app.db.customer.pojo;

import com.github.pagehelper.PageInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.app.db.commons.pojo.IPage;

import java.util.List;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-08-23 18:48
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class IPageInfo<T> extends IPage<T> {
    public IPageInfo(PageInfo<T> pageInfo) {
        super(pageInfo.getTotal(), pageInfo.getList());
    }

    public IPageInfo(Long total, List<T> list) {
        super(total, list);
    }
}