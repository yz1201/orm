package cn.dbdj1201.orm.service.impl;

import cn.dbdj1201.orm.domain.Permission;
import cn.dbdj1201.orm.service.IPermissionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author tyz1201
 * @datetime 2020-03-12 10:17
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext-service.xml")
public class PermissionServiceImplTest {

    @Autowired
    private IPermissionService permissionService;

    @Test
    public void save() {
        Permission permission = new Permission();
        permission.setPermissionName("test");
        permission.setUrl("/test");
        permissionService.save(permission);
    }

    @Test
    public void deleteById() {
        permissionService.deleteById(9);
    }
}