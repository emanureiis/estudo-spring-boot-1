package clinica.java.api.medico;

import clinica.java.api.endereco.Endereco;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "medicos") //Indica o nome da tabela que iremos trabalhar
@Entity(name = "Medico") //Indica que esta classe é uma entidade
@Getter //Gera automaticamente o método Getter para todos os campos
@NoArgsConstructor(access = AccessLevel.PRIVATE) //Gera automaticamente um contrutor privado padrão sem argumentos para classe
@AllArgsConstructor //Gera automaticamente um construtor com argumentos correspondentes a todos os campos da classe
@EqualsAndHashCode(of = "id") //Gera os métodos "equals()" e "hashCode()" apenas no campo "id"

public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Indica que o BD irá gerar uma chave primária para cada linha inserida
    private Long id;
    private String nome;
    private String email;
    private String crm;

    @Enumerated(EnumType.STRING) //Faz com que o valor seja armazenado como uma String no BD
    private Especialidade especialidade;

    @Embedded
    private Endereco endereco;//Incorpora os dados referentes a Endereco à tabela medicos. Em outras palavras, faz com que os dados seja, armazenados em uma única tabela

}
