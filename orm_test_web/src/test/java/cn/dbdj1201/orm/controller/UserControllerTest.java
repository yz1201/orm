package cn.dbdj1201.orm.controller;

import cn.dbdj1201.orm.service.IPermissionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * @author tyz1201
 * @datetime 2020-03-11 14:35
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UserControllerTest {


    @Autowired
    private IPermissionService permissionService;

    @Test
    public void add() {
        permissionService.deleteById(9);
    }
}