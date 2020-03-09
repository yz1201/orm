package cn.dbdj1201.orm.service;

import cn.dbdj1201.orm.domain.Product;

import java.util.List;

/**
 * @author tyz1201
 * @datetime 2020-03-09 14:07
 **/
public interface IProductService {

    List<Product> findAll();

    void save(Product product);

}
