package br.ifirst.cemec.entidades;

import java.util.Date;

/**
 *
 * @author Iagho
 */
public class Senha {

    private int cdTrat;
    private int senha;
    private int preferencial;
    private int cdMov;
    private int presenca;
    private Date data;

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getPresenca() {
        return presenca;
    }

    public void setPresenca(int presenca) {
        this.presenca = presenca;
    }

    public int getCdMov() {
        return cdMov;
    }

    public void setCdMov(int cdMov) {
        this.cdMov = cdMov;
    }

    public int getCdTrat() {
        return cdTrat;
    }

    public void setCdTrat(int cdTrat) {
        this.cdTrat = cdTrat;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getPreferencial() {
        return preferencial;
    }

    public void setPreferencial(int preferencial) {
        this.preferencial = preferencial;
    }
}
