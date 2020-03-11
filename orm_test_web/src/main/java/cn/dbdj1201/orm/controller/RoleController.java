package cn.dbdj1201.orm.controller;

import cn.dbdj1201.orm.domain.Role;
import cn.dbdj1201.orm.service.IRoleService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author tyz1201
 * @datetime 2020-03-11 16:39
 **/
@Controller
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private IRoleService roleService;

    @RequestMapping("/list")
    public ModelAndView list(@RequestParam(value = "page", defaultValue = "1") int currentPage,
                             @RequestParam(defaultValue = "10") int size) {
        ModelAndView mav = new ModelAndView();
        List<Role> roles = roleService.findAll(currentPage, size);
        PageInfo pageInfo = new PageInfo(roles);
        mav.addObject("pageInfo", pageInfo);
        mav.setViewName("role-list");
        return mav;
    }

    @RequestMapping("/details")
    public ModelAndView getDetails(@RequestParam int id) {
        ModelAndView mav = new ModelAndView();
        Role role = roleService.findById(id);
        mav.addObject("role", role);
        mav.setViewName("user-role-details");
        return mav;
    }

    @RequestMapping("/addRole")
    public String addRole(Role role) {
        roleService.save(role);
        return "redirect:/role/list";
    }

    @RequestMapping("/add")
    public String addRole() {
        return "role-add";
    }

    @RequestMapping("/delete")
    public String deleteRole() {
        return "role-delete";
    }

}
