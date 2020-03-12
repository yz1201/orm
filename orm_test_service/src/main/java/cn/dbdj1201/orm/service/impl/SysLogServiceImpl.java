package cn.dbdj1201.orm.service.impl;

import cn.dbdj1201.orm.dao.ISysLogDao;
import cn.dbdj1201.orm.domain.SysLog;
import cn.dbdj1201.orm.service.ISysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author tyz1201
 * @datetime 2020-03-12 18:45
 **/
@Service
@Transactional
public class SysLogServiceImpl implements ISysLogService {

    @Autowired
    private ISysLogDao sysLogDao;

    @Override
    public List<SysLog> findAll() {
        return sysLogDao.findAll();
    }

    @Override
    public void save(SysLog sysLog) {
        sysLogDao.save(sysLog);
    }
}
