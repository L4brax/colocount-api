package com.hess.colocount.repository;

import com.hess.colocount.domain.Expense;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ExpenseRepository extends MongoRepository<Expense, String> {

}
