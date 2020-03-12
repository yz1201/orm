package cn.dbdj1201.orm.domain;

import cn.dbdj1201.orm.utils.DateUtils;

import java.io.Serializable;
import java.util.Date;

/**
 * @author tyz1201
 * @datetime 2020-03-12 17:31
 **/
public class SysLog implements Serializable {
    private String id;
    private Date visitTime;
    private String username;
    private String ip;
    private String url;
    private Long executionTime;
    private String method;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getVisitTime() {
        return visitTime;
    }

    public void setVisitTime(Date visitTime) {
        this.visitTime = visitTime;
    }

    public String getVisitTimeStr() {
        return visitTime == null ? "坏了" : DateUtils.date2String(visitTime, "yyyy-MM-dd HH:mm:ss");
    }

//    public void setVisitTimeStr(String visitTimeStr) {
//
//    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getExecutionTime() {
        return executionTime;
    }

    public void setExecutionTime(Long executionTime) {
        this.executionTime = executionTime;
    }

    public String getExecutionTimeStr() {
        return executionTime + "";
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }


    @Override
    public String toString() {
        return "SysLog{" +
                "id='" + id + '\'' +
                ", visitTime=" + visitTime +
                ", username='" + username + '\'' +
                ", ip='" + ip + '\'' +
                ", url='" + url + '\'' +
                ", executionTime=" + executionTime +
                ", method='" + method + '\'' +
                '}';
    }
}
