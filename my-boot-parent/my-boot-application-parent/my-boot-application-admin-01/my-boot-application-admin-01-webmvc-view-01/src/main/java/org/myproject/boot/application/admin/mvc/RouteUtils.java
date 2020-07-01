package org.myproject.boot.application.admin.mvc;

import cn.hutool.core.lang.tree.TreeNode;
import org.myproject.boot.application.admin.db.pojo.SysRoute;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @program: my-boot-application-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-07-01 08:44
 */
public class RouteUtils {
    public static List<TreeNode<Long>> convert(List<SysRoute> sysRoutes) {
        ArrayList<TreeNode<Long>> treeNodes = new ArrayList<>();
        for (SysRoute sysRoute : sysRoutes) {
            TreeNode<Long> treeNode = new TreeNode<>(sysRoute.getId(), sysRoute.getParentId(), sysRoute.getName(), sysRoute.getWeight());
            HashMap<String, Object> extra = new HashMap<>();
            extra.put("url", sysRoute.getUrl());
            treeNode.setExtra(extra);
            treeNodes.add(treeNode);
        }
        return treeNodes;
    }
}