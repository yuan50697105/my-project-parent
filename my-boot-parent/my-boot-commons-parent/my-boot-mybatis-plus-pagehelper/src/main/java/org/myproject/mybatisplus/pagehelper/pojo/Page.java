package org.myproject.mybatisplus.pagehelper.pojo;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.github.pagehelper.PageInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.commons.pojo.AbstractPage;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-25 02:19
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class Page<T> extends AbstractPage<T> {
    public Page(PageInfo<T> pageInfo) {
        super(pageInfo.getPageNum(), pageInfo.getPageSize(), pageInfo.getTotal(), pageInfo.getPages(), pageInfo.getList());
    }

    public Page(IPage<T> iPage) {
        super(iPage.getCurrent(), iPage.getSize(), iPage.getTotal(), iPage.getPages(), iPage.getRecords());
    }
}