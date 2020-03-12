package cn.dbdj1201.orm.service;

import cn.dbdj1201.orm.domain.Role;
import cn.dbdj1201.orm.domain.UserInfo;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

/**
 * @author tyz1201
 * @datetime 2020-03-11 11:12
 **/
public interface IUserService extends UserDetailsService {

    /**
     * @param user
     */
    void save(UserInfo user);

    /**
     * @param currentPage
     * @param size
     * @return
     */
    List<UserInfo> findAll(int currentPage, int size);

    /**
     * @param id
     * @return
     */
    UserInfo findById(int id);

    List<Role> findOtherRoles(int userId);

    /**
     * @param userId
     * @param ids
     */
    void addRoleToUser(int userId, Integer[] ids);
}
