package cn.dbdj1201.orm.dao;

import cn.dbdj1201.orm.domain.Role;
import org.apache.ibatis.annotations.Select;

/**
 * @author tyz1201
 * @datetime 2020-03-11 11:50
 **/
public interface IRoleDao {

    @Select("select * from role where id in (select rid from users_role where uid = #{uid})")
    Role findRoleByUid(int uid);
}
