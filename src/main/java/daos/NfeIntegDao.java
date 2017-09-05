package daos;


import entidades.NfeInteg;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class NfeIntegDao {
    @PersistenceContext(unitName = "api_monitor_le2")
    private EntityManager manager;

    public List<NfeInteg> getSevenComWhere(String whereClause, Object parametro) {
        return manager.createQuery("SELECT nfe FROM NfeInteg nfe " + whereClause + parametro, NfeInteg.class)
        .setMaxResults(7).getResultList();
    }

}
