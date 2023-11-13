package cn.edu.szu.controller;

import cn.edu.szu.domain.Account;
import cn.edu.szu.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accounts")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @GetMapping
    public Account getByOrdersId(Integer id){
        return accountService.findById(id);
    }

    @PostMapping
    public String saveOrder(Account account){
        accountService.save(account);
        return "Account Save";
    }

    @PutMapping
    public String updateOrder(Account account){
        accountService.update(account);
        return "Account Update";
    }

    @DeleteMapping
    public String deleteOrder(Integer id){
        accountService.delete(id);
        return "Account Delete";
    }

}
