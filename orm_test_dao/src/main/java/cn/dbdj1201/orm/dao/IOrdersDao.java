package cn.dbdj1201.orm.dao;

import cn.dbdj1201.orm.domain.Orders;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author tyz1201
 * @datetime 2020-03-10 18:35
 **/
@Repository
public interface IOrdersDao {

    @Select("select * from orders")
    List<Orders> findAll();

    @Update("insert into orders(orderNum, orderTime, peopleCount, orderDesc, payType, orderStatus, pro)")
    void save(Orders orders);


}
