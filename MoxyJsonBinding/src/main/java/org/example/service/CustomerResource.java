package org.example.service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.example.model.Customer;
import org.example.model.PhoneNumber;

@Stateless
@LocalBean
@Path("/customers")
public class CustomerResource {
 
    @GET
    @Produces({
        MediaType.APPLICATION_XML,
        MediaType.APPLICATION_JSON
    })
    @Path("{id}")
    public Customer read(@PathParam("id") int id) {
        Customer customer = new Customer();
        customer.setIdentifier(id);
        customer.setFirstName("Jane");
        customer.setLastName(null);
         
        PhoneNumber pn = new PhoneNumber();
        pn.setType("work");
        pn.setValue("5551111");
        customer.getPhoneNumbers().add(pn);
         
        return customer;
     }
 
}