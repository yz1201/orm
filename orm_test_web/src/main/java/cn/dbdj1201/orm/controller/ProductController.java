package cn.dbdj1201.orm.controller;

import cn.dbdj1201.orm.domain.Product;
import cn.dbdj1201.orm.service.IProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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

    @RequestMapping("/list")
    public String findAll(Model model) {
        productService.findAll().forEach(System.out::println);
        List<Product> products = productService.findAll();
        System.out.println("controller-->" + products);
        model.addAttribute("products", products);
        return "product-list";
    }

    @RequestMapping("/productAdd")
    public String addProduct() {
        return "product-add";
    }

    @RequestMapping("saveProduct")
    public String saveProduct(Product product) {
        productService.save(product);
        return "redirect:/product/list";
    }

}
