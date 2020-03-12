package cn.dbdj1201.orm.dao;

import cn.dbdj1201.orm.domain.SysLog;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author tyz1201
 * @datetime 2020-03-12 18:46
 **/
public interface ISysLogDao {
    /**
     * @return
     */
    @Select("select * from sysLog")
    List<SysLog> findAll();

    /**
     * @param sysLog
     */
    @Insert("insert into syslog(visitTime,username,ip,url,executionTime,method) values(#{visitTime},#{username},#{ip},#{url}," +
            "#{executionTime},#{method})")
    void save(SysLog sysLog);
}
