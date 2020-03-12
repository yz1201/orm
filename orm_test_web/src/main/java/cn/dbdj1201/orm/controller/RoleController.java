package cn.dbdj1201.orm.controller;

import cn.dbdj1201.orm.domain.Permission;
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
    public ModelAndView list(@RequestParam(value = "page", defaultValue = "1") Integer currentPage,
                             @RequestParam(defaultValue = "10") Integer size) {
        ModelAndView mav = new ModelAndView();
        List<Role> roles = roleService.findAll(currentPage, size);
        PageInfo pageInfo = new PageInfo(roles);
        mav.addObject("pageInfo", pageInfo);
        mav.setViewName("role-list");
        return mav;
    }

    @RequestMapping("/details")
    public ModelAndView getDetails(@RequestParam(name = "id", defaultValue = "1") Integer roleId) {
        ModelAndView mav = new ModelAndView();
        Role role = roleService.findByRoleId(roleId);
        mav.addObject("role", role);
        mav.setViewName("role-details");
        return mav;
    }

    @RequestMapping("/addRole")
    public String addRole(Role role) {
        roleService.save(role);
        return "redirect:/role/list";
    }

    @RequestMapping("/findByPId")
    public ModelAndView findByPId(@RequestParam Integer id) {
        return null;
    }

    @RequestMapping("/add")
    public String addRole() {
        return "role-add";
    }

    @RequestMapping("/delete")
    public String deleteRole(@RequestParam Integer id) {
        roleService.deleteById(id);
        return "redirect:role-list";
    }


    @RequestMapping("/addPermission")
    public ModelAndView addPermission(@RequestParam("id") Integer roleId) {
        ModelAndView mav = new ModelAndView();
        Role role = roleService.findByRoleId(roleId);
        List<Permission> permissions = roleService.findOtherPermission(roleId);
        mav.addObject("role", role);
        mav.addObject("permissionList", permissions);
        mav.setViewName("role-permission-add");
        return mav;
    }

    @RequestMapping("/addPermissionToRole")
    public ModelAndView addPermissionToRole(@RequestParam Integer roleId, @RequestParam(required = false) Integer[] ids) {
        ModelAndView mav = new ModelAndView();
        roleService.addPermissionsToRole(roleId, ids);
        Role role = roleService.findByRoleId(roleId);
        mav.addObject("role", role);
        mav.setViewName("role-details");
        return mav;
    }
}
