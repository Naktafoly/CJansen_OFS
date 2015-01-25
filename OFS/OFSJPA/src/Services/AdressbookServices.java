/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Dal.Addressbook;
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
public class AdressbookServices {
    
    public static List<Addressbook> GetAll(){
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("OFSJPAPU");
        EntityManager em = emf.createEntityManager();
        
        Query q = em.createNamedQuery("Addressbook.findAll");
        List<Addressbook> appointments = q.getResultList();       
        return appointments;
    }
    
    public static void Save(Addressbook addresbook){
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("OFSJPAPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction trans = em.getTransaction();
        
        trans.begin();
        em.persist(addresbook);
        trans.commit();
        em.close();
        emf.close();        
    }
    
    public static Addressbook GetByNaam(String naam){
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("OFSJPAPU");
        EntityManager em = emf.createEntityManager();
        
        Query q = em.createNamedQuery("Addressbook.findByNaam", Addressbook.class).setParameter("naam", naam);
        Addressbook addressbook = (Addressbook)q.getSingleResult();
        em.close();
        emf.close();
        return addressbook;
    }
    
    public static void Delete(int id){
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("OFSJPAPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction trans = em.getTransaction();
        
        Query q = em.createNamedQuery("Addressbook.findByNaamId", Addressbook.class).setParameter("afspraakId", id);
        Addressbook addresbook = (Addressbook) q.getSingleResult();
        trans.begin();
        em.remove(addresbook);
        trans.commit();
        em.close();
        emf.close();
    }
    
    public static void Update(){
        //Code voor update
    }
}
