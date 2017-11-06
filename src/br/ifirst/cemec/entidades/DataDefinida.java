package br.ifirst.cemec.entidades;

import java.util.Date;

/**
 *
 * @author Iagho
 */
public class DataDefinida {

    private Date data;
    private int cdTrat;
    private int cdCtr;
    private int cdFreq;
    private int cdMov;
    private int presenca;

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

    public int getCdFreq() {
        return cdFreq;
    }

    public void setCdFreq(int cdFreq) {
        this.cdFreq = cdFreq;
    }

    public int getCdCtr() {
        return cdCtr;
    }

    public void setCdCtr(int cdCtr) {
        this.cdCtr = cdCtr;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getCdTrat() {
        return cdTrat;
    }

    public void setCdTrat(int cdTrat) {
        this.cdTrat = cdTrat;
    }
}
