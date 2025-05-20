package main.java.domain.model.enums;

public enum SimulacaoEtapa {
    LOGIN_EMAIL("Por favor, toque no campo 'E-mail' e digite seu endereço",
            "Digite seu e-mail aqui: ",
            "Você digitou o e-mail corretamente?",
            "Vamos digitar novamente o e-mail!",
            "email.png",
            "Toque aqui para digitar e-mail"),
    LOGIN_SENHA("Agora, toque no campo 'Senha' e digite sua senha",
            "Digite sua senha aqui: ",
            "Conseguiu fazer login?",
            "Vamos tentar novamente o login",
            "senha",
            "Toque aqui para digitar e-mail");

    private final String instrucao;
    private final String segundaInstrucao;
    private final String descricaoFeedback;
    private final String instrucaoAjuda;
    private final String arquivoImagem;
    private final String textoImagem;

    SimulacaoEtapa(String instrucao, String segundaInstrucao, String descricaoFeedback, String instrucaoAjuda,  String arquivoImagem, String textoImagem) {
        this.instrucao = instrucao;
        this.segundaInstrucao = segundaInstrucao;
        this.descricaoFeedback = descricaoFeedback;
        this.instrucaoAjuda = instrucaoAjuda;
        this.arquivoImagem = arquivoImagem;
        this.textoImagem = textoImagem;
    }

    public boolean isRequereAudio(){
        return true;
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

    public String getArquivoImagem() {
        return arquivoImagem;
    }

    public String getTextoImagem() {
        return textoImagem;
    }
}
