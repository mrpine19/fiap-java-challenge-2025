package main.java.domain.service;

import main.java.domain.model.Paciente;

public class AvatarMedico {
    public void iniciarSaudacao(Paciente paciente) {
        String mensagem = paciente.getIdade() > 70 ?
                "Olá " + paciente.getNome() + "! Vamos praticar juntos sua teleconsulta?" :
                "Bem-vindo ao simulador de teleconsulta, " + paciente.getNome() + "!";

        System.out.println("[AVATAR]: " + mensagem);
        reproduzirAudio("saudacao_avatar.mp3");
    }

    private void reproduzirAudio(String arquivo) {
        System.out.println("[AUDIO]: Reproduzindo " + arquivo);
    }
}
