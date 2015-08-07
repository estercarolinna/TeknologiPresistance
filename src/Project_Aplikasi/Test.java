/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Project_Aplikasi;

import Project_Dao.DaoTingkatan;
import Project_Entity.Tingkatan;

/**
 *
 * @author Eidoyonatan
 */
public class Test {
    public static void main(String[] args) {
        Tingkatan tingkatan = new Tingkatan();
        tingkatan.setKode("T1");
        tingkatan.setTingkatan("Tingkat 1");
        
        DaoTingkatan daoTingkatan = new DaoTingkatan();
        daoTingkatan.insert(tingkatan);
        
  
    }
}
