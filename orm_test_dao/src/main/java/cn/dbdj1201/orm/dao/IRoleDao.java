package cn.dbdj1201.orm.dao;

import cn.dbdj1201.orm.domain.Permission;
import cn.dbdj1201.orm.domain.Role;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

/**
 * @author tyz1201
 * @datetime 2020-03-11 11:50
 **/
public interface IRoleDao {

    /**
     * @param uid
     * @return
     */
    @Select("select * from role where id in (select rid from users_role where uid = #{uid})")
    @Results({
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "roleName", column = "roleName"),
            @Result(property = "roleDesc", column = "roleDesc"),
            @Result(property = "permissions", column = "id", javaType = java.util.List.class,
                    many = @Many(select = "cn.dbdj1201.orm.dao.IPermissionDao.findPermissionByRid"))
    })
    List<Role> findRoleByUid(int uid);

    /**
     * @return
     */
    @Select("select * from role")
    List<Role> findAll();

    /**
     * @param role
     */
    @Update("insert into role(roleName,roleDesc) values(#{roleName},#{roleDesc})")
    void save(Role role);

    /**
     * @param roleId
     * @return
     */
    @Select("select * from role where id = #{roleId}")
    @Results({
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "roleName", column = "roleName"),
            @Result(property = "roleDesc", column = "roleDesc"),
            @Result(property = "permissions", column = "id", javaType = java.util.List.class,
                    many = @Many(select = "cn.dbdj1201.orm.dao.IPermissionDao.findPermissionByRid",
                            fetchType = FetchType.LAZY))
    })
    Role findByRoleId(int roleId);


    /**
     * @param roleId
     * @return
     */
    @Select("select * from Permission where id not in (select pid from role_permission where rid = #{roleId})")
    List<Permission> findPermissionNotInThisRole(int roleId);

    /**
     * @param id
     */
    @Update("delete from role where id = #{id}")
    void deleteById(int id);

    @Update("insert into role_permission (rid, pid) values (#{roleId}, #{pid})")
    void addPermissionToRole(@Param("roleId") int roleId, @Param("pid") int pid);
}
