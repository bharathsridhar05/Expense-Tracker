package com.example.mproject.expense.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.mproject.expense.model.Expense;

public interface ExpenseRepository extends JpaRepository<Expense,Long> {
	
}