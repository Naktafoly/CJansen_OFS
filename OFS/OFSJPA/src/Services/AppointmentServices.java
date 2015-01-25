/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Dal.Appointments;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author School
 */
public class AppointmentServices {
    
    public static List<Appointments> GetAll(){
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("OFSJPAPU");
        EntityManager em = emf.createEntityManager();
        
        Query q = em.createNamedQuery("Appointments.findAll");
        List<Appointments> appointments = q.getResultList();       
        return appointments;
    }
    
    public static void Save(Appointments appointment){
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("OFSJPAPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction trans = em.getTransaction();
        
        trans.begin();
        em.persist(appointment);
        trans.commit();
        em.close();
        emf.close();        
    }
    
    public static List<Appointments> GetByNaam(String naam){
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("OFSJPAPU");
        EntityManager em = emf.createEntityManager();
        
        Query q = em.createNamedQuery("Appointments.findByNaam", Appointments.class).setParameter("naam", naam);
        List<Appointments> appointments = q.getResultList();
        return appointments;
    }
    
    public static void Delete(int id){
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("OFSJPAPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction trans = em.getTransaction();
        
        Query q = em.createNamedQuery("Appointments.findByAfspraakId", Appointments.class).setParameter("afspraakId", id);
        Appointments appointment = (Appointments) q.getSingleResult();
        trans.begin();
        em.remove(appointment);
        trans.commit();
        em.close();
        emf.close();
    }
    
    public static void Update(){
        //Code voor update
    }
}
