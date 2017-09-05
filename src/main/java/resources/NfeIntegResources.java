package resources;


import business.NfeIntegBusiness;
import entidades.NfeInteg;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/nfeInteg")
public class NfeIntegResources {

    @Inject
    private NfeIntegBusiness nfeBusiness;
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<NfeInteg> getAllErrosPendentes() {
        return nfeBusiness.getprimeirosSete();
    }


}
