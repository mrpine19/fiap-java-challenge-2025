package main.java.domain.model.enums;

public enum SimulacaoEtapa {
    LOGIN_EMAIL("Por favor, toque no campo 'E-mail' e digite seu endereço", "Digite seu e-mail aqui: "),
    LOGIN_SENHA("Agora, toque no campo 'Senha' e digite sua senha", "Digite sua senha aqui: ");

    private final String instrucao;
    private final String segunda_instrucao;

    SimulacaoEtapa(String instrucao, String segunda_instrucao) {
        this.instrucao = instrucao;
        this.segunda_instrucao = segunda_instrucao;
    }

    public String getInstrucao() {
        return instrucao;
    }

    public String getSegunda_instrucao() {
        return segunda_instrucao;
    }

}
