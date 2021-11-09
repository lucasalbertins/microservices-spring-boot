package br.ufrpe.dc.qualiti.banking.model.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountController {

    @Autowired private AccountCollection accountCollection;

    public void create(AccountDTO accountDTO) {
        accountCollection.insert(accountDTO.toEntity());
    }

    public Iterable<Account> getAll() {
        return accountCollection.getAll();
    }

    public boolean enoughBalance(Long accountId, Long valueToBeDeducted) {
        return accountCollection.enoughBalance(accountId, valueToBeDeducted);
    }

    public void updateBalance(Long accountId, Long valueToBeAppended) {
        accountCollection.updateBalance(accountId, valueToBeAppended);
    }
}
