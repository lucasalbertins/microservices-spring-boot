package br.ufrpe.dc.banking.model.account;

import org.springframework.data.repository.CrudRepository;

public interface AccountDAO extends CrudRepository<Account, Long> {}
