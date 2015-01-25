/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Dal.Invoices;
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
public class InvoicesServices {
    
    public static List<Invoices> GetAll(){
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("OFSJPAPU");
        EntityManager em = emf.createEntityManager();
        
        Query q = em.createNamedQuery("Invoices.findAll");
        List<Invoices> invoices = q.getResultList();       
        return invoices;
    }
    
    public static void Save(Invoices invoice){
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("OFSJPAPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction trans = em.getTransaction();
        
        trans.begin();
        em.persist(invoice);
        trans.commit();
        em.close();
        emf.close();        
    }
    
    public static List<Invoices> GetByBetaald(Boolean b){
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("OFSJPAPU");
        EntityManager em = emf.createEntityManager();
        
        Query q = em.createNamedQuery("Invoices.findByBetaald", Invoices.class).setParameter("betaald", b);
        List<Invoices> invoices = q.getResultList();
        return invoices;
    }
    
    public static List<Invoices> GetByNaam(Boolean b){
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("OFSJPAPU");
        EntityManager em = emf.createEntityManager();
        
        Query q = em.createNamedQuery("Invoices.findByBetaald", Invoices.class).setParameter("betaald", b);
        List<Invoices> invoices = q.getResultList();
        return invoices;
    }
    
    public static void Delete(int id){
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("OFSJPAPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction trans = em.getTransaction();
        
        Query q = em.createNamedQuery("Invoices.findByFactuurId", Invoices.class).setParameter("factuurId", id);
        Invoices invoice = (Invoices) q.getSingleResult();
        trans.begin();
        em.remove(invoice);
        trans.commit();
        em.close();
        emf.close();
    }
    
    public static void Update(){
        //Code voor update
    }
    
}
