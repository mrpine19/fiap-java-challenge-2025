package main.java.domain.service;

import main.java.domain.model.Consulta;
import main.java.domain.model.Paciente;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CuidadorService {
    private String numeroCuidador;

    public void cadastrarCuidador(String numeroCuidador) {
        this.numeroCuidador = numeroCuidador;
        System.out.println("Cuidador cadastrado: " + numeroCuidador);
    }

    public boolean temCuidadorCadastrado() {
        return numeroCuidador != null && !numeroCuidador.isEmpty();
    }

    public void notificarCuidador(Paciente paciente, Consulta consulta) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("HH:mm:ss");
        String data = dtf.format(LocalDateTime.now());
        String hora = dtf2.format(LocalDateTime.now());

        String mensagem = "O(a) paciente " + paciente.getNome() +
                " completou o treino para a consulta em " +
                data + " às " + hora + " com o Dr(a). " +
                consulta.getMedico();

        System.out.println("[WHATSAPP CUIDADOR]: Enviando para " + numeroCuidador + ": " + mensagem);
    }
}
