package cn.dbdj1201.orm.dao;

import cn.dbdj1201.orm.domain.Member;
import cn.dbdj1201.orm.domain.Orders;
import cn.dbdj1201.orm.domain.Product;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

/**
 * @author tyz1201
 * @datetime 2020-03-10 18:35
 **/
public interface IOrdersDao {

    /**
     * 查询全部
     *
     * @return
     */
    @Select("select * from orders")
    @Results({
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "orderNum", column = "orderNum"),
            @Result(property = "orderTime", column = "orderTime"),
            @Result(property = "orderStatus", column = "orderStatus"),
            @Result(property = "peopleCount", column = "peopleCount"),
            @Result(property = "peopleCount", column = "peopleCount"),
            @Result(property = "payType", column = "payType"),
            @Result(property = "orderDesc", column = "orderDesc"),
            @Result(property = "product", column = "productId", javaType = Product.class,
                    one = @One(select = "cn.dbdj1201.orm.dao.IProductDao.findById", fetchType = FetchType.EAGER)),
            @Result(property = "member", column = "memberId", javaType = Member.class,
                    one = @One(select = "cn.dbdj1201.orm.dao.IMemberDao.findById", fetchType = FetchType.EAGER)),
            @Result(property = "travellers", column = "id", many = @Many(select = "cn.dbdj1201.orm.dao.ITravellerDao.findByTid",
                    fetchType = FetchType.LAZY))
    })
    List<Orders> findAll();

    /**
     * 新增订单
     *
     * @param orders
     */
    @Update("insert into orders(orderNum, orderTime, peopleCount, orderDesc, payType, orderStatus, pro)")
    void save(Orders orders);

    /**
     * id query
     *
     * @param id
     * @return
     */
    @Select("select * from orders where id = #{id}")
    @Results({
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "orderNum", column = "orderNum"),
            @Result(property = "orderTime", column = "orderTime"),
            @Result(property = "orderStatus", column = "orderStatus"),
            @Result(property = "peopleCount", column = "peopleCount"),
            @Result(property = "peopleCount", column = "peopleCount"),
            @Result(property = "payType", column = "payType"),
            @Result(property = "orderDesc", column = "orderDesc"),
            @Result(property = "product", column = "productId", javaType = Product.class,
                    one = @One(select = "cn.dbdj1201.orm.dao.IProductDao.findById", fetchType = FetchType.EAGER)),
            @Result(property = "member", column = "memberId", javaType = Member.class,
                    one = @One(select = "cn.dbdj1201.orm.dao.IMemberDao.findById", fetchType = FetchType.EAGER)),
            @Result(property = "travellers", column = "id", many = @Many(select = "cn.dbdj1201.orm.dao.ITravellerDao.findByTid",
                    fetchType = FetchType.LAZY))
    })
    Orders findById(int id);

}
