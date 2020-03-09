package cn.dbdj1201.orm.domain;

import java.io.Serializable;

/**
 * @author tyz1201
 * @datetime 2020-03-09 13:32
 **/
public class Product implements Serializable {
    private Integer id;
    private String name;
    private double price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
