package aapr.consultorio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aapr.consultorio.exceptions.CitaNotFoundException;
import aapr.consultorio.model.Consultorio;
import aapr.consultorio.repository.ConsultorioRepository;

@Service
public class ConsultorioService {
private ConsultorioRepository consultorioRepository;

@Autowired
public ConsultorioService(ConsultorioRepository consultorioRepository) {
	super();
	this.consultorioRepository = consultorioRepository;
}

public List<Consultorio> getAll(){
	return consultorioRepository.findAll();
}

public Consultorio createCita(Consultorio newCita) {
	return consultorioRepository.save(newCita);
}

public void deleteCita(Long id) {
	if(consultorioRepository.existsById(id)) {
		consultorioRepository.deleteById(id);
	}else {
		throw new CitaNotFoundException(id);
	}
}




}
