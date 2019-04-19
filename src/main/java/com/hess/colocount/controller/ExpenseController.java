package com.hess.colocount.controller;

import com.hess.colocount.domain.Expense;
import com.hess.colocount.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ExpenseController {

    @Autowired
    ExpenseRepository expenseRepository;

    @RequestMapping(value = "/expenses", method = RequestMethod.GET)
    public List<Expense> getUsers() {
        return expenseRepository.findAll();
    }

    @RequestMapping(value = "/expenses", method = RequestMethod.PUT)
    public Expense createUser(@RequestBody Expense expense) { return expenseRepository.save(expense); }

    @RequestMapping(value = "/expenses/{id}", method = RequestMethod.POST)
    public Expense updateUser(@PathVariable String id, @RequestBody Expense expense) {
        Expense finalExpense = expense;
        finalExpense.setId(id);
        return expenseRepository.save(finalExpense);
    }
}
