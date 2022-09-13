package com.example.lab2.repository;

import com.example.lab2.entity.Marcas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarcasRepository extends JpaRepository<Marcas, Integer> {
}