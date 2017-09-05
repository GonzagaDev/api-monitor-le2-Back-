package business;

import daos.NfeErrosDao;
import entidades.NfeErros;
import entidades.NfeErrosEntidades;
import entidades.ResponseService;
import util.UtilConvert;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

@Stateless
public class NfeErrosBusiness {

    @Inject
    private NfeErrosDao dao;
    public List<ResponseService> salvar(List<NfeErros> nfeErros) {
        ResponseService rs = new ResponseService();
        List<ResponseService> response= new ArrayList<>();
        for (int i = 0; i < nfeErros.size(); i++) {
            if (nfeErros.get(i).getDescartado() == null) {
                nfeErros.get(i).setDescartado("N");
            }
            if (nfeErros.get(i).getDtConsultaOracle() == null ) {
                nfeErros.get(i).setDtConsultaOracle(new Date(System.currentTimeMillis()));
            }
            rs.setData(nfeErros.get(i));
            if(nfeErros.get(i).getiEntidades()== null){
                nfeErros.get(i).setiEntidades(0);
                rs.setSucess("false");
                rs.setmessage("Atributo [i_entidades] é obrigatório!");
            }else{
                rs.setSucess("true");
                rs.setmessage("Registro processado com sucesso!");
            }
            dao.salvar(nfeErros.get(i));
            response.add(rs);
            rs = new ResponseService();
        }

        return response;
    }

    public List<NfeErrosEntidades> getErrosAll() {
               return dao.getErrosEntidadesComWhere("WHERE", " descartado = 'N' order by i_entidades ");
    }
}


