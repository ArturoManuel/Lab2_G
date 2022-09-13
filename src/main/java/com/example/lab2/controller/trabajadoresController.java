package com.example.lab2.controller;


import com.example.lab2.entity.Trabajadores;
import com.example.lab2.repository.TrabajadoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import java.util.List;


@Controller
@RequestMapping("/trabajadores")
public class trabajadoresController {

    @Autowired
    TrabajadoresRepository trabajadoresRepository;


    //lista de trabajadores :
    @GetMapping(value = {"/list"})
    public String listarTransportistas(Model model){
        model.addAttribute("listaTrabajadores",trabajadoresRepository.findAll());
        return "trabajadores/list";
    }



}
