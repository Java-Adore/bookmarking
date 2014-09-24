/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eltaieb.elkhayat.bookmarking.api.exception;

/**
 *
 * @author orcl
 */
public class PersistanceException  extends Exception{
    
    private String customMessage;

    public PersistanceException() {
    }

    public PersistanceException(String customMessage) {
        this.customMessage = customMessage;
    }
    
    

    public String getCustomMessage() {
        return customMessage;
    }

    public void setCustomMessage(String customMessage) {
        this.customMessage = customMessage;
    }
    
}
