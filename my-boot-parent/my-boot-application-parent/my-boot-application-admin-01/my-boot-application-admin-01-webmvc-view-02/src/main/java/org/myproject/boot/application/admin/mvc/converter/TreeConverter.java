package org.myproject.boot.application.admin.mvc.converter;

import cn.hutool.core.lang.tree.TreeNode;
import org.myproject.boot.application.admin.db.pojo.SysRoute;

import java.util.List;

/**
 * @program: my-boot-application-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-07-01 08:41
 */
public interface TreeConverter {
    List<TreeNode<Long>> convert(List<SysRoute> sysRoutes);

    TreeNode<Long> convert(SysRoute sysRoute);
}
