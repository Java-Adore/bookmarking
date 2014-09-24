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
@Entity(name = "categories")
public class Category implements Serializable{
    @Id
    @Column(name = "category_id")
    @GeneratedValue
    private int categoryId;
        
    @Column(name = "category_title_key",nullable = false ,unique = true)
    private String categoryTitleKey;

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryTitleKey() {
        return categoryTitleKey;
    }

    public void setCategoryTitleKey(String categoryTitleKey) {
        this.categoryTitleKey = categoryTitleKey;
    }
    
    
    
}
