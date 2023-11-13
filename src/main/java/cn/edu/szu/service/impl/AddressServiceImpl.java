package cn.edu.szu.service.impl;

import cn.edu.szu.service.AddressService;
import cn.edu.szu.dao.AddressDao;
import cn.edu.szu.domain.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressDao addressDao;

    @Override
    public void save(Address address) {
        addressDao.save(address);
    }

    @Override
    public void delete(Integer id) {
        addressDao.delete(id);
    }

    @Override
    public void update(Address address) {
        addressDao.update(address);
    }

    @Override
    public List<Address> findByUserId(Integer id) {
        return addressDao.findByUserId(id);
    }
}
