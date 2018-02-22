/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entite;

/**
 *
 * @author Mdin Ahlem
 */
public class Formation { 
     private int id_formation;
    private int id_user;
    private String info;
    private double prix; 

    public int getId_formation() {
        return id_formation;
    }

    public void setId_formation(int id_formation) {
        this.id_formation = id_formation;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public Formation() {
    }

    public Formation(int id_user, String info, double prix) {
        this.id_user = id_user;
        this.info = info;
        this.prix = prix;
    }

    public Formation(int id_formation, int id_user, String info, double prix) {
        this.id_formation = id_formation;
        this.id_user = id_user;
        this.info = info;
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Formation{" + "id_formation=" + id_formation + ", id_user=" + id_user + ", info=" + info + ", prix=" + prix + '}';
    }
    
    
}
