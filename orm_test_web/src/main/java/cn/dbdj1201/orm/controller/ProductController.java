package cn.dbdj1201.orm.controller;

import cn.dbdj1201.orm.domain.Product;
import cn.dbdj1201.orm.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author tyz1201
 * @datetime 2020-03-09 14:40
 **/
@Controller
@RequestMapping("/product")
public class ProductController {

    @Resource(name = "productService")
    private IProductService productService;

    @RequestMapping("/link")
    public String testLink(Model model) {
        productService.findAll().forEach(System.out::println);
        List<Product> products = productService.findAll();
        model.addAttribute("products", products);
        return "success";
    }
}
