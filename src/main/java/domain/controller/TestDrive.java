package main.java.domain.controller;

import main.java.domain.model.Consulta;
import main.java.domain.model.Paciente;
import main.java.domain.model.enums.SimulacaoEtapa;
import main.java.domain.service.AvatarMedico;
import main.java.domain.service.FeedbackService;
import main.java.domain.service.Suporte;

public class TestDrive {
    private Paciente paciente;
    private Consulta consulta;
    private AvatarMedico avatar;
    private FeedbackService feedbackService;
    private Suporte suporte;

    public TestDrive(Paciente paciente, Consulta consulta) {
        this.paciente = paciente;
        this.consulta = consulta;
        this.avatar = new AvatarMedico();
        this.feedbackService = new FeedbackService();
        this.suporte = new Suporte();
    }

    public void iniciarSimulacao(){
        String resposta;
        avatar.iniciarSaudacao(paciente);

        for (SimulacaoEtapa simulacaoEtapa : SimulacaoEtapa.values()) {
            executarEtapa(simulacaoEtapa);

            resposta = avatar.pedirRetornoUsuario(simulacaoEtapa.getSegundaInstrucao());

            while (!feedbackService.obterFeedback(simulacaoEtapa.getDescricaoFeedback())){
                avatar.oferecerAjuda(simulacaoEtapa);
                executarEtapa(simulacaoEtapa);
                resposta = avatar.pedirRetornoUsuario(simulacaoEtapa.getSegundaInstrucao());

                if (feedbackService.contarTentativasFallhas() >= 2) {
                    suporte.notificarSuporte(paciente, consulta, simulacaoEtapa);
                    break;
                }
            }

            if (SimulacaoEtapa.LOGIN_EMAIL == simulacaoEtapa) {
                paciente.setEmail(resposta);
            }

        }
    }

    private void executarEtapa(SimulacaoEtapa simulacaoEtapa) {
        avatar.exibirInstrucao(simulacaoEtapa);
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public AvatarMedico getAvatar() {
        return avatar;
    }

    public void setAvatar(AvatarMedico avatar) {
        this.avatar = avatar;
    }
}
