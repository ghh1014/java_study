package com.ghh.service.impl;

import com.ghh.dao.IAccountDao;
import com.ghh.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(isolation = Isolation.REPEATABLE_READ)
@Service
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDao accountDao;

    //@Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED)
    @Override
    public void transfer(String outMan, String inMan, double money) {
        accountDao.out(outMan,money);
         int i = 1/0;
        accountDao.in(inMan,money);
    }
}
