package main.java.domain.service;

import main.java.domain.model.Consulta;
import main.java.domain.model.Paciente;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CertificadoService {
    public void emitirCertificado(Paciente paciente, Consulta consulta) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("HH:mm:ss");
        String data = dtf.format(LocalDateTime.now());
        String hora = dtf2.format(LocalDateTime.now());

        String mensagem = "\n=== PARABÉNS! :) ===\n" +
                "[AVATAR]: " + paciente.getNome() + ", você completou o treino!\n" +
                "Certificado virtual enviado para seu WhatsApp.\n" +
                "Data: " + data + " às " + hora + "\n" +
                "Médico: Dr(a)." + consulta.getMedico();

        System.out.println(mensagem);
    }
}
