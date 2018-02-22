/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mdin Ahlem
 */
public class User {

    private int id_user;
    private String nom;

    private String prenom;
    private int numero_tel;
    private int role;
    private Date date_naissance;

    private String email;
    // private User owner;
    private String adresse;
    private int num_tel;
    private int etat;
    private String password;
    private String login;
    private String image;
    private List<Patisserie> patisseries;

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getNumero_tel() {
        return numero_tel;
    }

    public void setNumero_tel(int numero_tel) {
        this.numero_tel = numero_tel;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public Date getDate_naissance() {
        return date_naissance;
    }

    public void setDate_naissance(Date date_naissance) {
        this.date_naissance = date_naissance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getNum_tel() {
        return num_tel;
    }

    public void setNum_tel(int num_tel) {
        this.num_tel = num_tel;
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<Patisserie> getPatisseries() {
        return patisseries;
    }

    public void setPatisseries(List<Patisserie> patisseries) {
        this.patisseries = patisseries;
    }

    public User(int id_user, String nom, String prenom, int numero_tel, int role, Date date_naissance, String email, String adresse, int num_tel, int etat, String password, String login, String image, List<Patisserie> patisseries) {
        this.id_user = id_user;
        this.nom = nom;
        this.prenom = prenom;
        this.numero_tel = numero_tel;
        this.role = role;
        this.date_naissance = date_naissance;
        this.email = email;
        this.adresse = adresse;
        this.num_tel = num_tel;
        this.etat = etat;
        this.password = password;
        this.login = login;
        this.image = image;
        this.patisseries = patisseries;
    }

}
