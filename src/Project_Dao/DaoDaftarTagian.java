/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Project_Dao;

import Project_Entity.DaftarTagian;
import java.util.List;

/**
 *
 * @author Eidoyonatan
 */
public class DaoDaftarTagian extends DaoUtama{
       public DaftarTagian find(Long id) {
        return em.find(DaftarTagian.class, id);
    }
    
    public DaftarTagian find(String kode) {
        return (DaftarTagian) em.createQuery("SELECT s FROM DaftarTagian s "
                + "WHERE s.kode = :kode").setParameter("kode", kode).getSingleResult();
    }

    public List<DaftarTagian> finds() {
        return em.createQuery("SELECT s FROM DaftarTagian s").getResultList();
    }
    
}
