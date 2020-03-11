package cn.dbdj1201.orm.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @author tyz1201
 * @datetime 2020-03-11 12:52
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext-dao.xml")
public class IRoleDaoTest {

    @Autowired
    private IRoleDao roleDao;

    @Test
    public void findRoleByUid() {
        roleDao.findRoleByUid(1).forEach(System.out::println);
    }

    @Test
    public void findAll() {
        roleDao.findAll().forEach(System.out::println);
    }

    @Test
    public void save() {
    }
}