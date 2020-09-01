package org.myproject.app.cloud.area.pojo;

import com.github.pagehelper.PageInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @program: my-project-spring
 * @description:
 * @author: yuane
 * @create: 2020-09-01 21:58
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class IPageInfo<T> extends org.myproject.app.area.pojo.IPageInfo<T> {

    public IPageInfo(PageInfo<T> pageInfo) {
        super(pageInfo);
    }
}