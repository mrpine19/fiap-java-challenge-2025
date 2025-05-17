package main.java.domain.model;

import java.time.LocalDateTime;

public class Consulta {
    private int idConsulta;
    private LocalDateTime dataHoraConsulta;
    private String status;
    private String linkTeleconsulta;

    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public LocalDateTime getDataHoraConsulta() {
        return dataHoraConsulta;
    }

    public void setDataHoraConsulta(LocalDateTime dataHoraConsulta) {
        this.dataHoraConsulta = dataHoraConsulta;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLinkTeleconsulta() {
        return linkTeleconsulta;
    }

    public void setLinkTeleconsulta(String linkTeleconsulta) {
        this.linkTeleconsulta = linkTeleconsulta;
    }
}
