package cn.dbdj1201.orm.dao;

import cn.dbdj1201.orm.domain.Role;
import cn.dbdj1201.orm.domain.UserInfo;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

/**
 * @author tyz1201
 * @datetime 2020-03-11 2:13
 **/
public interface IUserDao {

    @Select("select * from users where id = #{id}")
    @Results({
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "username", column = "username"),
            @Result(property = "password", column = "password"),
            @Result(property = "email", column = "email"),
            @Result(property = "phoneNum", column = "phoneNum"),
            @Result(property = "status", column = "status"),
            @Result(property = "roles", column = "id", many = @Many(select = "cn.dbdj1201.orm.dao.IRoleDao.findRoleByUid",
                    fetchType = FetchType.LAZY))
    })
    UserInfo findUserById(int id);

    @Select("select * from users")
    List<UserInfo> findAll();

    @Select("select * from users where username = #{username}")
    @Results({
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "username", column = "username"),
            @Result(property = "password", column = "password"),
            @Result(property = "email", column = "email"),
            @Result(property = "phoneNum", column = "phoneNum"),
            @Result(property = "status", column = "status"),
            @Result(property = "roles", column = "id", many = @Many(select = "cn.dbdj1201.orm.dao.IRoleDao.findRoleByUid",
                    fetchType = FetchType.LAZY))
    })
    UserInfo findByUsername(String username);

    @Update("insert into users(email, username, password, phoneNum, status) values(#{email},#{username},#{password},#{phoneNum},#{status})")
    void save(UserInfo userInfo);

    /**
     * @param userId
     * @return
     */
    @Select("select * from role where id not in (select rid from users_role where uid = #{userId})")
    List<Role> findRolesNotInThisUser(int userId);

    /**
     * @param uid
     * @param rid
     */
    @Update("insert into users_role(uid, rid) values(#{uid}, #{rid})")
    void addRoleToUser(@Param("uid") int uid, @Param("rid") int rid);


}
