package cn.dbdj1201.orm.dao;

import cn.dbdj1201.orm.domain.Role;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

/**
 * @author tyz1201
 * @datetime 2020-03-11 11:50
 **/
public interface IRoleDao {

    @Select("select * from role where id in (select rid from users_role where uid = #{uid})")
    @Results({
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "roleName", column = "roleName"),
            @Result(property = "roleDesc", column = "roleDesc"),
            @Result(property = "permissions", column = "id", javaType = java.util.List.class,
                    many = @Many(select = "cn.dbdj1201.orm.dao.IPermissionDao.findPermissionByRid"))
    })
    List<Role> findRoleByUid(int uid);

    @Select("select * from role")
    List<Role> findAll();

    @Update("insert into role(roleName,roleDesc) values(#{roleName},#{roleDesc})")
    void save(Role role);

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
}
