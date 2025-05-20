package main.java.domain.service;

import main.java.domain.model.Consulta;
import main.java.domain.model.Paciente;
import main.java.domain.model.enums.SimulacaoEtapa;

public class Suporte {
    public void notificarSuporte(Paciente paciente, Consulta consulta, SimulacaoEtapa etapa) {
        String mensagem = "Paciente " + paciente.getNome() +
                " precisa de ajuda na etapa " + etapa.name() +
                " para consulta em " + consulta.getData();

        System.out.println("[WHATSAPP SUPORTE]: " + mensagem);
    }
}
