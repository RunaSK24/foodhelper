package service;


import cn.edu.szu.config.SpringConfig;

import cn.edu.szu.domain.Address;
import cn.edu.szu.service.AddressService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class AddressServiceTest {
    @Autowired
    private AddressService addressService;

    @Test
    public void testGetById() {
        List<Address> addresses = addressService.findByUserId(1);
        System.out.println(addresses);
    }

    @Test
    public void testSave() {
        Address address = new Address();
        address.setAddressID(3);
        address.setUserID(1);
        address.setName("朱");
        address.setPhone("17666656466");
        address.setLocation("冬筑xxx");
        addressService.save(address);
    }

    @Test
    public void testUpdate() {

    }

    @Test
    public void testDelete() {

    }


}
