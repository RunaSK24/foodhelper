package cn.edu.szu.dao;

import cn.edu.szu.domain.Address;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface AddressDao {
    @Insert("insert into address_book(addressID, userID, name, phone, location) values(#{id},#{userID},#{name},#{phone},#{location})")
    void save(Address address);

    @Delete("delete from address_book where addressID = #{id} ")
    void delete(Integer id);

    @Update("update address_book set name = #{name} , phone = #{phone}, location = #{location} where addressID = #{id} ")
    void update(Address address);

    @Select("select * from address_book where userID = #{userID} ")
    List<Address> findByUserId(Integer userID);
}
