package cn.dbdj1201.orm.controller;

import cn.dbdj1201.orm.service.ISysLogService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private ISysLogService sysLogService;

    @RequestMapping("/list")
    public ModelAndView list() {
        ModelAndView mav = new ModelAndView();
        mav.addObject("sysLogList", sysLogService.findAll());
        mav.setViewName("syslog-list");
        return mav;
    }
}
