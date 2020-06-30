package org.myproject.boot.application.admin.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @program: my-boot-application-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-06-30 22:53
 */
@Controller
public class IndexController {
    @GetMapping("index")
    public String index(Model model) {
        model.addAttribute("index", "initialization");
        return "index";
    }

    @GetMapping("index2")
    public String index2(Model model) {
        model.addAttribute("index", "initialization");
        return "index2";

    }
}