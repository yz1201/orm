package cn.dbdj1201.orm.dao;

import cn.dbdj1201.orm.domain.Role;
import cn.dbdj1201.orm.domain.User;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

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
            @Result(property = "roles", column = "id", many = @Many(select = "cn.dbdj1201.dao.IRoleDao.findRoleByUid"))
    })
    User findUserById();

    @Select("select * from users")
    List<User> findAll();

    User findByUsername(String username);


}
