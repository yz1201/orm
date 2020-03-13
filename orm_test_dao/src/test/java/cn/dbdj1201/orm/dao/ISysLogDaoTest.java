package cn.dbdj1201.orm.dao;

import cn.dbdj1201.orm.domain.SysLog;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * @author tyz1201
 * @datetime 2020-03-13 14:11
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext-dao.xml")
public class ISysLogDaoTest {

    @Autowired
    private ISysLogDao sysLogDao;

    @Test
    public void findAll() {
        sysLogDao.findAll().forEach(System.out::println);
    }

    @Test
    public void save() {
        SysLog sysLog = new SysLog();
        sysLog.setVisitTime(new Date());
        sysLog.setUsername("yz1201");
        sysLog.setUrl("/test/01");
        sysLog.setMethod("/findAll");
        sysLog.setExecutionTime(23L);
        sysLog.setIp("123.124.125.126");
        sysLogDao.save(sysLog);
    }
}