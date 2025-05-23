package main.java.domain.service;

import main.java.domain.model.Paciente;
import main.java.domain.model.enums.SimulacaoEtapa;

import java.util.Scanner;

public class AvatarMedico {
    Scanner sc = new Scanner(System.in);

    public void iniciarSaudacao(Paciente paciente) {
        String mensagem = paciente.getIdade() > 70 ?
                "Olá " + paciente.getNome() + "! Vamos praticar juntos sua teleconsulta?" :
                "Bem-vindo ao simulador de teleconsulta, " + paciente.getNome() + "!";

        System.out.println("[AVATAR]: " + mensagem);
        reproduzirAudio("saudacao_avatar.mp3");
    }

    public void exibirInstrucao(SimulacaoEtapa etapa) {
        System.out.println("\n=== " + etapa.name() + " ===");
        System.out.println("[AVATAR]: " + etapa.getInstrucao());

        if (etapa.getArquivoImagem() != null) {
            exibirImagemComSeta(etapa.getArquivoImagem(), etapa.getTextoImagem());
        }
    }

    public String pedirRetornoUsuario(String instrucao) {
        System.out.print("[AVATAR]: " + instrucao);
        return sc.nextLine();
    }

    public void pedirRetornoUsuarioVoid(String instrucao) {
        System.out.print("[AVATAR]: " + instrucao);
        sc.nextLine();
    }

    public void oferecerAjuda(SimulacaoEtapa etapa) {
        System.out.println("[AVATAR]: Vamos tentar novamente juntos!");
        System.out.println("[AVATAR]: " + etapa.getInstrucaoAjuda());
        reproduzirAudio("ajuda_" + etapa.name().toLowerCase() + ".mp3");
    }

    private void reproduzirAudio(String arquivo) {
        System.out.println("[AUDIO]: Reproduzindo " + arquivo);
    }

    private void exibirImagemComSeta(String imagem, String texto) {
        System.out.println("[IMAGEM]: Exibindo " + imagem + " com seta: " + texto);
    }
}
