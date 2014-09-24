
import eltaieb.elkhayat.bookmarking.api.daoimp.AdvertisesDAOImpl;
import eltaieb.elkhayat.bookmarking.api.exception.PersistanceException;
import eltaieb.elkhayat.bookmarking.entity.Advertise;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author orcl
 */
public class Home {
    
    public Home()
    {
                ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
                
            Advertise advertise=    new Advertise(6);
            advertise.setAdvertiseURL("ssss");
        try {
 ((AdvertisesDAOImpl)context.getBean("advertisingDAO")).delete(advertise);
        } catch (PersistanceException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    public static void main(String [] args)
    {
            new Home();
    }
}
