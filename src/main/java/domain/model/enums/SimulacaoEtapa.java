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
            "senha.png",
            "Toque aqui para digitar e-mail"),

    ENTRADA_CHAMADA("Toque no link azul para entrar na consulta",
            "",
            "Conseguiu entrar na chamada?",
            "Procure o link azul na parte superior",
            "link_consulta.png",
            "Toque aqui para entrar"),

    ATIVAR_MICROFONE("Toque no ícone do microfone para que o médico possa te escutar",
            "",
            "Conseguiu ativar o microfone?",
            "Toque aqui para ativar o seu microfone",
            "icone_microfone.png",
            "O ícone do microfone fica no canto inferior esquerdo"),

    ATIVAR_CAMERA("Toque no ícone da câmera para que o médico possa te ver",
            "",
            "Conseguiu ligar a câmera?",
            "Toque aqui para ligar a sua câmera",
            "icone_camera.png",
            "O ícone da câmera fica ao lado do microfone");

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
