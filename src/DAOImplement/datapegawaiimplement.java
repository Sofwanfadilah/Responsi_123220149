/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImplement;
import Pegawai.Datapegawai;
import java.util.List;
import pegawai.*;
/**
 *
 * @author Lab Informatika
 */
public interface datapegawaiimplement {
     public void insert(Datapegawai p);
    public void update(Datapegawai p);
    public void delete(int Id);
    public List<Datapegawai>getALL();
    
}
