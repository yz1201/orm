package cn.dbdj1201.orm.controller;

import cn.dbdj1201.orm.domain.Role;
import cn.dbdj1201.orm.domain.UserInfo;
import cn.dbdj1201.orm.service.IUserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author tyz1201
 * @datetime 2020-03-11 13:22
 **/
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    /**
     * 分页查询
     *
     * @return
     */
    @Secured("ROLE_ADMIN")
    @RequestMapping("/list")
    public ModelAndView list(@RequestParam(name = "page", defaultValue = "1") int currentPage,
                             @RequestParam(defaultValue = "5") int size) {
        ModelAndView mav = new ModelAndView();
        System.out.println("current-->" + currentPage);
        List<UserInfo> users = userService.findAll(currentPage, size);
        users.forEach(System.out::println);
        PageInfo pageInfo = new PageInfo(users);
        mav.addObject("pageInfo", pageInfo);
        mav.setViewName("user-list");
        return mav;
    }

    /**
     * @param id
     * @return
     */
    @RequestMapping("/details")
    public ModelAndView getDetails(@RequestParam(defaultValue = "1") int id) {
        ModelAndView mav = new ModelAndView();
        UserInfo userInfo = userService.findById(id);
        mav.addObject("user", userInfo);
        mav.setViewName("user-role-details");
        return mav;
    }

    /**
     * @param userInfo
     * @return
     */
    @Secured("ROLE_ADMIN")
    @RequestMapping("/save")
    public String saveUser(UserInfo userInfo) {
        System.out.println("user info --> " + userInfo);
        userService.save(userInfo);
        return "redirect:/user/list";
    }

    /**
     * @param id
     * @return
     */
    @RequestMapping("/addRole")
    public ModelAndView addRole(@RequestParam int id) {
        ModelAndView mav = new ModelAndView();
        UserInfo user = userService.findById(id);
        List<Role> roles = userService.findOtherRoles(id);
        mav.addObject("user", user);
        mav.addObject("roleList", roles);
        mav.setViewName("user-role-add");
        return mav;
    }

    /**
     * @param userId
     * @param ids
     * @return
     */
    @RequestMapping("/addRoleToUser")
    public ModelAndView addRoleToUser(@RequestParam int userId, @RequestParam(required = false) int... ids) {
        ModelAndView mav = new ModelAndView();
        userService.addRoleToUser(userId, ids);
        UserInfo userInfo = userService.findById(userId);
        mav.addObject("user", userInfo);
        mav.setViewName("user-role-details");
        return mav;
    }

    @RequestMapping("/add")
    public String add() {
        return "user-add";
    }

}
