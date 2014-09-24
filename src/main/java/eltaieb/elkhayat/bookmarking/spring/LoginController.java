/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eltaieb.elkhayat.bookmarking.spring;

import java.io.Serializable;
import javax.naming.AuthenticationException;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 *
 * @author orcl
 */
public class LoginController implements Serializable{
    
    	private AuthenticationManager authenticationManager;
	
//		try{
//		
//		 // check if userdata is given 
//		 if (getLoginBean().getUserName() == null || getLoginBean().getPassword() == null) {
//	            FacesMessage facesMsg = new FacesMessage(
//	            FacesMessage.SEVERITY_ERROR, "Error", "login.failed" );
//	            FacesContext.getCurrentInstance().addMessage(null, facesMsg);
//	            return null;
//	        }
//	       
//		 // authenticate afainst spring security
//		 Authentication request = new UsernamePasswordAuthenticationToken(
//				 getLoginBean().getUserName(), getLoginBean().getPassword());            
//	            
//	        Authentication result = authenticationManager.authenticate(request);
//	        SecurityContextHolder.getContext().setAuthentication(result);
//	 
//	    } catch (AuthenticationException e) {
//	        FacesMessage facesMsg = new FacesMessage(
//	            FacesMessage.SEVERITY_ERROR, "Error", "login.failed") ;
//	        FacesContext.getCurrentInstance().addMessage(null, facesMsg);
//	            
//	        return null;
//	    }
//	    return "success";
//		
//	}

    /**
     * the login action called by the view
     * @return
     */
    //	public String login() {
    public AuthenticationManager getAuthenticationManager() {
        return authenticationManager;
    }

    public void setAuthenticationManager(AuthenticationManager authenticationManager) {
        this.authenticationManager = authenticationManager;
    }

    
}
