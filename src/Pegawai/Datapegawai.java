/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pegawai;

/**
 *
 * @author Lab Informatika
 */
public class Datapegawai {
     private Integer id;
    private String nama;
    private String email;
    private String role;
    
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
    public String getemail(){
        return email;
    }
    public void setkelas(String email){
        this.email=email;
    }
    public String getrole(){
        return role;   
    }
    public void setMakanan(String role){
        this.role=role;
    }
}


