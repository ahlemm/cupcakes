/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entite;

import java.util.Objects;

/**
 *
 * @author Mdin Ahlem
 */
public class Patisserie {

    private int id_patisserie;
    private String nom_patisserie;

    private String acitivite;
       private String info_patisserie;

   private Double longitude;
      private Double latitude;


    private String adresse_patisserie;
    private int etat_patisserie;
    private User patissier;

    public Patisserie() {
    }

    public Patisserie(String nom_patisserie, String acitivite, String info_patisserie, Double longitude, Double latitude, String adresse_patisserie, int etat_patisserie, User patissier) {
        this.nom_patisserie = nom_patisserie;
        this.acitivite = acitivite;
        this.info_patisserie = info_patisserie;
        this.longitude = longitude;
        this.latitude = latitude;
        this.adresse_patisserie = adresse_patisserie;
        this.etat_patisserie = etat_patisserie;
        this.patissier = patissier;
    }
    

    public Patisserie(int id_patisserie, String nom_patisserie, String acitivite, String info_patisserie, Double longitude, Double latitude, String adresse_patisserie, int etat_patisserie, User patissier) {
        this.id_patisserie = id_patisserie;
        this.nom_patisserie = nom_patisserie;
        this.acitivite = acitivite;
        this.info_patisserie = info_patisserie;
        this.longitude = longitude;
        this.latitude = latitude;
        this.adresse_patisserie = adresse_patisserie;
        this.etat_patisserie = etat_patisserie;
        this.patissier = patissier;
    }

    public int getId_patisserie() {
        return id_patisserie;
    }

    public void setId_patisserie(int id_patisserie) {
        this.id_patisserie = id_patisserie;
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

    public String getInfo_patisserie() {
        return info_patisserie;
    }

    public void setInfo_patisserie(String info_patisserie) {
        this.info_patisserie = info_patisserie;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public String getAdresse_patisserie() {
        return adresse_patisserie;
    }

    public void setAdresse_patisserie(String adresse_patisserie) {
        this.adresse_patisserie = adresse_patisserie;
    }

    public int getEtat_patisserie() {
        return etat_patisserie;
    }

    public void setEtat_patisserie(int etat_patisserie) {
        this.etat_patisserie = etat_patisserie;
    }

    public User getPatissier() {
        return patissier;
    }

    public void setPatissier(User patissier) {
        this.patissier = patissier;
    }

    @Override
    public String toString() {
        return "Patisserie{" + "id_patisserie=" + id_patisserie + ", nom_patisserie=" + nom_patisserie + ", acitivite=" + acitivite + ", info_patisserie=" + info_patisserie + ", longitude=" + longitude + ", latitude=" + latitude + ", adresse_patisserie=" + adresse_patisserie + ", etat_patisserie=" + etat_patisserie + ", patissier=" + patissier + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Patisserie other = (Patisserie) obj;
        if (this.id_patisserie != other.id_patisserie) {
            return false;
        }
        if (this.etat_patisserie != other.etat_patisserie) {
            return false;
        }
        if (!Objects.equals(this.nom_patisserie, other.nom_patisserie)) {
            return false;
        }
        if (!Objects.equals(this.acitivite, other.acitivite)) {
            return false;
        }
        if (!Objects.equals(this.info_patisserie, other.info_patisserie)) {
            return false;
        }
        if (!Objects.equals(this.adresse_patisserie, other.adresse_patisserie)) {
            return false;
        }
        if (!Objects.equals(this.longitude, other.longitude)) {
            return false;
        }
        if (!Objects.equals(this.latitude, other.latitude)) {
            return false;
        }
        if (!Objects.equals(this.patissier, other.patissier)) {
            return false;
        }
        return true;
    }
    
    
    
}