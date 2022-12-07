package github.com.myclinic.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private Colaborador medico;

    @ManyToOne
    private Colaborador enfermeiro;

    @ManyToOne
    private Paciente paciente;

    private LocalDateTime dataAgendada;

    private String estadoConsulta;

    @OneToMany(mappedBy = "consulta")
    private List<Prontuario> prontuario;

}
