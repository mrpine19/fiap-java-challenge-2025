package main.java.domain.model;

public class Paciente extends Usuario {

    private String contatoWhatsapp;
    private boolean possuiDeficiencia;
    private String afinidadeDigital;
    private String historicoMedico;
    private int historicoFalhas;

    public String getContatoWhatsapp() {
        return contatoWhatsapp;
    }

    public void setContatoWhatsapp(String contatoWhatsapp) {
        this.contatoWhatsapp = contatoWhatsapp;
    }

    public boolean isPossuiDeficiencia() {
        return possuiDeficiencia;
    }

    public void setPossuiDeficiencia(boolean possuiDeficiencia) {
        this.possuiDeficiencia = possuiDeficiencia;
    }

    public String getAfinidadeDigital() {
        return afinidadeDigital;
    }

    public void setAfinidadeDigital(String afinidadeDigital) {
        this.afinidadeDigital = afinidadeDigital;
    }

    public String getHistoricoMedico() {
        return historicoMedico;
    }

    public void setHistoricoMedico(String historicoMedico) {
        this.historicoMedico = historicoMedico;
    }

    public int getHistoricoFalhas() {
        return historicoFalhas;
    }

    public void setHistoricoFalhas(int historicoFalhas) {
        this.historicoFalhas = historicoFalhas;
    }
}
