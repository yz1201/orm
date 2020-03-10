package cn.dbdj1201.orm.dao;

import cn.dbdj1201.orm.domain.Orders;
import org.aspectj.weaver.ast.Or;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @author tyz1201
 * @datetime 2020-03-10 21:54
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext-dao.xml")
public class IOrdersDaoTest {

    @Autowired
    private IOrdersDao iOrdersDao;

    @Test
    public void findAll() {
        iOrdersDao.findAll().forEach(orders -> System.out.println(orders.getId() + " member-->" + orders.getMember() +
                " travellers-->" + orders.getTravellers()));
    }

    @Test
    public void save() {
        Orders orders = new Orders();
    }

    @Test
    public void findById() {

    }
}