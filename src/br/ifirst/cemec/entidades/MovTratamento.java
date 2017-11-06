package br.ifirst.cemec.entidades;

import java.util.List;

/**
 *
 * @author Iagho
 */
public class MovTratamento {

    private List<Tratamento> tratamentos;
    private List<Frequentador> frequentadors;

    public List<Tratamento> getTratamentos() {
        return tratamentos;
    }

    public void setTratamentos(List<Tratamento> tratamentos) {
        this.tratamentos = tratamentos;
    }

    public List<Frequentador> getFrequentadors() {
        return frequentadors;
    }

    public void setFrequentadors(List<Frequentador> frequentadors) {
        this.frequentadors = frequentadors;
    }
}
