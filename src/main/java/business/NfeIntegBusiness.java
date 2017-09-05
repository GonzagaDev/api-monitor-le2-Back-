package business;

import daos.NfeIntegDao;
import entidades.NfeInteg;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class NfeIntegBusiness {

    @Inject
    private NfeIntegDao dao;


    public List<NfeInteg> getprimeirosSete() {
               return dao.getSevenComWhere(" order by dt_consulta_oracle desc ", "");
    }
}


