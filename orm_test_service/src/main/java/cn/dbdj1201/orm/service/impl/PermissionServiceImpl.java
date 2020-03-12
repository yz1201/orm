package cn.dbdj1201.orm.service.impl;

import cn.dbdj1201.orm.dao.IPermissionDao;
import cn.dbdj1201.orm.domain.Permission;
import cn.dbdj1201.orm.service.IPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author tyz1201
 * @datetime 2020-03-11 18:35
 **/
@Service
@Transactional
public class PermissionServiceImpl implements IPermissionService {

    @Autowired
    private IPermissionDao permissionDao;

    @Override
    public List<Permission> findAll() {
        return permissionDao.findAll();
    }

    @Override
    public Permission findById(int id) {
        return permissionDao.findById(id);
    }

    @Override
    public void save(Permission permission) {
        permissionDao.save(permission);
    }

    @Override
    public void deleteById(int id) {
        permissionDao.deleteFromRolePermission(id);
        permissionDao.deleteById(id);
    }
}
