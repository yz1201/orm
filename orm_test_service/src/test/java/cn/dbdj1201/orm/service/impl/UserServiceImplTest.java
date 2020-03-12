//package cn.dbdj1201.orm.service.impl;
//
//import cn.dbdj1201.orm.domain.UserInfo;
//import cn.dbdj1201.orm.service.IUserService;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import static org.junit.Assert.*;
//
///**
// * @author tyz1201
// * @datetime 2020-03-11 14:29
// **/
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = "classpath:spring/applicationContext-service.xml")
//public class UserServiceImplTest {
//
//    @Autowired
//    private IUserService userService;
//
//    @Test
//    public void save() {
//        UserInfo userInfo = new UserInfo();
//        userInfo.setEmail("15757121191@163.com");
//        userInfo.setPassword("test");
//        userInfo.setStatus(1);
//        userInfo.setUsername("test");
//        userService.save(userInfo);
//    }
//
//    @Test
//    public void loadUserByUsername() {
//        System.out.println(userService.loadUserByUsername("root"));
//    }
//
//    @Test
//    public void findAll() {
//    }
//
//    @Test
//    public void findById() {
//
//        userService.findById(1).getRoles().forEach(System.out::println);
//
//    }
//
//    @Test
//    public void getAuthority() {
//    }
//
//    @Test
//    public void testFindAll() {
//        userService.findAll(3, 5).forEach(System.out::println);
//    }
//
//    @Test
//    public void testFindById() {
//    }
//
//    @Test
//    public void addRoleToUser() {
//        userService.addRoleToUser(19, 4, 5, 6, 7, 8, 9, 10);
//    }
//}