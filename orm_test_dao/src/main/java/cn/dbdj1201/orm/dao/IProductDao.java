package cn.dbdj1201.orm.dao;

import cn.dbdj1201.orm.domain.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author tyz1201
 * @datetime 2020-03-09 13:31
 **/
public interface IProductDao {

    @Select("select * from product")
    List<Product> findAll();

    @Select("select * from product where id = #{id}")
    Product findById(int id);

    @Insert("insert into product(productNum,productName,cityName,departureTime,productPrice," +
            "productDesc,productStatus) values(#{productNum},#{productName},#{cityName}," +
            "#{departureTime},#{productPrice},#{productDesc},#{productStatus})")
    void save(Product product);


}
