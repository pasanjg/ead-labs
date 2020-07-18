/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.ejb.EJB;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author chath
 */
@Path("scanplate")
public class AnalyzeNumber {

    @Context
    private UriInfo context;

    @EJB
    PlateNumberManager pnm;
    /**
     * Creates a new instance of AnalyzeNumber
     */
    public AnalyzeNumber() {
    }

    /**
     * Retrieves representation of an instance of beans.AnalyzeNumber
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String getHtml() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of AnalyzeNumber
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.TEXT_HTML)
    public void putHtml(String content) {
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.TEXT_HTML)
    public String getCategoryPost(@FormParam("regnum") String registration){
        return "<h2> Required Driving License Category : "+pnm.getDLCategory(registration)+"</h2>";
    }
    
    @GET
    @Path("getcategory")
    @Produces(MediaType.TEXT_HTML)
    public String getCategoryParams(@QueryParam("regnum")@DefaultValue("CBE1234")String registration){
    return "<h2> Required Driving License Category :"+pnm.getDLCategory(registration)+"</h2>";
    }
    
    @GET
    @Path("{regnum}")
    @Produces(MediaType.TEXT_HTML)
    public String getCategoryPath(@PathParam("regnum")String registration){
        return "<h2> Required Driving License Category :"+pnm.getDLCategory(registration)+"</h2>";
    }
}
