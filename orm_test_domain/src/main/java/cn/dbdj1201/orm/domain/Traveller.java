package cn.dbdj1201.orm.domain;

import java.io.Serializable;
import java.util.List;

/**
 * @author tyz1201
 * @datetime 2020-03-10 17:47
 **/
public class Traveller implements Serializable {
    private Integer id;                     //
    private String name;                    //姓名
    private String sex;                     //性别
    private String phoneNum;                //电话号码
    private Integer credentialsType;        //证件类型 0身份证 1护照 2军官证
    private String credentialsTypeStr;
    private String credentialsNum;          //证件号码
    private Integer travellerType;          //旅客类型(人群) 0 成人 1 儿童
    private String travellerTypeStr;
    private List<Orders> orders;             //n2n 订单信息。

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public Integer getCredentialsType() {
        return credentialsType;
    }

    public void setCredentialsType(Integer credentialsType) {
        this.credentialsType = credentialsType;
    }

    public String getCredentialsNum() {
        return credentialsNum;
    }

    public void setCredentialsNum(String credentialsNum) {
        this.credentialsNum = credentialsNum;
    }

    public Integer getTravellerType() {
        return travellerType;
    }

    public void setTravellerType(Integer travellerType) {
        this.travellerType = travellerType;
    }

    public String getCredentialsTypeStr() {
        if (credentialsType == 0)
            credentialsTypeStr = "身份证";
        else if (credentialsType == 1)
            credentialsTypeStr = "护照";
        else
            credentialsTypeStr = "军官证";
        return credentialsTypeStr;
    }

    public void setCredentialsTypeStr(String credentialsTypeStr) {
        this.credentialsTypeStr = credentialsTypeStr;
    }

    public String getTravellerTypeStr() {
        if (travellerType == 0)
            travellerTypeStr = "成人";
        else
            travellerTypeStr = "儿童";
        return travellerTypeStr;
    }

    public void setTravellerTypeStr(String travellerTypeStr) {
        this.travellerTypeStr = travellerTypeStr;
    }

    public List<Orders> getOrders() {
        return orders;
    }

    public void setOrders(List<Orders> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Traveller{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", credentialsType=" + credentialsType +
                ", credentialsTypeStr='" + getCredentialsTypeStr() + '\'' +
                ", credentialsNum='" + credentialsNum + '\'' +
                ", travellerType=" + travellerType +
                ", travellerTypeStr='" + getTravellerTypeStr() + '\'' +
                '}';
    }
}
