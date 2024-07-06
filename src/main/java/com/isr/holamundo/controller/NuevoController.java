package com.isr.holamundo.controller;


import com.isr.holamundo.entity.EstudianteEntity;
import com.isr.holamundo.model.Estudiante;
import com.isr.holamundo.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class NuevoController {

    @Autowired
    private EstudianteRepository estudianteRepository;

    @GetMapping("/registro")
    public String formulario(){

        return "form";
    }
    @PostMapping("/guardado")
    public  String success(@ModelAttribute Estudiante request){
        System.out.println(request);

        EstudianteEntity estudiante = new EstudianteEntity();
        estudiante.setNombre(request.getName());
        estudiante.setApellido(request.getLastName());
        estudianteRepository.save(estudiante);




        return "success";
    }


}
