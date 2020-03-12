package cn.dbdj1201.orm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author tyz1201
 * @datetime 2020-03-12 18:40
 **/
@Controller
@RequestMapping("/syslog")
public class SysLogController {

    @RequestMapping("/list")
    public ModelAndView list() {
        ModelAndView mav = new ModelAndView();


        mav.setViewName("syslog-list");
        return null;
    }
}
