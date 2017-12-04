/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.adsi.rest.services;

import co.edu.sena.adsi.jpa.entities.Usuarios;
import co.edu.sena.adsi.jpa.sessions.UsuariosFacade;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author yurani
 */
@Path("usuarios")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UsuariosREST {
    
    @EJB
    private UsuariosFacade usuariosEJB;
    
    @GET
    public List<Usuarios> findAll(){
        return usuariosEJB.findAll();                                                    
    }
    
    @GET 
    @Path("{id}")
    public Usuarios findById(@PathParam("id") Integer id){
        return usuariosEJB.find(id);
    }

    @POST
    public void create(Usuarios usuarios){
        usuariosEJB.create(usuarios);
    }
}
