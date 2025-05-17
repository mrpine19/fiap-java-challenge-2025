package main.java.domain.model;

import java.time.LocalDateTime;

public class ChatbotInteracao {
    private int idAgendamento;
    private String tipoMensagem;
    private String conteudo;
    private LocalDateTime dataEnvioMensagem;

    public int getIdAgendamento() {
        return idAgendamento;
    }

    public void setIdAgendamento(int idAgendamento) {
        this.idAgendamento = idAgendamento;
    }

    public String getTipoMensagem() {
        return tipoMensagem;
    }

    public void setTipoMensagem(String tipoMensagem) {
        this.tipoMensagem = tipoMensagem;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public LocalDateTime getDataEnvioMensagem() {
        return dataEnvioMensagem;
    }

    public void setDataEnvioMensagem(LocalDateTime dataEnvioMensagem) {
        this.dataEnvioMensagem = dataEnvioMensagem;
    }
}
