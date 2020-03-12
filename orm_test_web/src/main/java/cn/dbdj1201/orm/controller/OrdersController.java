package cn.dbdj1201.orm.controller;

import cn.dbdj1201.orm.domain.Orders;
import cn.dbdj1201.orm.service.IOrdersService;
import cn.dbdj1201.orm.service.impl.OrdersServiceImpl;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author tyz1201
 * @datetime 2020-03-10 22:25
 **/
@Controller
@RequestMapping("/orders")
public class OrdersController {
    @Autowired
    private IOrdersService iOrdersService;

    /**
     * 分页查询
     *
     * @param currentPage
     * @param size
     * @return
     */
    @RequestMapping("/list")
    public ModelAndView list(@RequestParam(defaultValue = "1", name = "page") Integer currentPage,
                             @RequestParam(defaultValue = "10") Integer size) {
        ModelAndView mav = new ModelAndView();
        List<Orders> ordersList = iOrdersService.findAll(currentPage, size);
        PageInfo pageInfo = new PageInfo(ordersList);
        mav.addObject("pageInfo", pageInfo);
        mav.setViewName("orders-page-list");
        return mav;
    }

    /**
     * 订单详情
     *
     * @return
     */
    @RequestMapping("/add")
    public String details(@RequestParam Integer id) {
        return "user-add";
    }

}
