/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Project_koneksi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Eidoyonatan
 */
public class Koneksi {
    private static Koneksi obj;
    private EntityManagerFactory emf;
    private EntityManager entityManager;

    public EntityManager getEntityManager() {
        if (entityManager == null) {
            emf = Persistence.createEntityManagerFactory("TRPersistence_AdminitrasiSekolahPU");
            entityManager = emf.createEntityManager();
        }
        return entityManager;
    }
    
    public static Koneksi getKoneksi() {
        if (obj == null) {
            obj = new Koneksi();
        }
        return obj;
    }
    
    public void close(){
        entityManager.close();
        emf.close();
    }
    
}
