package cn.edu.szu.dao;

import cn.edu.szu.domain.Account;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface AccountDao {
    @Insert("insert into users(userID, openid, name, phone, sex, createTime, avatar) " +
            "values(#{userID},#{openid},#{name},#{phone},#{sex},#{createTime},#{avatar})")
    void save(Account account);

    @Select("select * from users where userID = #{userID} ")
    Account findById(Integer id);

    @Delete("delete from users where userID = #{userID} ")
    void delete(Integer id);

    @Update("update users set name = #{name} , phone = #{phone}, sex = #{sex}, avatar = #{avatar} where userID = #{userID} ")
    void update(Account account);
}
