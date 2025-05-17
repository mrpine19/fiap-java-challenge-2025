package main.java.domain.model;

import java.util.List;

public class Medico extends Usuario{
    private String crm;
    private List<String> especialidades;
    private String emailHC;

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public List<String> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(List<String> especialidades) {
        this.especialidades = especialidades;
    }

    public String getEmailHC() {
        return emailHC;
    }

    public void setEmailHC(String emailHC) {
        this.emailHC = emailHC;
    }
}
