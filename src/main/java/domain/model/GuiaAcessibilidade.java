package main.java.domain.model;

import java.util.List;

public class GuiaAcessibilidade {
    private int idAcessibilidade;
    private List<String> recursos;

    public int getIdAcessibilidade() {
        return idAcessibilidade;
    }

    public void setIdAcessibilidade(int idAcessibilidade) {
        this.idAcessibilidade = idAcessibilidade;
    }

    public List<String> getRecursos() {
        return recursos;
    }

    public void setRecursos(List<String> recursos) {
        this.recursos = recursos;
    }
}
