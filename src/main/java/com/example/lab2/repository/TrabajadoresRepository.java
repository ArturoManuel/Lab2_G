package com.example.lab2.repository;

import com.example.lab2.entity.Trabajadores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrabajadoresRepository extends JpaRepository<Trabajadores, String> {




}