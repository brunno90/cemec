package br.ifirst.cemec.entidades;

/**
 *
 * @author Iagho
 */
public class Permissao {

    private int cdPer;
    private int cdUsu;
    private boolean visul;
    private boolean incluir;
    private boolean alter;
    private boolean excluir;
    private String descricao;

    public int getCdPer() {
        return cdPer;
    }

    public void setCdPer(int cdPer) {
        this.cdPer = cdPer;
    }

    public int getCdUsu() {
        return cdUsu;
    }

    public void setCdUsu(int cdUsu) {
        this.cdUsu = cdUsu;
    }

    public boolean isVisul() {
        return visul;
    }

    public void setVisul(boolean visul) {
        this.visul = visul;
    }

    public boolean isIncluir() {
        return incluir;
    }

    public void setIncluir(boolean incluir) {
        this.incluir = incluir;
    }

    public boolean isAlter() {
        return alter;
    }

    public void setAlter(boolean alter) {
        this.alter = alter;
    }

    public boolean isExcluir() {
        return excluir;
    }

    public void setExcluir(boolean excluir) {
        this.excluir = excluir;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
