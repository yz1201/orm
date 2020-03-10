package cn.dbdj1201.orm.dao;

import cn.dbdj1201.orm.domain.User;
import org.apache.ibatis.annotations.Select;

/**
 * @author tyz1201
 * @datetime 2020-03-11 2:13
 **/
public interface IUserDao {

    @Select("select * from user where id = #{id}")
    User findById();

    User findByUsername(String username);
}
