package cn.dbdj1201.orm.service;

import cn.dbdj1201.orm.domain.UserInfo;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

/**
 * @author tyz1201
 * @datetime 2020-03-11 11:12
 **/
public interface IUserService extends UserDetailsService {

    void save(UserInfo user);

    List<UserInfo> findAll(int currentPage, int size);

    UserInfo findById(int id);

}
