package main.java.domain.model;

import java.time.LocalDateTime;

public class TestDrive {
    private int idTestDrive;
    private Consulta consulta;
    private LocalDateTime dataTestDrive;
    boolean concluido;

    public int getIdTestDrive() {
        return idTestDrive;
    }

    public void setIdTestDrive(int idTestDrive) {
        this.idTestDrive = idTestDrive;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public LocalDateTime getDataTestDrive() {
        return dataTestDrive;
    }

    public void setDataTestDrive(LocalDateTime dataTestDrive) {
        this.dataTestDrive = dataTestDrive;
    }

    public boolean isConcluido() {
        return concluido;
    }

    public void setConcluido(boolean concluido) {
        this.concluido = concluido;
    }
}
