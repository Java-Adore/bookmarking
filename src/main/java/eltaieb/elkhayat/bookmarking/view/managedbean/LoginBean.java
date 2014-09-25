/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eltaieb.elkhayat.bookmarking.view.managedbean;

import eltaieb.elkhayat.bookmarking.api.dao.AdvertisesDAO;
import eltaieb.elkhayat.bookmarking.api.daoimp.AdvertisesDAOImpl;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author orcl
 */
@ManagedBean
@SessionScoped
public class LoginBean implements Serializable{
    
    
    @ManagedProperty(value = "#{advertisesDAOImpl}")
    AdvertisesDAOImpl advertisesDAOImpl;
     
    private String output;

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }
    
   
 
    @PostConstruct
    public void init()
    {
        output=(advertisesDAOImpl==null)+" ";
    }

    public AdvertisesDAOImpl getAdvertisesDAOImpl() {
        return advertisesDAOImpl;
    }

    public void setAdvertisesDAOImpl(AdvertisesDAOImpl advertisesDAOImpl) {
        this.advertisesDAOImpl = advertisesDAOImpl;
    }
    
    
    
    
}
