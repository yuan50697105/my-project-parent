package org.myproject.boot.application.admin.mvc.controller;

import cn.hutool.core.lang.tree.Tree;
import cn.hutool.core.lang.tree.TreeNode;
import cn.hutool.core.lang.tree.TreeUtil;
import cn.hutool.json.JSONUtil;
import lombok.extern.slf4j.Slf4j;
import org.myproject.boot.application.admin.db.pojo.SysRoute;
import org.myproject.boot.application.admin.db.pojo.SysRouteExample;
import org.myproject.boot.application.admin.db.service.SysRouteService;
import org.myproject.boot.application.admin.db.service.SysUserRouteService;
import org.myproject.boot.application.admin.mvc.RouteUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @program: my-boot-application-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-06-30 22:53
 */
@Controller
@Slf4j
public class IndexController {
    @Autowired
    private SysRouteService sysRouteService;

    /**
     * 首页
     */
    @GetMapping("index")
    String index(Model model) {
        List<SysRoute> sysRoutes = sysRouteService.selectByExample(new SysRouteExample());
        List<TreeNode<Long>> treeNodeList = RouteUtils.convert(sysRoutes);
        List<Tree<Long>> list = TreeUtil.build(treeNodeList, 1L);
        log.info("JSONUtil.toJsonPrettyStr(list) = " + JSONUtil.toJsonPrettyStr(list));
        return "index";
    }


}