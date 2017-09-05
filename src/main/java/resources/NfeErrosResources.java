package resources;

import business.NfeErrosBusiness;
import daos.NfeErrosDao;
import entidades.NfeErros;
import entidades.NfeErrosEntidades;
import entidades.ResponseService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/errosNfe")
public class NfeErrosResources {

    @Inject
    private NfeErrosBusiness nfeBusiness;
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<NfeErrosEntidades> getAllErrosPendentes() {
        return nfeBusiness.getErrosAll();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response salvar(List<NfeErros> nfeErros) {
        List<ResponseService> erroSalvo = nfeBusiness.salvar(nfeErros);
        return Response.ok(erroSalvo).status(201).build();
    }
}
