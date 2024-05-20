/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImplement;
import java.util.List;
import ZOO.*;

/**
 *
 * @author Lab Informatika
 */
public interface datahewanimplement {
    public void insert(Datahewan p);
    public void update(Datahewan p);
    public void delete(int Id);
    public List<Datahewan>getALL();
    
}
