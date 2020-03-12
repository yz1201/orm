package cn.dbdj1201.orm.service;

import cn.dbdj1201.orm.domain.Permission;
import cn.dbdj1201.orm.domain.Role;

import java.util.List;

/**
 * @author tyz1201
 * @datetime 2020-03-11 16:42
 * 角色业务层
 **/

public interface IRoleService {

    /**
     * @param cureentPage
     * @param size
     * @return
     */
    List<Role> findAll(int cureentPage, int size);

    /**
     * @param roleId
     * @return
     */
    Role findByRoleId(int roleId);

    /**
     * @param roleId
     * @return
     */
    List<Permission> findOtherPermission(int roleId);

    /**
     * @param role
     */
    void save(Role role);

    /**
     * 删除业务
     *
     * @param id
     */
    void deleteById(int id);

    /**
     * 将选中的权限提交给当前角色
     *
     * @param roleId
     * @param pids
     */
    void addPermissionsToRole(int roleId, Integer[] pids);

}
