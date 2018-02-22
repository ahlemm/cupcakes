/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Mdin Ahlem
 */
public class Patisserie {

    private int id_patisserie;
    private String nom_patisserie;

    private int id_patissier;
    private String acitivite;
    private int numero_patisserie;
    private double longitude;
    private double latitude;
     private String horaire;
   private User patissier;
    private String info;
    private String adresse;
    private int etat_patisserie;

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

    public int getId_patissier() {
        return id_patissier;
    }

    public void setId_patissier(int id_patissier) {
        this.id_patissier = id_patissier;
    }

    public String getAcitivite() {
        return acitivite;
    }

    public void setAcitivite(String acitivite) {
        this.acitivite = acitivite;
    }

    public int getNumero_patisserie() {
        return numero_patisserie;
    }

    public void setNumero_patisserie(int numero_patisserie) {
        this.numero_patisserie = numero_patisserie;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public String getHoraire() {
        return horaire;
    }

    public void setHoraire(String horaire) {
        this.horaire = horaire;
    }

    public User getPatissier() {
        return patissier;
    }

    public void setPatissier(User patissier) {
        this.patissier = patissier;
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

    public Patisserie( String nom_patisserie, int id_patissier, String acitivite, int numero_patisserie, double longitude, double latitude, String horaire, User patissier, String info, String adresse, int etat_patisserie) {
        this.nom_patisserie = nom_patisserie;
        this.id_patissier = id_patissier;
        this.acitivite = acitivite;
        this.numero_patisserie = numero_patisserie;
        this.longitude = longitude;
        this.latitude = latitude;
        this.horaire = horaire;
        this.patissier = patissier;
        this.info = info;
        this.adresse = adresse;
        this.etat_patisserie = etat_patisserie;
    }

  
  
}
