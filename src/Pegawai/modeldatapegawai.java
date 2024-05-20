/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pegawai;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Lab Informatika
 */
public class modeldatapegawai  extends AbstractTableModel {

   List<Datapegawai>db;
    public modeldatapegawai(List<Datapegawai>db){
        this.db=db;
    }
    @Override
    public int getRowCount() {
        return db.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    public String getColumnNama(int column){
        switch(column){
           case 0:
            return"ID";
           case 1:
            return"Nama";
           case 2:
            return"Email";
           case 3:
            return"Role";
           default:
               return null;
        }
            
    }
    
    @Override
    public Object getValueAt(int row, int column) {
        switch(column){
            case 0:
                return db.get(row).getId();
            case 1:
                return db.get(row).getnama();    
            case 2:
                return db.get(row).getemail();
            case 3:
                return db.get(row).getrole();
            default :
                return null;
        }
    }
    

}
