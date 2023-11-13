package service;


import cn.edu.szu.config.SpringConfig;
import cn.edu.szu.domain.Account;
import cn.edu.szu.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class AccountServiceTest {
    @Autowired
    private AccountService accountService;

    @Test
    public void testGetById(){
        Account account = accountService.findById(6);
        System.out.println(account);
    }

    @Test
    public void testSave(){
        Account account = new Account();
        account.setUserID(6);
        account.setOpenid("openid11");
        account.setName("LucyTest");
        account.setPhone("5555555555");
        account.setSex("F");
        account.setCreateTime(new Date());
        account.setAvatar(11);
        accountService.save(account);
    }
    @Test
    public void testUpdate(){//只修改姓名
        Account account = new Account();
        account.setUserID(6);
        account.setOpenid("openid11");
        account.setName("AnnaTest");
        account.setPhone("5555555555");
        account.setSex("F");
        account.setCreateTime(new Date());
        account.setAvatar(6);
        accountService.update(account);
    }
    @Test
    public void testDelete(){
        accountService.delete(6);
    }

}
