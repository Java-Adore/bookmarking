/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eltaieb.elkhayat.bookmarking.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author orcl
 */
@Entity(name = "users")
public class User implements Serializable{
    @Id
    @Column(name = "user_id")
    @GeneratedValue
    private int userId;
    
    private String firstName;
    
    private String lastName;
    
    private String email ;
    
    private String password;
    
    
    
    @ManyToOne
    private Gender gender;
 
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date birthdate;
    
    @ManyToOne
    private Role userRole;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Role getUserRole() {
        return userRole;
    }

    public void setUserRole(Role userRole) {
        this.userRole = userRole;
    }

    public List<Advertise> getAdvertises() {
        return advertises;
    }

    public void setAdvertises(List<Advertise> advertises) {
        this.advertises = advertises;
    }

    public List<Bookmark> getUserBookmarks() {
        return userBookmarks;
    }

    public void setUserBookmarks(List<Bookmark> userBookmarks) {
        this.userBookmarks = userBookmarks;
    }
    
    @ManyToMany
   private List<Advertise> advertises;
   
    @ManyToMany
    private List<Bookmark> userBookmarks;
    
}
