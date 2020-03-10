package cn.dbdj1201.orm.service.impl;

import cn.dbdj1201.orm.service.IOrdersService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @author tyz1201
 * @datetime 2020-03-10 22:31
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext-service.xml")
public class OrdersServiceImplTest {

    @Autowired
    private IOrdersService ordersService;

    @Test
    public void findAll() {
        ordersService.findAll(1, 5).forEach(System.out::println);
    }

    @Test
    public void findById() {
        ordersService.findById(1).getTravellers().forEach(System.out::println);
    }
}