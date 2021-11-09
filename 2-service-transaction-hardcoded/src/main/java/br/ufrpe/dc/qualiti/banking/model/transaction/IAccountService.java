package br.ufrpe.dc.qualiti.banking.model.transaction;

public interface IAccountService {

    boolean enoughBalance(Long accountId, Long valueToBeDecreased);

    void updateBalance(Long accountId, Long valueToBeAppended);
}
