package com.example.mproject.expense.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mproject.expense.model.Category;

public interface CategoryRepository  extends JpaRepository<Category, Long>{
	Category findByName(String name);
}