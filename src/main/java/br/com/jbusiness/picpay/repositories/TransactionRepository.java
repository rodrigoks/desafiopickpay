package br.com.jbusiness.picpay.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jbusiness.picpay.domain.transaction.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

}
