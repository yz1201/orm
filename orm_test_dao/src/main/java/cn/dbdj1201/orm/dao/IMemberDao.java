package cn.dbdj1201.orm.dao;

import cn.dbdj1201.orm.domain.Member;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author tyz1201
 * @datetime 2020-03-10 23:54
 **/
public interface IMemberDao {

    /**
     * 查询全部会员
     *
     * @return
     */
    @Select("select * from member")
    List<Member> findAll();

    /**
     * 新增会员
     *
     * @param member
     */
    @Update("insert into member (name, nickName, phoneNum, email) values (#{name}, #{nickName}, #{phoneNum}, #{email})")
    void save(Member member);

    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    @Select("select * from member where id = #{id}")
    Member findById(int id);
}
