package cn.dbdj1201.orm.service.impl;

import cn.dbdj1201.orm.service.IRoleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @author tyz1201
 * @datetime 2020-03-12 11:59
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext-service.xml")
public class RoleServiceImplTest {

    @Autowired
    private IRoleService roleService;

    @Test
    public void findOtherPermission() {
        roleService.findOtherPermission(1).forEach(System.out::println);
    }
}