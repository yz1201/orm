package cn.dbdj1201.orm.dao;

import cn.dbdj1201.orm.domain.Traveller;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author tyz1201
 * @datetime 2020-03-10 23:54
 **/
public interface ITravellerDao {

    @Select("select * from traveller where id in (select tid from orders_traveller where oid = #{id})")
    List<Traveller> findByTid(int id);
}
