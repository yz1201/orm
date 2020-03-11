package cn.dbdj1201.orm.service;

import cn.dbdj1201.orm.domain.Role;

import java.util.List;

/**
 * @author tyz1201
 * @datetime 2020-03-11 16:42
 **/

public interface IRoleService {

    List<Role> findAll(int cureentPage, int size);

    Role findById(int id);

    void save(Role role);
}
