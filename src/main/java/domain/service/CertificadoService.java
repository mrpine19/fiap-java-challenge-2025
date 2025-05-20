package main.java.domain.service;

import main.java.domain.model.Consulta;
import main.java.domain.model.Paciente;

public class CertificadoService {
    public void emitirCertificado(Paciente paciente, Consulta consulta) {
        String mensagem = "\n=== PARABÉNS! :) ===\n" +
                "[AVATAR]: " + paciente.getNome() + ", você completou o treino!\n" +
                "Certificado virtual enviado para seu WhatsApp.\n" +
                "Data: " + consulta.getData() + "\n" +
                "Médico: " + consulta.getMedico();

        System.out.println(mensagem);
    }
}
