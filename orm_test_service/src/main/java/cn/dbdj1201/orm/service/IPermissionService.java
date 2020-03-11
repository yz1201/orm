package cn.dbdj1201.orm.service;

import cn.dbdj1201.orm.domain.Permission;

import java.util.List;

/**
 * @author tyz1201
 * @datetime 2020-03-11 18:34
 **/
public interface IPermissionService {

    List<Permission> findAll();

    void save(Permission permission);
}
