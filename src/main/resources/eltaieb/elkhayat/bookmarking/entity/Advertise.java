/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eltaieb.elkhayat.bookmarking.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author orcl
 */
@Entity(name = "advertises")
public class Advertise implements Serializable{
    @Id
    @Column(name = "advertise_id")
    @GeneratedValue
    private int advertiseId;
        
   private String advertiseURL;
   
   private int advertiseType;

    public int getAdvertiseId() {
        return advertiseId;
    }

    public void setAdvertiseId(int advertiseId) {
        this.advertiseId = advertiseId;
    }

    public String getAdvertiseURL() {
        return advertiseURL;
    }

    public void setAdvertiseURL(String advertiseURL) {
        this.advertiseURL = advertiseURL;
    }

    public int getAdvertiseType() {
        return advertiseType;
    }

    public void setAdvertiseType(int advertiseType) {
        this.advertiseType = advertiseType;
    }
    
    
    
}
