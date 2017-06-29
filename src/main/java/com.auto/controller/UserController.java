package com.auto.controller;

import com.auto.domain.User;
import com.auto.service.impl.UserDaoImpl;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by sky on 17-6-28.
 */
@Controller
public class UserController {
    private Logger log = Logger.getLogger(this.getClass().getName());

    @Autowired
    private UserDaoImpl userDao;


    @RequestMapping(value = "/query", method = {RequestMethod.GET, RequestMethod.POST})
    public void test() {
        User u = userDao.findUserById(1);
        System.out.println(u);
    }

}
