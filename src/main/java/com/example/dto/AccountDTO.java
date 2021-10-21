package com.example.dto;

import com.example.model.Account;

public class AccountDTO {

    public Account accountDTO(Account account) {

        Account accountDTO = new Account();

        accountDTO.setId(account.getId());
        accountDTO.setUser(account.getUser());
        accountDTO.setPassword(account.getPassword());
        accountDTO.setIsAdmin(account.getIsAdmin());
        accountDTO.setIsSell(account.getIsSell());

        return accountDTO;

    }

}
