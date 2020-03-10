package cn.dbdj1201.orm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author tyz1201
 * @datetime 2020-03-10 14:34
 * 解决前台页面跳转
 **/
@Controller
@RequestMapping("/pages")
public class PageController {

    @RequestMapping("/main")
    public String toMain() {
        return "main";
    }

//    @RequestMapping("/productAdd")
//    public String toProductAdd(){
//        return "product-add";
//    }
}
