/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistance;

import Persistance.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import logic.Gurdian;

/**
 *
 * @author marce
 */
public class GurdianJpaController implements Serializable {

    public GurdianJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
    public GurdianJpaController() {
        emf = Persistence.createEntityManagerFactory("DentalClinic_PU");
    }

    public void create(Gurdian gurdian) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(gurdian);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Gurdian gurdian) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            gurdian = em.merge(gurdian);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = gurdian.getId();
                if (findGurdian(id) == null) {
                    throw new NonexistentEntityException("The gurdian with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Gurdian gurdian;
            try {
                gurdian = em.getReference(Gurdian.class, id);
                gurdian.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The gurdian with id " + id + " no longer exists.", enfe);
            }
            em.remove(gurdian);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Gurdian> findGurdianEntities() {
        return findGurdianEntities(true, -1, -1);
    }

    public List<Gurdian> findGurdianEntities(int maxResults, int firstResult) {
        return findGurdianEntities(false, maxResults, firstResult);
    }

    private List<Gurdian> findGurdianEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Gurdian.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Gurdian findGurdian(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Gurdian.class, id);
        } finally {
            em.close();
        }
    }

    public int getGurdianCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Gurdian> rt = cq.from(Gurdian.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
