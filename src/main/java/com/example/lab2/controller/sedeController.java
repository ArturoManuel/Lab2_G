package com.example.lab2.controller;

import com.example.lab2.entity.Sedes;
import com.example.lab2.repository.SedesRepository;
import com.example.lab2.repository.TrabajadoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
@RequestMapping("")
public class sedeController {

    @Autowired
    SedesRepository sedesRepository;
    @Autowired
    TrabajadoresRepository trabajadoresRepository;

    @GetMapping(value = {"","/"})
    public String listaSede (Model model){
        model.addAttribute("listaSede",sedesRepository.findAll());
        return "sedes/list";
    }



    @GetMapping("/edit")
    public String editarSede(Model model ,@RequestParam("id") int id){
        Optional<Sedes> optionalSedes = sedesRepository.findById(id);
        if(optionalSedes.isPresent()){
            Sedes sedes = optionalSedes.get();
            model.addAttribute("sedes",sedes);
            model.addAttribute("listaTrabajadores",trabajadoresRepository.findAll());
            return "trabajadores/list" ;
        }else{
            return "redirect:/sede";
        }


    }

    @PostMapping("/save")
    public String guardarSede(Sedes sedes , RedirectAttributes att){
        sedesRepository.save(sedes);
        return "redirect:/sede";
    }

}
