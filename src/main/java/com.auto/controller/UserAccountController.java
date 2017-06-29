package com.auto.controller;

import com.auto.mapper.BaseSqlMapper;
import com.auto.pojo.UserAccount;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by sky on 17-6-28.
 */
@Controller
public class UserAccountController {
    private Logger log = Logger.getLogger(this.getClass().getName());

    @Autowired
    @Qualifier("baseSqlMapper")
    private BaseSqlMapper<UserAccount> userAccountBaseSqlMapper;


    @RequestMapping(value = "/query.do", method = {RequestMethod.GET, RequestMethod.POST})
    public void test() {
        UserAccount u = userAccountBaseSqlMapper.get(1);
        System.out.println(u);
    }

    @RequestMapping(value = "/insert.do", method = {RequestMethod.GET, RequestMethod.POST})
    public void insert() {
        UserAccount userAccount = new UserAccount();
        userAccount.setId(1);
        userAccount.setName("wang");
        userAccount.setSex(1);
        int u = userAccountBaseSqlMapper.add(userAccount);
        System.out.println(u);
    }
}
