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
@Entity(name = "roles")
public class Role implements Serializable{
    @Id
    @Column(name = "role_id")
    @GeneratedValue
    private int roleId;

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleTitleKey() {
        return roleTitleKey;
    }

    public void setRoleTitleKey(String roleTitleKey) {
        this.roleTitleKey = roleTitleKey;
    }
        
    @Column(name = "role_title_key",nullable = false ,unique = true)
    private String roleTitleKey;
    
    
    
}
