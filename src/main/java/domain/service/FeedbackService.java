package main.java.domain.service;

import java.util.Scanner;

public class FeedbackService {
    private int tentativasFallhas;
    private boolean simulacaoConcluida;

    public boolean obterFeedback(String pergunta) {
        Scanner sc = new Scanner(System.in);
        char resposta;
        System.out.print("\n[FEEDBACK]: " + pergunta + " (S/N): ");
        resposta = sc.next().charAt(0);

        if (resposta == 'S' || resposta == 's') {
            simulacaoConcluida = true;
            return true;
        } else {
            tentativasFallhas++;
            return false;
        }
    }
}
