package cn.dbdj1201.orm.service.impl;

import cn.dbdj1201.orm.dao.IProductDao;
import cn.dbdj1201.orm.domain.Product;
import cn.dbdj1201.orm.service.IProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author tyz1201
 * @datetime 2020-03-09 14:08
 **/
@Service("productService")
public class IProductServiceImpl implements IProductService {

    @Resource(name = "productDao")
    private IProductDao productDao;

    @Override
    public List<Product> findAll() {

        return productDao.findAll();
    }

    @Override
    public void save(Product product) {
        productDao.save(product);
    }
}
