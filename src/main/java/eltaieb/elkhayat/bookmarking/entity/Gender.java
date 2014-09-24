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
@Entity(name = "gender")
public class Gender implements Serializable{
    @Id
    @Column(name = "gender_id")
    @GeneratedValue
    private int genderId;
        
    @Column(name = "gender_title_key",nullable = false ,unique = true)
    private String genderTitleKey;

    public int getGenderId() {
        return genderId;
    }

    public void setGenderId(int genderId) {
        this.genderId = genderId;
    }

    public String getGenderTitleKey() {
        return genderTitleKey;
    }

    public void setGenderTitleKey(String genderTitleKey) {
        this.genderTitleKey = genderTitleKey;
    }
    
    
    
}
