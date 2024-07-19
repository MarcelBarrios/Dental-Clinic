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
import logic.Dentist;
import logic.Shift;

/**
 *
 * @author marce
 */
public class ShiftJpaController implements Serializable {

    public ShiftJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public ShiftJpaController() {
        emf = Persistence.createEntityManagerFactory("DentalClinic_PU");
    }
    
    public void create(Shift shift) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Dentist dentis = shift.getDentis();
            if (dentis != null) {
                dentis = em.getReference(dentis.getClass(), dentis.getId());
                shift.setDentis(dentis);
            }
            em.persist(shift);
            if (dentis != null) {
                dentis.getShiftList().add(shift);
                dentis = em.merge(dentis);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Shift shift) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Shift persistentShift = em.find(Shift.class, shift.getId_shift());
            Dentist dentisOld = persistentShift.getDentis();
            Dentist dentisNew = shift.getDentis();
            if (dentisNew != null) {
                dentisNew = em.getReference(dentisNew.getClass(), dentisNew.getId());
                shift.setDentis(dentisNew);
            }
            shift = em.merge(shift);
            if (dentisOld != null && !dentisOld.equals(dentisNew)) {
                dentisOld.getShiftList().remove(shift);
                dentisOld = em.merge(dentisOld);
            }
            if (dentisNew != null && !dentisNew.equals(dentisOld)) {
                dentisNew.getShiftList().add(shift);
                dentisNew = em.merge(dentisNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = shift.getId_shift();
                if (findShift(id) == null) {
                    throw new NonexistentEntityException("The shift with id " + id + " no longer exists.");
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
            Shift shift;
            try {
                shift = em.getReference(Shift.class, id);
                shift.getId_shift();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The shift with id " + id + " no longer exists.", enfe);
            }
            Dentist dentis = shift.getDentis();
            if (dentis != null) {
                dentis.getShiftList().remove(shift);
                dentis = em.merge(dentis);
            }
            em.remove(shift);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Shift> findShiftEntities() {
        return findShiftEntities(true, -1, -1);
    }

    public List<Shift> findShiftEntities(int maxResults, int firstResult) {
        return findShiftEntities(false, maxResults, firstResult);
    }

    private List<Shift> findShiftEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Shift.class));
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

    public Shift findShift(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Shift.class, id);
        } finally {
            em.close();
        }
    }

    public int getShiftCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Shift> rt = cq.from(Shift.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
