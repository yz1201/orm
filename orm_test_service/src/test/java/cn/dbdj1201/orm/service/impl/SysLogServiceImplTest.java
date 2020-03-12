package cn.dbdj1201.orm.service.impl;

import cn.dbdj1201.orm.domain.SysLog;
import cn.dbdj1201.orm.service.ISysLogService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * @author tyz1201
 * @datetime 2020-03-12 18:49
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext-service.xml")
public class SysLogServiceImplTest {

    @Autowired
    private ISysLogService sysLogService;

    @Test
    public void findAll() {
        sysLogService.findAll().forEach(System.out::println);
    }

    @Test
    public void save() {
        SysLog sysLog = new SysLog();
        sysLog.setIp("192.168.125.1");
        sysLog.setExecutionTime(System.currentTimeMillis());
        sysLog.setMethod("method.getName()");
        sysLog.setUrl("/test/t1");
        sysLog.setUsername("test");
        sysLog.setVisitTime(new Date());
        sysLogService.save(sysLog);
    }
}