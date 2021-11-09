package br.ufrpe.dc.banking.model;

import br.ufrpe.dc.banking.model.account.Account;
import br.ufrpe.dc.banking.model.account.AccountController;
import br.ufrpe.dc.banking.model.account.AccountDTO;
import br.ufrpe.dc.banking.model.transaction.NotEnoughBalanceException;
import br.ufrpe.dc.banking.model.transaction.Transaction;
import br.ufrpe.dc.banking.model.transaction.TransactionController;
import br.ufrpe.dc.banking.model.transaction.TransactionDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Facade {

    @Autowired private AccountController accountController;
    @Autowired private TransactionController transactionController;

    public Iterable<Transaction> getTransactionsFrom(Long accountId) {
        return transactionController.getAllFrom(accountId);
    }

    public void doTransaction(TransactionDTO transactionDTO) throws NotEnoughBalanceException {
        transactionController.doTransaction(transactionDTO);
    }

    public void createAccount(AccountDTO accountDTO) {
        accountController.create(accountDTO);
    }

    public Iterable<Account> getAccounts() {
        return accountController.getAll();
    }
}
