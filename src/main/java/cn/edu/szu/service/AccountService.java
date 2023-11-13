package cn.edu.szu.service;

import cn.edu.szu.domain.Account;

public interface AccountService {
    void save(Account account);

    Account findById(Integer id);

    void delete(Integer id);

    void update(Account account);

}
