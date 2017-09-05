package daos;

import entidades.Entidade;
import entidades.NfeErros;
import entidades.NfeErrosEntidades;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import java.util.ArrayList;
import java.util.List;

@Stateless
public class NfeErrosDao {
    @PersistenceContext(unitName = "api_monitor_le2")
    private EntityManager manager;

    public List<NfeErros> getErrosComWhere(String whereClause, Object parametro) {
        return manager.createQuery("SELECT nfe FROM NfeErros nfe " + whereClause + parametro, NfeErros.class)
                .getResultList();
    }
    public List<NfeErrosEntidades> getErrosEntidadesComWhere2(String whereClause, Object parametro) {
        Query query =    manager.createQuery(
                "SELECT nfe,  " +
                        "(select e from Entidade e "+
                        "where  e.iEntidades = nfe.iEntidades) as enti from NfeErros nfe ");

        return query.getResultList();
    }
    public List<NfeErrosEntidades> getErrosEntidadesComWhere(String whereClause, Object parametro) {
        List<Entidade> entidades =    new EntidadesDao().getAll(manager);
        List<NfeErros> erros = manager.createQuery("SELECT nfe FROM NfeErros nfe " + whereClause + parametro, NfeErros.class)
                .getResultList();
        NfeErrosEntidades  erroEntidade = new NfeErrosEntidades();
        List<NfeErrosEntidades> errosEntidades= new ArrayList<>();
        for (int i = 0; i < erros.size(); i++){
            erroEntidade.setIdReg(erros.get(i).getIdReg());
            erroEntidade.setiDatabases(erros.get(i).getiDatabases());
            erroEntidade.setiEntidades(erros.get(i).getiEntidades());
            erroEntidade.setiPessoas(erros.get(i).getiPessoas());
            erroEntidade.setNomePrestador(erros.get(i).getNomePrestador());
            erroEntidade.setiCompetencia(erros.get(i).getiCompetencia());
            erroEntidade.setQtdEnota(erros.get(i).getQtdEnota());
            erroEntidade.setQtdLe(erros.get(i).getQtdLe());
            erroEntidade.setDtConsultaOracle(erros.get(i).getDtConsultaOracle());
            erroEntidade.setDescartado(erros.get(i).getDescartado());
            for (int x = 0; x < entidades.size(); x++){
                if(entidades.get(x).getiEntidades()== erros.get(i).getiEntidades()){
                    erroEntidade.setNomeEntidade(entidades.get(x).getNome());
                }
            }
            errosEntidades.add(erroEntidade);
            erroEntidade = new NfeErrosEntidades();
        }

        return errosEntidades;
    }
    public NfeErros salvar(NfeErros nfeErros) {
        manager.persist(nfeErros);
        return nfeErros;
    }
}
