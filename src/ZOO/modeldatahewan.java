/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZOO;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Lab Informatika
 */
public class modeldatahewan extends AbstractTableModel{
 
    List<Datahewan>db;
    public modeldatahewan(List<Datahewan>db){
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
            return"kelas";
           case 3:
            return"Makanan";
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
                return db.get(row).getkelas();
            case 3:
                return db.get(row).getmakanan();
            default :
                return null;
        }
    }
    

}