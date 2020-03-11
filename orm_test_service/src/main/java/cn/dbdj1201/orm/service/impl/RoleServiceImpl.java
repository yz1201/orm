package cn.dbdj1201.orm.service.impl;

import cn.dbdj1201.orm.dao.IRoleDao;
import cn.dbdj1201.orm.domain.Role;
import cn.dbdj1201.orm.service.IRoleService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author tyz1201
 * @datetime 2020-03-11 16:43
 **/
@Service
@Transactional
public class RoleServiceImpl implements IRoleService {

    @Autowired
    private IRoleDao roleDao;

    @Override
    public List<Role> findAll(int currentPage, int size) {
        PageHelper.startPage(currentPage, size);
        return roleDao.findAll();
    }

    @Override
    public Role findById(int id) {
        return roleDao.findById(id);
    }

    @Override
    public void save(Role role) {
        roleDao.save(role);
    }
}
