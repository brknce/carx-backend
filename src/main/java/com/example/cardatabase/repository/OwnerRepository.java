package com.example.cardatabase.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cardatabase.domain.Owner;

public interface OwnerRepository extends JpaRepository<Owner, Long> {

}
