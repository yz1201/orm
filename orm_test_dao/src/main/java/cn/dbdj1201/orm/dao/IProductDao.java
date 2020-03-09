package cn.dbdj1201.orm.dao;

import cn.dbdj1201.orm.domain.Product;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author tyz1201
 * @datetime 2020-03-09 13:31
 **/
@Repository("productDao")
public interface IProductDao {

    @Select("select * from product")
    List<Product> findAll();

    @Update("insert into product (name, price) values (#{name}, #{price})")
    void save(Product product);

}
