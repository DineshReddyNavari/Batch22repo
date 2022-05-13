package com.zensar.olxmaster.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.olxmaster.entity.Status;


public interface StatusRepository extends JpaRepository<Status,Long> {

}
