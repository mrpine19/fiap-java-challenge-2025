package main.java.domain.service;

import main.java.domain.model.Consulta;
import main.java.domain.model.Paciente;

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
        String mensagem = "O paciente " + paciente.getNome() +
                " completou o treino para a consulta em " +
                consulta.getData() + " com o Dr(a). " +
                consulta.getMedico();

        System.out.println("[WHATSAPP CUIDADOR]: Enviando para " + numeroCuidador + ": " + mensagem);
    }
}
