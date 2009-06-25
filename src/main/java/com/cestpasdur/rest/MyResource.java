package com.cestpasdur.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/myresource")
public class MyResource {

    @GET
    @Produces("text/plain")
    public String getIt() {
        return "Hi there!";
    }
    
    @GET
    @Produces("application/json")
    @Path("/1")
    public Personne getPersonne(){
        Personne personne = new Personne();
        personne.setNom("GOUYETTE");
        personne.setPrenom("Damien");
        return personne;
    }
    
    @GET
    @Produces("application/json")
    @Path("/all")
    public List<Personne> getPersonnes(){
        Personne personne1 = new Personne();
        personne1.setNom("GOUYETTE");
        personne1.setPrenom("Damien");
        Personne personne2 = new Personne();
        personne2.setNom("LARCHER");
        personne2.setPrenom("Lionel");
        List<Personne> listPersonne = new ArrayList<Personne>();
        listPersonne.add(personne1);
        listPersonne.add(personne2);
        return listPersonne;
    }

}
