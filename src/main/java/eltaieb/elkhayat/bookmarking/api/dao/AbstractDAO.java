/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eltaieb.elkhayat.bookmarking.api.dao;

import eltaieb.elkhayat.bookmarking.api.exception.PersistanceException;
import java.io.Serializable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

/**
 *
 * @author orcl
 */
public class AbstractDAO <T extends Serializable>{
    
    @Autowired
    HibernateTemplate hibernateTemplate; 
   @Autowired
    TransactionTemplate transactionTemplate;
    
    
    public T persist(final T serializedObjectToPersist)
    {
        try
        {
            T result = transactionTemplate.execute(new TransactionCallback<T>() {

                @Override
                public T doInTransaction(TransactionStatus ts) {
                    
                    hibernateTemplate.saveOrUpdate(serializedObjectToPersist);
                    return serializedObjectToPersist;
                }
            });
            return result;
        }catch(Exception ex)
        {
            ex.printStackTrace();
            return null;
        }
    
    }
    
    public void delete(final T serializedObjectToPersist) throws PersistanceException
    {
        try
        {
           transactionTemplate.execute(new TransactionCallback<T>() {

                @Override
                public T doInTransaction(TransactionStatus ts) {
                    
                    hibernateTemplate.delete(serializedObjectToPersist);
                    return serializedObjectToPersist;
                }
            });
            
        }catch(Exception ex)
        {
            throw new PersistanceException("unableToDelete");
        }
    
    }
    
    
    public T get(Class objectClass, int id) throws PersistanceException
    {
        try
        {
            return(T) hibernateTemplate.get(objectClass, id);
        }catch(Exception ex)
        {
            ex.printStackTrace();
            return null;
        }
    
    }
    
    
}
