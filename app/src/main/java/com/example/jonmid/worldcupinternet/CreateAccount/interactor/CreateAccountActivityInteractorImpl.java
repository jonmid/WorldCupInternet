package com.example.jonmid.worldcupinternet.CreateAccount.interactor;

import com.example.jonmid.worldcupinternet.CreateAccount.Model.Account;
import com.example.jonmid.worldcupinternet.CreateAccount.presenter.CreateAccountActivityPresenter;
import com.example.jonmid.worldcupinternet.CreateAccount.repository.CreateAccountActivityRepository;
import com.example.jonmid.worldcupinternet.CreateAccount.repository.CreateAccountActivityRepositoryImpl;

public class CreateAccountActivityInteractorImpl implements CreateAccountActivityInteractor {

    private CreateAccountActivityPresenter createAccountActivityPresenter;
    private CreateAccountActivityRepository createAccountActivityRepository;

    public CreateAccountActivityInteractorImpl(CreateAccountActivityPresenter createAccountActivityPresenter) {
        this.createAccountActivityPresenter = createAccountActivityPresenter;
        createAccountActivityRepository = new CreateAccountActivityRepositoryImpl(this);
    }

    @Override
    public void createAccount(Account account) {
        // Validar si los datos estan llenos
        createAccountActivityRepository.createAccount(account);
    }

    @Override
    public void showResult(String msg) {
        createAccountActivityPresenter.showResult(msg);
    }

    @Override
    public void showError(String msg) {
        createAccountActivityPresenter.showError(msg);
    }
}
