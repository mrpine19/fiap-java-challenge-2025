package main.java.domain.service;

import main.java.domain.model.Paciente;
import main.java.domain.model.enums.SimulacaoEtapa;

public class AcessibilidadeService {
    public static void configurarExibicao(SimulacaoEtapa etapa, Paciente paciente) {
        if (paciente.getIdade() > 60 || paciente.isDeficienciaVisual()) {
            System.out.println("[ACESSIBILIDADE]: Paciente com deficiência visual - Modo ampliado ativado - " +
                    "Tamanho da fonte aumentado para 16pt");
        }

        if (paciente.isDeficienciaAuditiva() && etapa.isRequereAudio()) {
            System.out.println("[ACESSIBILIDADE]: Paciente com deficiência auditiva - Legendas ativadas para instruções de áudio");
        }
    }
}
