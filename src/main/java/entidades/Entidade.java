package entidades;

import javax.persistence.*;

@Entity
@Table(name = "entidades")
public class Entidade {
    @Id
    @Column(name = "id_reg")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer iReg;
    @Column(name = "i_entidades")
    private Integer iEntidades;
    @Column(name = "nome")
    private String nome;
    @Column(name = "utiliza_le2")
    private String utilizaLe;
    @Column(name = "le2_homolog")
    private String leHomolog;

    public Integer getiReg() {
        return iReg;
    }

    public void setiReg(Integer iReg) {
        this.iReg = iReg;
    }

    public Integer getiEntidades() {
        return iEntidades;
    }

    public void setiEntidades(Integer iEntidades) {
        this.iEntidades = iEntidades;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUtilizaLe() {
        return utilizaLe;
    }

    public void setUtilizaLe(String utilizaLe) {
        this.utilizaLe = utilizaLe;
    }

    public String getLeHomolog() {
        return leHomolog;
    }

    public void setLeHomolog(String leHomolog) {
        this.leHomolog = leHomolog;
    }

    @Override
    public String toString() {
        return "Entidade{" +
                "iReg=" + iReg +
                ", iEntidades=" + iEntidades +
                ", nome='" + nome + '\'' +
                ", utilizaLe='" + utilizaLe + '\'' +
                ", leHomolog='" + leHomolog + '\'' +
                '}';
    }

    public Entidade() {
    }

    public Entidade(Integer iReg, Integer iEntidades, String nome, String utilizaLe, String leHomolog) {

        this.iReg = iReg;
        this.iEntidades = iEntidades;
        this.nome = nome;
        this.utilizaLe = utilizaLe;
        this.leHomolog = leHomolog;
    }
}

