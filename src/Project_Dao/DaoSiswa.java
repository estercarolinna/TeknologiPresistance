/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Project_Dao;

import Project_Entity.Siswa;
import java.util.List;

/**
 *
 * @author Eidoyonatan
 */
public class DaoSiswa extends DaoUtama{
      public Siswa find(Long id){
        return em.find(Siswa.class, id);
    }
    
    public Siswa find(String nis){
        return (Siswa) em.createQuery("SELECT e FROM Siswa e "
                + "WHERE e.nis = ?").setParameter(1, nis).getSingleResult();
    }
    
    public List<Siswa> finds(){
        return em.createQuery("SELECT p FROM Siswa p").getResultList();
    }
    
}
