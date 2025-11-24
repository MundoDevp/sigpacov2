/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mundodevp.sigpaco.persistence;

import com.mundodevp.sigpaco.model.Instructor;
import com.mundodevp.sigpaco.persistence.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author mundodevp
 */
public class InstructorJpaController implements Serializable {

    public InstructorJpaController() {
        this.emf = Persistence.createEntityManagerFactory("sigpaco_pu");
    }
    
    

    public InstructorJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Instructor instructor) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(instructor);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Instructor instructor) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            instructor = em.merge(instructor);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = instructor.getId();
                if (findInstructor(id) == null) {
                    throw new NonexistentEntityException("The instructor with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Long id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Instructor instructor;
            try {
                instructor = em.getReference(Instructor.class, id);
                instructor.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The instructor with id " + id + " no longer exists.", enfe);
            }
            em.remove(instructor);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Instructor> findInstructorEntities() {
        return findInstructorEntities(true, -1, -1);
    }

    public List<Instructor> findInstructorEntities(int maxResults, int firstResult) {
        return findInstructorEntities(false, maxResults, firstResult);
    }

    private List<Instructor> findInstructorEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Instructor.class));
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

    public Instructor findInstructor(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Instructor.class, id);
        } finally {
            em.close();
        }
    }

    public int getInstructorCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Instructor> rt = cq.from(Instructor.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
