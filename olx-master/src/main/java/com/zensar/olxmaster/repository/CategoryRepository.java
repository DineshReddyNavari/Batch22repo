package com.zensar.olxmaster.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.olxmaster.entity.Category;


public interface CategoryRepository extends JpaRepository<Category, Long>{

}
