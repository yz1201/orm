package cn.dbdj1201.orm.domain;

import java.io.Serializable;
import java.util.List;

/**
 * @author tyz1201
 * @datetime 2020-03-10 23:54
 * 角色实体类
 **/
public class Role implements Serializable {
    private Integer id;             //主键
    private String roleName;        //角色名
    private String roleDesc;        // 角色描述
    private List<User> users;
    private List<Permission> permissions;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", roleName='" + roleName + '\'' +
                ", roleDesc='" + roleDesc + '\'' +
                ", users=" + users +
                ", permissions=" + permissions +
                '}';
    }
}
