package entidades;

import javax.persistence.*;
import java.sql.Date;

public class NfeErrosEntidades {
    private Integer idReg;
    private Integer iDatabases;
    private Integer iEntidades;
    private String nomeEntidade;
    private Integer iPessoas;
    private String nomePrestador;
    private Integer iCompetencia;
    private Integer qtdEnota;
    private Integer qtdLe;
    private Date dtConsultaOracle;
    private String descartado;

    public NfeErrosEntidades(Integer idReg, Integer iDatabases, Integer iEntidades, String nomeEntidade, Integer iPessoas, String nomePrestador, Integer iCompetencia, Integer qtdEnota, Integer qtdLe, Date dtConsultaOracle, String descartado) {
        this.idReg = idReg;
        this.iDatabases = iDatabases;
        this.iEntidades = iEntidades;
        this.nomeEntidade = nomeEntidade;
        this.iPessoas = iPessoas;
        this.nomePrestador = nomePrestador;
        this.iCompetencia = iCompetencia;
        this.qtdEnota = qtdEnota;
        this.qtdLe = qtdLe;
        this.dtConsultaOracle = dtConsultaOracle;
        this.descartado = descartado;
    }

    public NfeErrosEntidades() {
    }

    public Integer getIdReg() {
        return idReg;
    }

    public void setIdReg(Integer idReg) {
        this.idReg = idReg;
    }

    public Integer getiDatabases() {
        return iDatabases;
    }

    public void setiDatabases(Integer iDatabases) {
        this.iDatabases = iDatabases;
    }

    public Integer getiEntidades() {
        return iEntidades;
    }

    public void setiEntidades(Integer iEntidades) {
        this.iEntidades = iEntidades;
    }

    public String getNomeEntidade() {
        return nomeEntidade;
    }

    public void setNomeEntidade(String nomeEntidade) {
        this.nomeEntidade = nomeEntidade;
    }

    public Integer getiPessoas() {
        return iPessoas;
    }

    public void setiPessoas(Integer iPessoas) {
        this.iPessoas = iPessoas;
    }

    public String getNomePrestador() {
        return nomePrestador;
    }

    public void setNomePrestador(String nomePrestador) {
        this.nomePrestador = nomePrestador;
    }

    public Integer getiCompetencia() {
        return iCompetencia;
    }

    public void setiCompetencia(Integer iCompetencia) {
        this.iCompetencia = iCompetencia;
    }

    public Integer getQtdEnota() {
        return qtdEnota;
    }

    public void setQtdEnota(Integer qtdEnota) {
        this.qtdEnota = qtdEnota;
    }

    public Integer getQtdLe() {
        return qtdLe;
    }

    public void setQtdLe(Integer qtdLe) {
        this.qtdLe = qtdLe;
    }

    public Date getDtConsultaOracle() {
        return dtConsultaOracle;
    }

    public void setDtConsultaOracle(Date dtConsultaOracle) {
        this.dtConsultaOracle = dtConsultaOracle;
    }

    public String getDescartado() {
        return descartado;
    }

    @Override
    public String toString() {
        return "NfeErrosEntidades{" +
                "idReg=" + idReg +
                ", iDatabases=" + iDatabases +
                ", iEntidades=" + iEntidades +
                ", nomeEntidade='" + nomeEntidade + '\'' +
                ", iPessoas=" + iPessoas +
                ", nomePrestador='" + nomePrestador + '\'' +
                ", iCompetencia=" + iCompetencia +
                ", qtdEnota=" + qtdEnota +
                ", qtdLe=" + qtdLe +
                ", dtConsultaOracle=" + dtConsultaOracle +
                ", descartado='" + descartado + '\'' +
                '}';
    }

    public void setDescartado(String descartado) {
        this.descartado = descartado;
    }
}