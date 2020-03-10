package cn.dbdj1201.orm.service;

import cn.dbdj1201.orm.domain.Orders;

import java.util.List;

/**
 * @author tyz1201
 * @datetime 2020-03-10 22:18
 * 订单业务层
 **/
public interface IOrdersService {

    /**
     * 分页查询
     *
     * @param currentPage
     * @param size
     * @return
     */
    List<Orders> findAll(int currentPage, int size);

    Orders findById(int id);
}
