package resources;

import business.EntidadesBusiness;
import entidades.Entidade;
import entidades.ResponseService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/entidades")
public class EntidadesResources {

    @Inject
    private EntidadesBusiness entidadeBusiness;

    @DELETE
    @Path("/{id}")
    public Response deletar(@PathParam("id") Integer idEntidade) {
            entidadeBusiness.deleteById(idEntidade);
            return Response.ok("Entidade Removida com sucesso!").build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Entidade> getAll() {
        return entidadeBusiness.getAll();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response salvar(List<Entidade>  entidade) {
        List<Entidade>  entidadeSalva = entidadeBusiness.salvar(entidade);
        return Response.ok(entidadeSalva).status(201).build();
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{token}")
    public Response refreshEntidades( @PathParam("token") String token, List<Entidade>  entidade) {
        return Response.ok(entidadeBusiness.refreshEntidades(token, entidade)).build();
    }
}