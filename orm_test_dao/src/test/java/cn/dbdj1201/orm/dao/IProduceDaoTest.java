package cn.dbdj1201.orm.dao;

import cn.dbdj1201.orm.domain.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

/**
 * @author tyz1201
 * @datetime 2020-03-09 13:53
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext-dao.xml")
public class IProduceDaoTest {

    @Autowired
    private IProductDao productDao;

    @Test
    public void findAll() {
        productDao.findAll().forEach(System.out::println);
    }

    @Test
    public void save() {
        Product pro = new Product();
        pro.setCityName("he lan");
        pro.setDepartureTime(new Date());
        pro.setProductDesc("chou sha chou");
        pro.setProductName("bang bang tang");
        pro.setProductStatus(0);
        pro.setProductPrice(258.82);
        pro.setProductNum("pxd-0258");
        productDao.save(pro);
    }
}