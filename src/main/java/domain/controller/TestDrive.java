package main.java.domain.controller;

import main.java.domain.model.Consulta;
import main.java.domain.model.Paciente;
import main.java.domain.model.enums.SimulacaoEtapa;
import main.java.domain.service.*;

public class TestDrive {
    private Paciente paciente;
    private Consulta consulta;
    private AvatarMedico avatar;
    private FeedbackService feedbackService;
    private SuporteService suporte;
    private CertificadoService certificadoService;
    private CuidadorService cuidadorService;

    public TestDrive(Paciente paciente, Consulta consulta) {
        this.paciente = paciente;
        this.consulta = consulta;
        this.avatar = new AvatarMedico();
        this.feedbackService = new FeedbackService();
        this.suporte = new SuporteService();
        this.certificadoService = new CertificadoService();
        this.cuidadorService = new CuidadorService();
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
                }
            }

            if (SimulacaoEtapa.LOGIN_EMAIL == simulacaoEtapa) {
                paciente.setEmail(resposta);
            }

        }

        if (feedbackService.isSimulacaoConcluida()) {
            certificadoService.emitirCertificado(paciente, consulta);

            if (cuidadorService.temCuidadorCadastrado()) {
                cuidadorService.notificarCuidador(paciente, consulta);
            }
        }
    }

    private void executarEtapa(SimulacaoEtapa simulacaoEtapa) {
        avatar.exibirInstrucao(simulacaoEtapa);
        AcessibilidadeService.configurarExibicao(simulacaoEtapa, paciente);
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

    public FeedbackService getFeedbackService() {
        return feedbackService;
    }

    public void setFeedbackService(FeedbackService feedbackService) {
        this.feedbackService = feedbackService;
    }

    public SuporteService getSuporte() {
        return suporte;
    }

    public void setSuporte(SuporteService suporte) {
        this.suporte = suporte;
    }

    public CertificadoService getCertificadoService() {
        return certificadoService;
    }

    public void setCertificadoService(CertificadoService certificadoService) {
        this.certificadoService = certificadoService;
    }

    public CuidadorService getCuidadorService() {
        return cuidadorService;
    }

    public void setCuidadorService(CuidadorService cuidadorService) {
        this.cuidadorService = cuidadorService;
    }
}
