package daos;

import entidades.Entidade;
import exceptions.ModelException;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class EntidadesDao {

    @PersistenceContext(unitName = "api_monitor_le2")
    private EntityManager manager;

    public List<Entidade> buscarEntidadeComWhere(String whereClause, Object parametro) {
        return manager.createQuery("SELECT  e FROM Entidade e " + whereClause + parametro, Entidade.class)
                .getResultList();
    }

    public void deletar(Integer idEntidade) throws ModelException {
        Entidade entidade = getById(idEntidade);
        if (entidade != null) {
            manager.remove(entidade);
        } else {
            throw new ModelException("Entidade não encontrada!");
        }
    }

    public List<Entidade> getAll() {
        List<Entidade> entidades = manager.createQuery("SELECT e FROM Entidade e", Entidade.class).getResultList();
        System.out.println(entidades.size());
        return entidades;
    }

    public List<Entidade> getAll(EntityManager manager) {
        List<Entidade> entidades = manager.createQuery("SELECT e FROM Entidade e", Entidade.class).getResultList();
        System.out.println(entidades.size());
        return entidades;
    }

    public Entidade getById(Integer idFuncionario) throws ModelException {
        Entidade entidade = manager.find(Entidade.class, idFuncionario);
        if (entidade == null) {
            throw new ModelException("Entidade não encontrada!");
        }
        return entidade;
    }

    public List<Entidade> salvar(List<Entidade>  entidade) {
        for (int i = 0; i < entidade.size(); i++){
            manager.persist(entidade.get(i));
        }
        return entidade;
    }
    public List<Entidade> refresh( String token, List<Entidade>  entidade) throws ModelException {
        try {

            if (entidade.size() >0) {
                manager.createQuery("DELETE FROM Entidade e" ).executeUpdate();
                for (int i = 0; i < entidade.size(); i++){
                    manager.persist(entidade.get(i));
                }
            } else {
                throw new ModelException("Nenhuma entidade foi informada!");
            }
            return entidade;
        }catch (Exception e){
            throw new ModelException("Erro ao processar a requisição, verifique os dados submetido");
        }
    }

}

