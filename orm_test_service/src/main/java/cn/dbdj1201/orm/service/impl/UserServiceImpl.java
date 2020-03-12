package cn.dbdj1201.orm.service.impl;

import cn.dbdj1201.orm.dao.IUserDao;
import cn.dbdj1201.orm.domain.Role;
import cn.dbdj1201.orm.domain.UserInfo;
import cn.dbdj1201.orm.service.IUserService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @author tyz1201
 * @datetime 2020-03-11 11:12
 **/
@Service("userService")
@Transactional
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao iUserDao;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserInfo userInfo = null;
        try {
            userInfo = iUserDao.findByUsername(username);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //处理自己的用户对象封装成UserDetails
        assert userInfo != null;
        return new User(userInfo.getUsername(), userInfo.getPassword(),
                userInfo.getStatus() != 0, true, true,
                true, getAuthority(userInfo.getRoles()));
    }

    @Override
    public void save(UserInfo userInfo) {
        userInfo.setPassword(passwordEncoder.encode(userInfo.getPassword())); //密码加密保存
        iUserDao.save(userInfo);
    }

    @Override
    public List<UserInfo> findAll(int currentPage, int size) {
        PageHelper.startPage(currentPage, size);
        return iUserDao.findAll();
    }

    @Override
    public UserInfo findById(int id) {
        return iUserDao.findUserById(id);
    }

    @Override
    public List<Role> findOtherRoles(int userId) {
        return iUserDao.findRolesNotInThisUser(userId);
    }

    @Override
    public void addRoleToUser(int userId, int... ids) {
        IntStream.of(ids).forEach(rid -> iUserDao.addRoleToUser(userId, rid));
    }

    //作用就是返回一个List集合，集合中装入的是角色描述
    public List<SimpleGrantedAuthority> getAuthority(List<Role> roles) {
        List<SimpleGrantedAuthority> list = new ArrayList<>();
        for (Role role : roles) {
            list.add(new SimpleGrantedAuthority("ROLE_" + role.getRoleName()));
        }
        return list;
    }
}
