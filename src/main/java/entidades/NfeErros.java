package entidades;
import javax.persistence.*;
import java.sql.Date;


@Entity
@Table(name = "nfe_nao_integ")
public class NfeErros {
    @Id
    @Column(name = "id_reg")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idReg;
    @Column(name = "i_databases")
    private Integer iDatabases;
    @Column(name = "i_entidades")
    private Integer iEntidades;
    @Column(name = "i_pessoas")
    private Integer iPessoas;
    @Column(name = "nome_prestador")
    private String nomePrestador;
    @Column(name = "i_competencia")
    private Integer iCompetencia;
    @Column(name = "qtd_enota")
    private Integer qtdEnota;
    @Column(name = "qtd_le")
    private Integer qtdLe;
    @Column(name = "dt_consulta_oracle")

    private Date dtConsultaOracle;
    @Column(name = "descartado", columnDefinition = "DEFAULT 'N'", nullable = false)
    private String descartado;

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

    public void setDescartado(String descartado) {
        this.descartado = descartado;
    }
}