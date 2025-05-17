package main.java.domain.model;

import java.time.LocalDateTime;

public class Lembrete {
    private int idLembrete;
    private Consulta consulta;
    private LocalDateTime dataEnvioLembrete;

    public int getIdLembrete() {
        return idLembrete;
    }

    public void setIdLembrete(int idLembrete) {
        this.idLembrete = idLembrete;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public LocalDateTime getDataEnvioLembrete() {
        return dataEnvioLembrete;
    }

    public void setDataEnvioLembrete(LocalDateTime dataEnvioLembrete) {
        this.dataEnvioLembrete = dataEnvioLembrete;
    }
}
