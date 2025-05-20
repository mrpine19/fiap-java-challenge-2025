package main.java.domain.model;

import java.time.LocalDateTime;

public class Consulta {
    private String medico;
    private String especialidade;
    private LocalDateTime data;

    public Consulta(String medico, String especialidade, LocalDateTime data) {
        this.medico = medico;
        this.especialidade = especialidade;
        this.data = data;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }
}
