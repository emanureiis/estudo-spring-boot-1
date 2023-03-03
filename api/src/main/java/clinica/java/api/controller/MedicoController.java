package clinica.java.api.controller;

import clinica.java.api.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import clinica.java.api.medico.DadosCadastroMedico;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

	@Autowired
	private MedicoRepository repository;

	//In here, the objetive is ask for the MedicoRepository persit our Object in the data base
	@PostMapping
	public void cadastrar(@RequestBody DadosCadastroMedico dados) {
		//repository.save();
	}
}
