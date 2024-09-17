package aapr.consultorio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;


import aapr.consultorio.model.Consultorio;
import aapr.consultorio.service.ConsultorioService;

@RestController
@RequestMapping("/consultorio/registros")
public class ConsultorioController {
private ConsultorioService consultorioService;

@Autowired
public ConsultorioController(ConsultorioService consultorioService) {
	super();
	this.consultorioService = consultorioService;
}

@GetMapping("/kosmos")
public List<Consultorio> getMappingAll(){
	return consultorioService.getAll();
}

@PostMapping
public Consultorio newCita(@RequestBody Consultorio cita) {
	return consultorioService.createCita(cita);
}

@DeleteMapping("/kosmos/{id}")
public void deleteCita(@PathVariable(name="id") Long id) {
	consultorioService.deleteCita(id);
}



}
