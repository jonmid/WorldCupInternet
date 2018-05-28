package com.example.jonmid.worldcupinternet.CreateAccount.interactor;

import com.example.jonmid.worldcupinternet.CreateAccount.Model.Account;

public interface CreateAccountActivityInteractor {
    void createAccount(Account account);
    void showResult(String msg);
    void showError(String msg);
}
