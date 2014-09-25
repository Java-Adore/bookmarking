/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eltaieb.elkhayat.bookmarking.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author orcl
 */
@Path("/test")
public class Test {
    
    @GET
    public String test()
    {
        return "works fine";
    }
}
