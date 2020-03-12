package cn.dbdj1201.orm.controller;

import cn.dbdj1201.orm.domain.Permission;
import cn.dbdj1201.orm.service.IPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author tyz1201
 * @datetime 2020-03-11 18:33
 **/
@Controller
@RequestMapping("/permission")
public class PermissionController {

    @Autowired
    private IPermissionService permissionService;

    @RequestMapping("list")
    public ModelAndView list() {
        ModelAndView mav = new ModelAndView();
        List<Permission> permissionList = permissionService.findAll();
        mav.addObject("permissionList", permissionList);
        mav.setViewName("permission-list");
        return mav;
    }

    @RequestMapping("/details")
    public ModelAndView getDetails(@RequestParam(defaultValue = "1") Integer id) {
        ModelAndView mav = new ModelAndView();
        mav.addObject("permission", permissionService.findById(id));
        mav.setViewName("permission-details");
        return mav;
    }

    @RequestMapping("/addPermission")
    public String addPermission(Permission permission) {
        permissionService.save(permission);
        return "redirect:/permission/list";
    }

    @RequestMapping("/delete")
    public String deleteById(@RequestParam Integer id) {
        permissionService.deleteById(id);
        return "redirect:/permission/list";
    }

    @RequestMapping("/toAdd")
    public String toAdd() {
        return "permission-add";
    }

}
