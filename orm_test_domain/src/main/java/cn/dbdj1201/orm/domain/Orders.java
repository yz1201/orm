package cn.dbdj1201.orm.domain;

import cn.dbdj1201.orm.utils.DateUtils;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author tyz1201
 * @datetime 2020-03-10 14:23
 * 订单实体类
 **/
public class Orders implements Serializable {
    private Integer id;                             //主键
    private String orderNum;                        //订单编号 不为空 唯一
    private Date orderTime;                         // 下单时间
    private String orderTimeStr;
    private Integer peopleCount;                    //出行人数
    private String orderDesc;                       //订单描述(其它信息)
    private Integer payType;                        //支付方式(0 支付宝 1 微信 2其它)
    private String payTypeStr;
    private Integer orderStatus;                    //订单状态(0 未支付 1 已支付)
    private String orderStatusStr;
    private Product product;                        //o2o 订单对应产品
    private Member member;                          //o2o 订单对应会员
    private List<Traveller> travellers;             //N2N 订单对应旅行者。

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Integer getPeopleCount() {
        return peopleCount;
    }

    public void setPeopleCount(Integer peopleCount) {
        this.peopleCount = peopleCount;
    }

    public String getOrderDesc() {
        return orderDesc;
    }

    public void setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderTimeStr() {
        if (orderTime != null) {
            orderTimeStr = DateUtils.date2String(orderTime, "yyyy-MM-dd HH:mm");
        }
        return orderTimeStr;
    }

    public void setOrderTimeStr(String orderTimeStr) {
        this.orderTimeStr = orderTimeStr;
    }

    public String getPayTypeStr() {
        //支付方式(0 支付宝 1 微信 2其它)
        if (payType == 0) {
            payTypeStr = "支付宝";
        } else if (payType == 1) {
            payTypeStr = "微信";
        } else if (payType == 2) {
            payTypeStr = "其它";
        }
        return payTypeStr;
    }

    public void setPayTypeStr(String payTypeStr) {
        this.payTypeStr = payTypeStr;
    }

    public String getOrderStatusStr() {
        //订单状态(0 未支付 1 已支付)
        if (orderStatus == 0) {
            orderStatusStr = "未支付";
        } else if (orderStatus == 1) {
            orderStatusStr = "已支付";
        }
        return orderStatusStr;
    }

    public void setOrderStatusStr(String orderStatusStr) {
        this.orderStatusStr = orderStatusStr;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public List<Traveller> getTravellers() {
        return travellers;
    }

    public void setTravellers(List<Traveller> travellers) {
        this.travellers = travellers;
    }
}
