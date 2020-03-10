package cn.dbdj1201.orm.domain;

import java.io.Serializable;
import java.util.List;

/**
 * @author tyz1201
 * @datetime 2020-03-10 17:46
 * 会员实体类
 **/
public class Member implements Serializable {
    private Integer id;
    private String name;
    private String nickName;
    private String phoneNum;
    private String email;
    private List<Orders> orders;

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

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Orders> getOrders() {
        return orders;
    }

    public void setOrders(List<Orders> orders) {
        this.orders = orders;
    }
}
