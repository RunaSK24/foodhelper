package cn.edu.szu.service;

import cn.edu.szu.domain.Address;

import java.util.List;

public interface AddressService {
    void save(Address address);

    void delete(Integer id);

    void update(Address address);

    List<Address> findByUserId(Integer id);
}
