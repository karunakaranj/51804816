package com.oxbank.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.oxbank.entity.Transaction;

public interface TransactionRepo extends JpaRepository<Transaction,Integer> {

}
