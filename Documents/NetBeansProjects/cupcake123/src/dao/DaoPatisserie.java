 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Patisserie;

import entity.User;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
//import utils.DataSource;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 3D-Artist
 */
public class DaoPatisserie {
    
    private final Connection cnx;
    private static DaoPatisserie instance;
    
    private DaoPatisserie() {
        cnx = DataSource.getInstance().getConnection();
    }
    
    public static DaoPatisserie getInstance()
        {if (instance == null) {
            instance = new DaoPatisserie();
        }
        return instance;   
        }
    
    

    
    
   public boolean AjouterAgence(Patisserie patisserie)
   {
       int test;
       boolean mission; 
        try{  
            String requete="insert into patisserie set id_patisserie=?, nom_patisserie=?,acitivite=?,numero_patisserie=?, longitude=?,latitude=?,horaire=?, info=?, adresse=?, etat_patisserie=?";
                    
            PreparedStatement pst = cnx.prepareStatement(requete);
            pst.setInt(1,patisserie.getId_patisserie());

            pst.setString(2,patisserie.getNom_patisserie());
            pst.setString(3,patisserie.getAcitivite());
            pst.setInt(4,patisserie.getNumero_patisserie());
            pst.setDouble(5,patisserie.getLongitude());
            pst.setDouble(6,patisserie.getLatitude());
            pst.setString(7,patisserie.getHoraire());
            pst.setString(8,patisserie.getInfo());
            pst.setString(9,patisserie.getAdresse());
            pst.setInt(10,patisserie.getEtat_patisserie());

           
                       
            test= pst.executeUpdate();
        }         
        catch (SQLException ex) {
                  Logger.getLogger(DaoPatisserie.class.getName()).log(Level.SEVERE, null, ex);
                  return false;
              }
        if (test == 0){mission=false;}
        else {mission=true;}
        return mission;
   }
   
   
 
