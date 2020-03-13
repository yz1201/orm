package cn.dbdj1201.orm.dao;

import cn.dbdj1201.orm.domain.Role;
import cn.dbdj1201.orm.domain.SysLog;
import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author tyz1201
 * @datetime 2020-03-13 14:22
 **/
public class TestMain {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        Connection connection = DriverManager.getConnection("jdbc:mysql:///orm?serverTimezone=Asia/Shanghai", "root", "root");
//        PreparedStatement pstm = connection.prepareStatement("select id, roleDesc, roleName from role");
//        ResultSet resultSet = pstm.executeQuery();
//
//        List<Role> roles = new ArrayList<>();
//
//        while (resultSet.next()) {
//            Role role =new Role();
//            role.setId(resultSet.getInt(1));
//            role.setRoleDesc(resultSet.getString(2));
//            role.setRoleName(resultSet.getString(3));
//            roles.add(role);
//        }
//        System.out.println(roles);

        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setPassword("root");
        druidDataSource.setUsername("root");
        druidDataSource.setUrl("jdbc:mysql:///orm?useSSL=false&useUnicode=true&characterEncoding=UTF8&serverTimezone=GMT");
        druidDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        JdbcTemplate jdbcTemplate = new JdbcTemplate(druidDataSource);
        List<Role> roles = jdbcTemplate.query("select * from role", new BeanPropertyRowMapper<>(Role.class));
        System.out.println(roles);
    }
}
