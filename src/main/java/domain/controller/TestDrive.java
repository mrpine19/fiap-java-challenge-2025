package main.java.domain.controller;

import main.java.domain.model.Consulta;
import main.java.domain.model.Paciente;
import main.java.domain.model.enums.SimulacaoEtapa;
import main.java.domain.service.AvatarMedico;

public class TestDrive {
    private Paciente paciente;
    private Consulta consulta;
    private AvatarMedico avatar;

    public TestDrive(Paciente paciente, Consulta consulta) {
        this.paciente = paciente;
        this.consulta = consulta;
        this.avatar = new AvatarMedico();
    }

    public void iniciarSimulacao(){
        avatar.iniciarSaudacao(paciente);

        for (SimulacaoEtapa simulacaoEtapa : SimulacaoEtapa.values()) {
            executarEtapa(simulacaoEtapa);

            if (SimulacaoEtapa.LOGIN_EMAIL == simulacaoEtapa) {
                paciente.setEmail(avatar.pedirRetornoUsuario(SimulacaoEtapa.LOGIN_EMAIL.getSegunda_instrucao()));
            }
            if (SimulacaoEtapa.LOGIN_SENHA == simulacaoEtapa) {
                avatar.pedirRetornoUsuarioVoid(SimulacaoEtapa.LOGIN_EMAIL.getSegunda_instrucao());
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
