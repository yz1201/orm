package cn.dbdj1201.orm.dao;

import cn.dbdj1201.orm.domain.Permission;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author tyz1201
 * @datetime 2020-03-11 15:56
 **/
public interface IPermissionDao {

    @Select("select * from permission where id in (select pid from role_permission where rid = #{rid})")
    List<Permission> findPermissionByRid(int rid);

    @Select("select * from permission")
    List<Permission> findAll();

    @Insert("insert into permission(permissionName, url) values(#{permissionName}, #{url})")
    void save(Permission permission);

    /**
     * @param id
     * @return
     */
    @Select("select * from permission where id =#{id}")
    Permission findById(int id);


    @Update("delete from role_permission where pid = #{pid}")
    void deleteFromRolePermission(int pid);

    /**
     * @param id
     */
    @Update("delete from permission where id = #{id}")
    void deleteById(int id);
}
