package cn.dbdj1201.orm.domain;

import java.io.Serializable;
import java.util.List;

/**
 * @author tyz1201
 * @datetime 2020-03-11 1:54
 * 权限实体类
 **/
public class Permission implements Serializable {

    private Integer id;                 //主键
    private String permissionName;      //权限名
    private String url;                 //资源路径

    private List<Role> roles;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "Permission{" +
                "id=" + id +
                ", permissionName='" + permissionName + '\'' +
                ", url='" + url + '\'' +
                ", roles=" + roles +
                '}';
    }
}
