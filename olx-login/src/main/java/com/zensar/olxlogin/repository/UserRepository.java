package com.zensar.olxlogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.olxlogin.entity.RegisterUser;

@Repository
public interface UserRepository extends JpaRepository<RegisterUser, Integer> {

}
