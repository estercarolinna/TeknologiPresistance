/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Project_Dao;

import Project_Entity.EntityUtama;
import Project_koneksi.Koneksi;
import javax.persistence.EntityManager;

/**
 *
 * @author Eidoyonatan
 */
public class DaoUtama {
    protected EntityManager em = Koneksi.getKoneksi().getEntityManager();

    public void insert(EntityUtama p) {
        try {
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update(EntityUtama p) {
        try {
            em.getTransaction().begin();
            em.merge(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(EntityUtama p) {
        try {
            em.getTransaction().begin();
            em.remove(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }    
    
}
