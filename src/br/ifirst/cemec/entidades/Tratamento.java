package br.ifirst.cemec.entidades;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Iagho
 */
public class Tratamento {

    private int cdTratamento;
    private String dsTratamento;
    private String recTratamento;
    private boolean tratDistancia;
    private int periodico;
    private int contSenha = 0;
    private int qtDias;
    private Date dtInicial;
    private Date dtFinal;
    private int naoRecPres;
    private int tpPeriodo;
    private CalendarioTratamento calendarioTratamento;
    private Frequentador frequentador;
    private int dataDef;
    private int naoRequerCalendario;
    private List<DataDefinida> dataDefinida;
    private int cdMov;
    private boolean presenca;
    private Date dtCad;
    private int medium;
    private String nmMedium;

    public String getNmMedium() {
        return nmMedium;
    }

    public void setNmMedium(String nmMedium) {
        this.nmMedium = nmMedium;
    }

    public int getMedium() {
        return medium;
    }

    public void setMedium(int medium) {
        this.medium = medium;
    }

    public Date getDtCad() {
        return dtCad;
    }

    public void setDtCad(Date dtCad) {
        this.dtCad = dtCad;
    }

    public boolean getPresenca() {
        return presenca;
    }

    public void setPresenca(boolean presenca) {
        this.presenca = presenca;
    }

    public int getCdMov() {
        return cdMov;
    }

    public void setCdMov(int cdMov) {
        this.cdMov = cdMov;
    }

    public List<DataDefinida> getDataDefinida() {
        return dataDefinida;
    }

    public void setDataDefinida(List<DataDefinida> dataDefinida) {
        this.dataDefinida = dataDefinida;
    }

    public int getDataDef() {
        return dataDef;
    }

    public void setDataDef(int dataDef) {
        this.dataDef = dataDef;
    }

    public int getNaoRequerCalendario() {
        return naoRequerCalendario;
    }

    public void setNaoRequerCalendario(int naoRequerCalendario) {
        this.naoRequerCalendario = naoRequerCalendario;
    }

    public Frequentador getFrequentador() {
        return frequentador;
    }

    public void setFrequentador(Frequentador frequentador) {
        this.frequentador = frequentador;
    }

    public CalendarioTratamento getCalendarioTratamento() {
        return calendarioTratamento;
    }

    public void setCalendarioTratamento(CalendarioTratamento calendarioTratamento) {
        this.calendarioTratamento = calendarioTratamento;
    }

    public Date getDtFinal() {
        return dtFinal;
    }

    public void setDtFinal(Date dtFinal) {
        this.dtFinal = dtFinal;
    }

    public int getTpPeriodo() {
        return tpPeriodo;
    }

    public void setTpPeriodo(int tpPeriodo) {
        this.tpPeriodo = tpPeriodo;
    }

    public int getNaoRecPres() {
        return naoRecPres;
    }

    public void setNaoRecPres(int naoRecPres) {
        this.naoRecPres = naoRecPres;
    }

    public Date getDtInicial() {
        return dtInicial;
    }

    public void setDtInicial(Date dtInicial) {
        this.dtInicial = dtInicial;
    }

    public int getQtDias() {
        return qtDias;
    }

    public void setQtDias(int qtDias) {
        this.qtDias = qtDias;
    }

    public int getContSenha() {
        return contSenha;
    }

    public void setContSenha(int contSenha) {
        this.contSenha = contSenha;
    }

    public int getCdTratamento() {
        return cdTratamento;
    }

    public void setCdTratamento(int cdTratamento) {
        this.cdTratamento = cdTratamento;
    }

    public String getDsTratamento() {
        return dsTratamento;
    }

    public void setDsTratamento(String dsTratamento) {
        this.dsTratamento = dsTratamento;
    }

    public String getRecTratamento() {
        return recTratamento;
    }

    public void setRecTratamento(String recTratamento) {
        this.recTratamento = recTratamento;
    }

    public boolean getTratDistancia() {
        return tratDistancia;
    }

    public void setTratDistancia(boolean naoRecPres) {
        this.tratDistancia = naoRecPres;
    }

    public int getPeriodico() {
        return periodico;
    }

    public void setPeriodico(int pediodico) {
        this.periodico = pediodico;
    }
}
