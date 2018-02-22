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
public class Patisserie {

    private int id_patisserie;
    private int id_patissier;
    private String nom_patisserie;

   
    private String acitivite;
   
   

    private String info;
    private String adresse;
    private int etat_patisserie;

    public Patisserie() {
    }

    public Patisserie(int id_patissier, String nom_patisserie, String acitivite, String info, String adresse, int etat_patisserie) {
        this.id_patissier = id_patissier;
        this.nom_patisserie = nom_patisserie;
        this.acitivite = acitivite;
        this.info = info;
        this.adresse = adresse;
        this.etat_patisserie = etat_patisserie;
    }

    public int getId_patisserie() {
        return id_patisserie;
    }

    public void setId_patisserie(int id_patisserie) {
        this.id_patisserie = id_patisserie;
    }

    public int getId_patissier() {
        return id_patissier;
    }

    public void setId_patissier(int id_patissier) {
        this.id_patissier = id_patissier;
    }

    public String getNom_patisserie() {
        return nom_patisserie;
    }

    public void setNom_patisserie(String nom_patisserie) {
        this.nom_patisserie = nom_patisserie;
    }

    public String getAcitivite() {
        return acitivite;
    }

    public void setAcitivite(String acitivite) {
        this.acitivite = acitivite;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getEtat_patisserie() {
        return etat_patisserie;
    }

    public void setEtat_patisserie(int etat_patisserie) {
        this.etat_patisserie = etat_patisserie;
    }

    @Override
    public String toString() {
        return "Patisserie{" + "id_patisserie=" + id_patisserie + ", id_patissier=" + id_patissier + ", nom_patisserie=" + nom_patisserie + ", acitivite=" + acitivite + ", info=" + info + ", adresse=" + adresse + ", etat_patisserie=" + etat_patisserie + '}';
    }
    


  
  
}
