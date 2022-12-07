# Roadmap API: Fase 1.
## Requisitos & regras de negócio.
### Requisitos para clínica.
Consultório médico deve conter, obrigatoriamente, no mínimo 1 médico(a), 1 enfermeiro(a) e 1 recepcionista. Todos são tipos de colaboradores.
### Requisitos para colaboradores.
Há, no mínimo, 3 tipos de colaboradores: Médico(a), Enfermeiro(a) e Recepcionista. Ao cadastrar colaborador na clínica é preciso especificar qual tipo do colaborador está sendo cadastrado. Colaborador do tipo: 
* Médico(a) deve conter CRM,DATA DE VALIDADE DO CRM, RG, CPF e NOME COMPLETO, DATA DE NASCIMENTO.
- Enfermeiro(a) deve conter COREN, DATA DE VALIDADE DO COREN, RG, CPF E NOME COMPLETO, DATA DE NASCIMENTO.
* Recepcionista deve conter RG, CPF, NOME COMPLETO, DATA DE NASCIMENTO. 

### Requisitos para pacientes.
* Paciente deve conter RG, CPF, NOME COMPLETO, DATA DE NASCIMENTO.

### Requisitos para consultas.
* Consulta deve conter 1 PACIENTE, 1 MÉDICO(A) ou 1 ENFERMEIRO(A), PRONTUÁRIO, DATA AGENDADA, PREÇO, ESTADO DA CONSULTA.

### Requisitos para prontuários.
* Prontuário deve conter CONSULTA, EVOLUÇÃO, DATA DA EVOLUÇÃO.

# Modelagem de dados.
- [ ] Colaboradores.
- [ ] Pacientes.
- [ ] Consultas.
- [ ] Prontuários.

# Crud & Validações.
- [ ] Colaboradores.
- [ ] Pacientes.
- [ ] Consultas.
- [ ] Prontuários.
