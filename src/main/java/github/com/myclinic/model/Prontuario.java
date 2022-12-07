package github.com.myclinic.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
public class Prontuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private Consulta consulta;

    @NotNull(message = "Campo EVOLUÇÃO não pode ficar vazio.")
    @Length(min = 12)
    private String evolucao;

    private LocalDateTime dataEvolucao;

}
