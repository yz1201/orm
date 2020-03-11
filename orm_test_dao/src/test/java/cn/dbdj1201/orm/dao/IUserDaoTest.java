package cn.dbdj1201.orm.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author tyz1201
 * @datetime 2020-03-11 12:44
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext-dao.xml")
public class IUserDaoTest {

    @Autowired
    private IUserDao userDao;

    @Test
    public void findUserById() {
        System.out.println(userDao.findUserById(1));
    }

    @Test
    public void findAll() {
        userDao.findAll().forEach(System.out::println);
    }

    @Test
    public void findByUsername() {
        System.out.println(userDao.findByUsername("test"));
    }
}