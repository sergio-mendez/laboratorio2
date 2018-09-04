/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.mueblesdelosalpes.servicios;

import co.edu.uniandes.csw.mueblesdelosalpes.dto.MuebleOferta;
import co.edu.uniandes.csw.mueblesdelosalpes.logica.interfaces.IServicioOfertaMockRemote;
import co.edu.uniandes.csw.mueblesdelosalpes.logica.interfaces.IServicioOfertaMockLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/Oferta")
@Stateless
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class OfertaService {
    @EJB
    private IServicioOfertaMockLocal OfertaEjb; 
    
    @GET
    @Path("ofertas")
    public List<MuebleOferta> getTodosLosMuebles() {
        return OfertaEjb.darMueblesOferta();
    }
    @POST
    @Path("agregar/")
    public List<MuebleOferta> agregarMuebles(List<MuebleOferta> mbO) {
        for (MuebleOferta muebleOferta : mbO) {
            OfertaEjb.agregarMuebleOferta(muebleOferta);
        }        
        return mbO;
    }    
}