    public Patisserie getAgenceById(int id){
        Agence ag = new Agence();
        String requete="select * from agence where id_agence="+id;
        int count = 0;
        try {
            Statement st = cnx.createStatement();
            ResultSet rsl = st.executeQuery(requete);
            
            while(rsl.next()){
                count ++;
                ag.setId_agence(rsl.getInt(1));
                ag.setNom_agence(rsl.getString(2));
                ag.setTelephone_agence(rsl.getInt(3));
                ag.setType_agence(rsl.getString(4));
                ag.setHoraire_travail(rsl.getString(5));
                ag.setPhoto_agence(rsl.getString(6));
                int idOwner = rsl.getInt(7);
                DaoUser daoUser = DaoUser.getInstance();
                ag.setOwner(daoUser.findUserById(idOwner));
                ag.setPiece_justificatif(rsl.getString(8));
                ag.setRue(rsl.getString(9));
                
                ag.setCode_postal(rsl.getInt(10));
                ag.setVille(rsl.getString(11));
                ag.setLatitude(rsl.getDouble(13));
                ag.setLongitude(rsl.getDouble(14));
                ag.setApprouved(rsl.getBoolean(15));
                
            }
            if(count == 0){
                return null;
            }else{
                return ag;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoAgence.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    
    public Agence getAgenceByName(String name){
        Agence ag = new Agence();
        String requete="select * from agence where nom_agence='"+name+"'";
        int count = 0;
        try {
            Statement st = cnx.createStatement();
            ResultSet rsl = st.executeQuery(requete);
            
            while(rsl.next()){
                count ++;
                ag.setId_agence(rsl.getInt(1));
                ag.setNom_agence(rsl.getString(2));
                ag.setTelephone_agence(rsl.getInt(3));
                ag.setType_agence(rsl.getString(4));
                ag.setHoraire_travail(rsl.getString(5));
                ag.setPhoto_agence(rsl.getString(6));
                int idOwner = rsl.getInt(7);
                DaoUser daoUser = DaoUser.getInstance();
                ag.setOwner(daoUser.findUserById(idOwner));
                ag.setPiece_justificatif(rsl.getString(8));
                ag.setRue(rsl.getString(9));
                
                ag.setCode_postal(rsl.getInt(10));
                ag.setVille(rsl.getString(11));
                ag.setLatitude(rsl.getDouble(13));
                ag.setLongitude(rsl.getDouble(14));
                ag.setApprouved(rsl.getBoolean(15));
                
            }
            if(count == 0){
                return null;
            }else{
                return ag;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoAgence.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
          
             
        
   
    public boolean ModifierPatisserie(Patisserie patisserie)
    {
        int cpt;
            String requete="insert into patisserie set id_patisserie=?, nom_patisserie=?,acitivite=?,numero_patisserie=?, longitude=?,latitude=?,horaire=?, info=?, adresse=?, etat_patisserie=?";
        try{
                      
            PreparedStatement pst = cnx.prepareStatement(requete);
            pst.setInt(1,patisserie.getId_patisserie());

            pst.setString(2,patisserie.getNom_patisserie());
            pst.setString(3,patisserie.getAcitivite());
            pst.setInt(4,patisserie.getNumero_patisserie());
            pst.setDouble(5,patisserie.getLongitude());
            pst.setDouble(6,patisserie.getLatitude());
            pst.setString(7,patisserie.getHoraire());
            pst.setString(8,patisserie.getInfo());
            pst.setString(9,patisserie.getAdresse());
            pst.setInt(10,patisserie.getEtat_patisserie());

        }
        catch (SQLException ex) {
            Logger.getLogger(DaoPatisserie.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        if(cpt ==0){
            return false;
        }
        else{
            return true;
        }
  }
        

    public boolean SupprimerAgence (int id)
    {
        int test=0;
        boolean mission;
        try{
            List<Voiture> voitures = new ArrayList<>();
            voitures = DaoVoiture.getInstance().getAllByAgence(id);
            if(voitures != null){
                for(int i=0;i<voitures.size();i++){
                    DaoVoiture.getInstance().Supprimervoiture(voitures.get(i).getMatricule());
                }
            }
            
            List<Chauffeur> chauffeurs = new ArrayList<>();
            chauffeurs = DaoChauffeur.getInstance().getAllByAgence(id);
            if(chauffeurs != null){
                for(int j=0; j<chauffeurs.size();j++){
                    DaoChauffeur.getInstance().supprimerChauffeur(chauffeurs.get(j).getId());
                }
            }
            
            PreparedStatement pst = cnx.prepareStatement("delete from agence where id_agence="+id); 
            test= pst.executeUpdate();
        }
        catch (SQLException ex)
        {
            Logger.getLogger(DaoAgence.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (test == 0)
        {
            mission=false;
        }else{
            mission=true;
        }
        return mission ;
    }
    
    
    
    public List<Agence> getAgencesByManagerID(int idManager)
    {
        List<Agence> listAgences = new ArrayList<>();
        try {
            String requete = "select * from agence where id_manager="+idManager;
            Statement st = cnx.createStatement();
            ResultSet rsl = st.executeQuery(requete);
            
            while(rsl.next()){
                Agence ag = new Agence();
                
                ag.setId_agence(rsl.getInt(1));
                ag.setNom_agence(rsl.getString(2));
                ag.setTelephone_agence(rsl.getInt(3));
                ag.setType_agence(rsl.getString(4));
                ag.setHoraire_travail(rsl.getString(5));
                ag.setPhoto_agence(rsl.getString(6));
                int idOwner = rsl.getInt(7);
                DaoUser daoUser = DaoUser.getInstance();
                ag.setOwner(daoUser.findUserById(idOwner));
                ag.setPiece_justificatif(rsl.getString(8));
                ag.setRue(rsl.getString(9));
                
                ag.setCode_postal(rsl.getInt(10));
                ag.setVille(rsl.getString(11));
                ag.setLatitude(rsl.getDouble(13));
                ag.setLongitude(rsl.getDouble(14));
                ag.setApprouved(rsl.getBoolean(15));
                
                listAgences.add(ag);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DaoUser.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return listAgences;
    }
    
    
    public List<Agence> getAllAgences()
    {
        List<Agence> listAgences = new ArrayList<>();
        try {
            String requete = "select * from agence";
            Statement st = cnx.createStatement();
            ResultSet rsl = st.executeQuery(requete);
            
            while(rsl.next()){
                Agence ag = new Agence();
                
                ag.setId_agence(rsl.getInt(1));
                ag.setNom_agence(rsl.getString(2));
                ag.setTelephone_agence(rsl.getInt(3));
                ag.setType_agence(rsl.getString(4));
                ag.setHoraire_travail(rsl.getString(5));
                ag.setPhoto_agence(rsl.getString(6));
                int idOwner = rsl.getInt(7);
                DaoUser daoUser = DaoUser.getInstance();
                ag.setOwner(daoUser.findUserById(idOwner));
                ag.setPiece_justificatif(rsl.getString(8));
                ag.setRue(rsl.getString(9));
                
                ag.setCode_postal(rsl.getInt(10));
                ag.setVille(rsl.getString(11));
                ag.setLatitude(rsl.getDouble(13));
                ag.setLongitude(rsl.getDouble(14));
                ag.setApprouved(rsl.getBoolean(15));
                
                listAgences.add(ag);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DaoUser.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return listAgences;
    }
    
    
    public List<Agence> searchAgenceByNameByVilleByRue(String name, String ville, String rue)
    {
        List<Agence> listAgences = new ArrayList<>();
        try {
            String requete = "select * from agence where nom_agence LIKE '%"+name+"%' or ville LIKE '%"+ville+"%' or rue LIKE '%"+rue+"%'";
            Statement st = cnx.createStatement();
            ResultSet rsl = st.executeQuery(requete);
            
            while(rsl.next()){
                Agence ag = new Agence();
                
                ag.setId_agence(rsl.getInt(1));
                ag.setNom_agence(rsl.getString(2));
                ag.setTelephone_agence(rsl.getInt(3));
                ag.setType_agence(rsl.getString(4));
                ag.setHoraire_travail(rsl.getString(5));
                ag.setPhoto_agence(rsl.getString(6));
                int idOwner = rsl.getInt(7);
                DaoUser daoUser = DaoUser.getInstance();
                ag.setOwner(daoUser.findUserById(idOwner));
                ag.setPiece_justificatif(rsl.getString(8));
                ag.setRue(rsl.getString(9));
                
                ag.setCode_postal(rsl.getInt(10));
                ag.setVille(rsl.getString(11));
                ag.setLatitude(rsl.getDouble(13));
                ag.setLongitude(rsl.getDouble(14));
                ag.setApprouved(rsl.getBoolean(15));
                
                listAgences.add(ag);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DaoUser.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return listAgences;
    }
    
    
    public List<Agence> getAllAgencesNonApprouved()
    {
        List<Agence> listAgences = new ArrayList<>();
        try {
            String requete = "select * from agence where approuved=0";
            Statement st = cnx.createStatement();
            ResultSet rsl = st.executeQuery(requete);
            
            while(rsl.next()){
                Agence ag = new Agence();
                
                ag.setId_agence(rsl.getInt(1));
                ag.setNom_agence(rsl.getString(2));
                ag.setTelephone_agence(rsl.getInt(3));
                ag.setType_agence(rsl.getString(4));
                ag.setHoraire_travail(rsl.getString(5));
                ag.setPhoto_agence(rsl.getString(6));
                int idOwner = rsl.getInt(7);
                DaoUser daoUser = DaoUser.getInstance();
                ag.setOwner(daoUser.findUserById(idOwner));
                ag.setPiece_justificatif(rsl.getString(8));
                ag.setRue(rsl.getString(9));
                
                ag.setCode_postal(rsl.getInt(10));
                ag.setVille(rsl.getString(11));
                ag.setLatitude(rsl.getDouble(13));
                ag.setLongitude(rsl.getDouble(14));
                ag.setApprouved(rsl.getBoolean(15));
                
                listAgences.add(ag);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DaoUser.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return listAgences;
    }
    
    public boolean approuverAgence(int id)
    {
        int test=0;
        boolean check;
        try{
            PreparedStatement pst = cnx.prepareStatement("update agence set approuved=1 where id_agence="+id); 
            test= pst.executeUpdate();
        }
        catch (SQLException ex)
        {
            Logger.getLogger(DaoAgence.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (test == 0)
        {
            check=false;
        }else{
            check=true;
        }
        return check ;
    }


}
