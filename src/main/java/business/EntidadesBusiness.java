package business;


import daos.EntidadesDao;
import entidades.Entidade;
import entidades.ResponseService;
import exceptions.ModelException;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class EntidadesBusiness {
    private static final String tokenAcess = "4049747126608813330L";

    @Inject
    private EntidadesDao dao;
    public List<Entidade> salvar(List<Entidade> entidades) {
        for (int i = 0; i < entidades.size(); i++) {

        }
        List<Entidade> entidadeSalva = dao.salvar(entidades);
        return entidadeSalva;
    }

    public List<Entidade> getAll() {
        return dao.getAll();
    }

    public String deleteById(Integer idEntidade){
        try {
            dao.deletar(idEntidade);
            return "Entidade Removida com sucesso!";
        } catch (ModelException e) {
            return "Erro remover entidade: ";
        }
    }
    public  List<ResponseService> refreshEntidades(String token, List<Entidade>  entidade){
        ResponseService rs = new ResponseService();
        List<ResponseService> response= new ArrayList<>();
        rs.setData(entidade);
        if(token.trim().equals(tokenAcess)) {
            try {
                dao.refresh(token, entidade);
                rs.setSucess("true");
                rs.setmessage("Lote processado com sucesso!");
            } catch (ModelException e) {
                rs.setSucess("false");
                rs.setmessage(e.getMessage());
            }catch (Exception e2){
                rs.setSucess("false");
                rs.setmessage("Ocorreu um erro ao processar a requisição, verifique os atributos submetido" );
            }
            response.add(rs);
            return response ;
        }else{
            rs.setSucess("false");
            rs.setmessage("Acesso negado, para realizar esta operação deverá ser informado o token de acesso!");
            response.add(rs);
            return response ;

        }
    }
}
