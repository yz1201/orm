package cn.dbdj1201.orm.service;

import cn.dbdj1201.orm.domain.Permission;

import java.util.List;

/**
 * @author tyz1201
 * @datetime 2020-03-11 18:34
 **/
public interface IPermissionService {

    /**
     * @return
     */
    List<Permission> findAll();


    /**
     * @param id
     * @return
     */
    Permission findById(int id);

    /**
     * @param permission
     */
    void save(Permission permission);

    /**
     * @param id
     */
    void deleteById(int id);
}
