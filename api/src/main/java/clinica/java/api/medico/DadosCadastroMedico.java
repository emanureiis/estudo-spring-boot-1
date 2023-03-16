package clinica.java.api.medico;

import clinica.java.api.endereco.DadosEndereco;

public record DadosCadastroMedico(String nome, String email, String crm, Especialidade especialidade, DadosEndereco endereco) {
	
	
}
