/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Project_Dao;

import Project_Entity.Tingkatan;
import java.util.List;

/**
 *
 * @author Eidoyonatan
 */
public class DaoTingkatan extends DaoUtama{
        public Tingkatan find(Long id) {
        return em.find(Tingkatan.class, id);
    }
    
    public Tingkatan find(String kode) {
        return (Tingkatan) em.createQuery("SELECT pg FROM Tingkatan pg "
                + "WHERE pg.kode = ?").setParameter(1, kode).getSingleResult();
    }

    public List<Tingkatan> finds() {
        return em.createQuery("SELECT pg FROM Tingkatan pg").getResultList();
    }
    
}
