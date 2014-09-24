/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eltaieb.elkhayat.bookmarking.business.service;

import eltaieb.elkhayat.bookmarking.api.exception.PersistanceException;
import eltaieb.elkhayat.bookmarking.entity.Advertise;

/**
 *
 * @author orcl
 */
public interface AdvertisesService {
        
    Advertise persistAdvertise(Advertise advertise);
    Advertise getAdvertise(Advertise advertise);
    Advertise getAdvertise(int advertiseID);
    void deleteAdvertise(Advertise advertise) throws PersistanceException;
    
}
