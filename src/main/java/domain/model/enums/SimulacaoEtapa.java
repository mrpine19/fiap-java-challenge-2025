package main.java.domain.model.enums;

public enum SimulacaoEtapa {
    LOGIN_EMAIL("Por favor, toque no campo 'E-mail' e digite seu endereço", "Digite seu e-mail aqui: ","Você digitou o e-mail corretamente?", "Vamos digitar novamente o e-mail!"),
    LOGIN_SENHA("Agora, toque no campo 'Senha' e digite sua senha", "Digite sua senha aqui: ", "Conseguiu fazer login?", "Vamos tentar novamente o login");

    private final String instrucao;
    private final String segundaInstrucao;
    private final String descricaoFeedback;
    private final String instrucaoAjuda;

    SimulacaoEtapa(String instrucao, String segundaInstrucao, String descricaoFeedback, String instrucaoAjuda) {
        this.instrucao = instrucao;
        this.segundaInstrucao = segundaInstrucao;
        this.descricaoFeedback = descricaoFeedback;
        this.instrucaoAjuda = instrucaoAjuda;
    }

    public String getInstrucao() {
        return instrucao;
    }

    public String getSegundaInstrucao() {
        return segundaInstrucao;
    }

    public String getInstrucaoAjuda() {
        return instrucaoAjuda;
    }

    public String getDescricaoFeedback() {
        return descricaoFeedback;
    }
}
