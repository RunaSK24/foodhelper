package cn.edu.szu.dao;

import cn.edu.szu.domain.Order;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface OrderDao {
    @Insert("INSERT INTO orders (orderId,userId, pickupAddress, name, phone, " +
            "address, orderDetails, price, status, orderTime, driverID, deliveryTime)\n" +
            "VALUES\n" +
            "  (#{orderId},#{userId},#{pickupAddress},#{name},#{phone},#{address}," +
            "#{orderDetails},#{price},#{status},#{orderTime}," +
            "#{driverId},#{deliveryTime})")
    void save(Order account);

    @Select("select * from orders where userID = #{id}")
    Order findByUserId(Integer id);

    @Delete("delete from orders where orderID = #{id}")
    void delete(Integer id);

    @Update("UPDATE orders SET userID = #{userId}, pickupAddress = #{pickupAddress}, name= #{name}, phone = #{phone},address = #{address}, orderDetails=#{orderDetails}, price=#{price}, status=#{status}, orderTime=#{orderTime}, driverID=#{driverId}, deliveryTime=#{deliveryTime} where orderId = #{orderId}")
    void update(Order account);


}
