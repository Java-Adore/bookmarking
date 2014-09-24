///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//package eltaieb.elkhayat.bookmarking.business.serviceimp;
//
//import eltaieb.elkhayat.bookmarking.api.dao.AdvertisesDAO;
//import eltaieb.elkhayat.bookmarking.api.exception.PersistanceException;
//import eltaieb.elkhayat.bookmarking.business.service.AdvertisesService;
//import eltaieb.elkhayat.bookmarking.entity.Advertise;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
///**
// *
// * @author orcl
// */
//@Service
//public class AdvertisesServiceImpl implements AdvertisesService {
//
//    @Autowired
//    AdvertisesDAO advertisesDAO;
//    
//    @Override
//    public Advertise persistAdvertise(Advertise advertise) {
//      return  advertisesDAO.persist(advertise);
//    }
//
//    @Override
//    public Advertise getAdvertise(Advertise advertise) {
//        return  advertisesDAO.get(advertise);    
//        }
//
//    @Override
//    public Advertise getAdvertise(int advertiseID) {
//       return getAdvertise(new Advertise(advertiseID));
//    }
//
//    @Override
//    public void deleteAdvertise(Advertise advertise) throws PersistanceException {
//        advertisesDAO.delete(advertise);
//    }
//    
//}
