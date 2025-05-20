package main.java.domain.model;

public class Paciente {
    private String nome;
    private int idade;
    private String telefone;
    private String email;
    private boolean deficienciaVisual;
    private boolean deficienciaAuditiva;

    public Paciente(String nome, int idade, String telefone) {
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isDeficienciaVisual() {
        return deficienciaVisual;
    }

    public void setDeficienciaVisual(boolean deficienciaVisual) {
        this.deficienciaVisual = deficienciaVisual;
    }

    public boolean isDeficienciaAuditiva() {
        return deficienciaAuditiva;
    }

    public void setDeficienciaAuditiva(boolean deficienciaAuditiva) {
        this.deficienciaAuditiva = deficienciaAuditiva;
    }
}
