package cn.edu.szu.controller;

import cn.edu.szu.domain.Address;
import cn.edu.szu.service.impl.AddressServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    AddressServiceImpl addressService;

    @GetMapping
    public List<Address> getByAddressId(Integer id) {
        return addressService.findByUserId(id);
    }

    @PostMapping
    public String saveAddress(Address address) {
        addressService.save(address);
        return "Address Save";
    }

    @PutMapping
    public String updateAddress(Address address) {
        addressService.update(address);
        System.out.println(address);
        return "Address Update";
    }

    @DeleteMapping
    public String deleteAddress(Integer id) {
        addressService.delete(id);
        return "Address Delete";
    }
}
