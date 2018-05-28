package com.example.jonmid.worldcupinternet.CreateAccount.presenter;

import com.example.jonmid.worldcupinternet.CreateAccount.Model.Account;

public interface CreateAccountActivityPresenter {
    void createAccount(Account account);
    void showResult(String msg);
    void showError(String msg);
}
