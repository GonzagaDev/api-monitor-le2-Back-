package entidades;
import javax.persistence.*;
import java.sql.Date;


@Entity
@Table(name = "nfe_integradas")
public class NfeInteg {
    @Id
    @Column(name = "id_reg")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idReg;
    @Column(name = "notas_integradas")
    private Integer nfeInteg;
    @Column(name = "dt_consulta_oracle")
    private Date dtConsultaOracle;

    public NfeInteg(Integer idReg, Integer nfeInteg, Date dtConsultaOracle) {
        this.idReg = idReg;
        this.nfeInteg = nfeInteg;
        this.dtConsultaOracle = dtConsultaOracle;
    }

    public NfeInteg() {
    }

    public Integer getIdReg() {
        return idReg;
    }

    public void setIdReg(Integer idReg) {
        this.idReg = idReg;
    }

    public Integer getNfeInteg() {
        return nfeInteg;
    }

    public void setNfeInteg(Integer nfeInteg) {
        this.nfeInteg = nfeInteg;
    }

    public Date getDtConsultaOracle() {
        return dtConsultaOracle;
    }

    public void setDtConsultaOracle(Date dtConsultaOracle) {
        this.dtConsultaOracle = dtConsultaOracle;
    }

    @Override
    public String toString() {
        return "NfeInteg{" +
                "idReg=" + idReg +
                ", nfeInteg=" + nfeInteg +
                ", dtConsultaOracle=" + dtConsultaOracle +
                '}';
    }
}