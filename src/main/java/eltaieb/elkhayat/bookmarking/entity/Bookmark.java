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
import javax.persistence.ManyToOne;

/**
 *
 * @author orcl
 */
@Entity(name = "bookmarks")
public class Bookmark implements Serializable{
    @Id
    @Column(name = "bookmark_id")
    @GeneratedValue
    private int bookmarkId;
        
   private String bookmarkURL;
   
   @ManyToOne
   private User bookmarkOwner;
   
   @ManyToOne
   private Category bookmarkCategory;

    public int getBookmarkId() {
        return bookmarkId;
    }

    public void setBookmarkId(int bookmarkId) {
        this.bookmarkId = bookmarkId;
    }

    public String getBookmarkURL() {
        return bookmarkURL;
    }

    public void setBookmarkURL(String bookmarkURL) {
        this.bookmarkURL = bookmarkURL;
    }

    public User getBookmarkOwner() {
        return bookmarkOwner;
    }

    public void setBookmarkOwner(User bookmarkOwner) {
        this.bookmarkOwner = bookmarkOwner;
    }

    public Category getBookmarkCategory() {
        return bookmarkCategory;
    }

    public void setBookmarkCategory(Category bookmarkCategory) {
        this.bookmarkCategory = bookmarkCategory;
    }
    
    
}
