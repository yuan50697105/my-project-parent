package org.myproject.cloud.application.admin.api.pojo;

import com.github.pagehelper.PageInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-18 00:00
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class PageResult<T> extends org.myproject.boot.mybatis.pojo.PageResult<T> implements IPage<T> {

    public PageResult(PageInfo<T> pageInfo) {
        super(pageInfo);
    }

}