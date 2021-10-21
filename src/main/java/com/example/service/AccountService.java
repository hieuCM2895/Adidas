package com.example.service;

import com.example.dao.AccountDAOImpl;
import com.example.dto.AccountDTO;
import com.example.model.Account;

public class AccountService {

    private AccountDAOImpl accountDAO = new AccountDAOImpl();
    private AccountDTO accountDTO = new AccountDTO();

    public Account loginByUserAndPassword(String userName, String pass) {
        return accountDAO.loginByUserAndPassword(userName, pass);
    }

    public boolean checkUserExits(String userName) {
        return accountDAO.checkUserExits(userName);
    }

    public boolean addNewAccount(String userName, String password) {

        Account account = new Account();
        account.setUser(userName);
        account.setPassword(password);
        return accountDAO.save(account);
    }
}
