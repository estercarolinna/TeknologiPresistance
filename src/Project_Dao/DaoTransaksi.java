/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Project_Dao;

import Project_Entity.DaftarTagian;
import Project_Entity.Tingkatan;
import Project_Entity.Transaksi;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Eidoyonatan
 */
public class DaoTransaksi extends DaoUtama{
       public Transaksi find(Long id) {
        return em.find(Transaksi.class, id);
    }

    public List<Transaksi> finds() {
        return em.createQuery("SELECT pt FROM Transaksi pt").getResultList();
    }

    public List<Transaksi> finds(Tingkatan tingkatan) {
        Query q = em.createQuery("SELECT pt FROM Transaksi pt "
                + "WHERE pt.siswa.tingkatan.id = ?");
        q.setParameter(1, tingkatan.getId());
        return em.createQuery("SELECT pt FROM Transaksi pt").getResultList();
    }
    
    public List<Transaksi> finds(DaftarTagian daftarTagian) {
        Query q = em.createQuery("SELECT pt FROM Transaksi pt "
                + "WHERE pt.daftartagian.id = ?");
        q.setParameter(1, daftarTagian.getId());        
        return em.createQuery("SELECT pt FROM Transaksi pt").getResultList();
    }
    
    public List<Transaksi> finds(Tingkatan tingkatan, DaftarTagian daftarTagian) {
        Query q = em.createQuery("SELECT pt FROM Transaksi pt "
                + "WHERE pt.siswa.tingkatan.id = ? AND pt.daftartagian.id = ?");
        q.setParameter(1, tingkatan.getId());        
        q.setParameter(2, daftarTagian.getId());        
        return em.createQuery("SELECT pt FROM Transaksi pt").getResultList();
    }

    public Transaksi find(String kode) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
