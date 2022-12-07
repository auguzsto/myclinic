package github.com.myclinic.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Entity
@Data
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull(message = "Campo RG não pode ficar vazio")
    @Length(min = 7, max = 7)
    private String rg;

    @NotNull(message = "Campo CPF não pode ficar vazio")
    @Length(min = 11, max = 11)
    private String cpf;

    @NotNull(message = "Campo nome não pode ficar vazio")
    @Length(min = 6, max = 30)
    private String nomeCompleto;

}
