package com.example.jonmid.worldcupinternet.CreateAccount.presenter;

import com.example.jonmid.worldcupinternet.CreateAccount.Model.Account;
import com.example.jonmid.worldcupinternet.CreateAccount.interactor.CreateAccountActivityInteractor;
import com.example.jonmid.worldcupinternet.CreateAccount.interactor.CreateAccountActivityInteractorImpl;
import com.example.jonmid.worldcupinternet.CreateAccount.view.CreateAccountActivityView;

public class CreateAccountActivityPresenterImpl implements CreateAccountActivityPresenter {

    private CreateAccountActivityView createAccountActivityView;
    private CreateAccountActivityInteractor createAccountActivityInteractor;

    public CreateAccountActivityPresenterImpl(CreateAccountActivityView createAccountActivityView) {
        this.createAccountActivityView = createAccountActivityView;
        createAccountActivityInteractor = new CreateAccountActivityInteractorImpl(this);
    }

    @Override
    public void createAccount(Account account) {
        createAccountActivityInteractor.createAccount(account);
    }

    @Override
    public void showResult(String msg) {
        createAccountActivityView.showResult(msg);
    }

    @Override
    public void showError(String msg) {
        createAccountActivityView.showError(msg);
    }
}
