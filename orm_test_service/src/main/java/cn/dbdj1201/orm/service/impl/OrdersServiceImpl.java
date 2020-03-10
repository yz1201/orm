package cn.dbdj1201.orm.service.impl;

import cn.dbdj1201.orm.dao.IOrdersDao;
import cn.dbdj1201.orm.domain.Orders;
import cn.dbdj1201.orm.service.IOrdersService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author tyz1201
 * @datetime 2020-03-10 22:22
 **/
@Service
@Transactional
public class OrdersServiceImpl implements IOrdersService {

    @Autowired
    private IOrdersDao ordersDao;

    @Override
    public List<Orders> findAll(int currentPage, int size) {
        PageHelper.startPage(currentPage, size);
        List<Orders> orders = ordersDao.findAll();
        return orders;
    }

    @Override
    public Orders findById(int id) {
        return ordersDao.findById(id);
    }
}
