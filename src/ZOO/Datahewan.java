/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZOO;

/**
 *
 * @author Lab Informatika
 */
public class Datahewan {
    private Integer id;
    private String nama;
    private String kelas;
    private String makanan;
    
    public Integer getId(){
        return id;
    }
    public void setId(Integer Id){
        this.id=id;
    }    
    public String getnama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama=nama;
    }
    public String getkelas(){
        return kelas;
    }
    public void setkelas(String kelas){
        this.kelas=kelas;
    }
    public String getmakanan(){
        return makanan;   
    }
    public void setMakanan(String makanan){
        this.makanan=makanan;
    }
}
