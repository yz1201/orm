package cn.dbdj1201.orm.service;

import cn.dbdj1201.orm.domain.SysLog;

import java.util.List;

/**
 * @author tyz1201
 * @datetime 2020-03-12 18:42
 **/
public interface ISysLogService {

    /**
     * @return
     */
    List<SysLog> findAll();

    /**
     * @param sysLog
     */
    void save(SysLog sysLog);

}
