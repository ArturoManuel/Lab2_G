package com.example.lab2.repository;

import com.example.lab2.entity.Sedes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SedesRepository extends JpaRepository<Sedes, Integer> {
}