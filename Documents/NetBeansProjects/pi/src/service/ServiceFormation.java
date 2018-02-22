/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

/**
 *
 * @author Mdin Ahlem
 */ 
import entite.Formation;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import utile.DataSource;
public class ServiceFormation { 
    Connection con=DataSource.getInstance().getConnection();
        private Statement ste;     

    public ServiceFormation() {
        try{   
         ste = con.createStatement();}
        catch (SQLException ex) {
            System.out.println(ex);
        }
    } 
    public void ajouterFormation(Formation p) throws SQLException{
//    ste.executeUpdate(req);//executeupdate-->insert,delete,update

        String req="INSERT INTO `formation` (`id_user`, `info`, `prix`)"+" VALUES (?,?,?)";
        PreparedStatement pre=con.prepareStatement(req);
        pre.setInt(1, p.getId_user());
        pre.setString(2, p.getInfo());  
        pre.setDouble(3, p.getPrix());
        pre.executeUpdate();
         System.out.println("ajout avec succées");
    
    
    }
    
}
