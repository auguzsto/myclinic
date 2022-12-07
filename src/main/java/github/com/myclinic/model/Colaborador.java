package github.com.myclinic.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDate;

@Entity
@Data
public class Colaborador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Length(min = 12, max = 12)
    private String crm;

    @Length(min = 6, max = 6)
    private String coren;

    private LocalDate dataValidadeCorenCrm;

    @NotNull(message = "Campo RG não pode ficar vazio.")
    @Length(min = 7, max = 7)
    private String rg;

    @NotNull(message = "Campo CPF não pode ficar vazio.")
    @Length(min = 11, max = 11)
    private String cpf;

    @NotNull(message = "Campo nome não pode ficar vazio.")
    @Length(min = 6, max = 30)
    private String nomeCompleto;

    @NotNull(message = "Campo data de nascimento não pode ficar vazio")
    private LocalDate dataNascimento;

}
