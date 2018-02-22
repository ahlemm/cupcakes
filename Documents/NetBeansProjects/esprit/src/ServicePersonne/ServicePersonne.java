/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicePersonne;

/**
 *
 * @author Mdin Ahlem
 */ 
import esprit.entity.personne;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import DataSource.DataSource;
public class ServicePersonne { 
    Connection con=DataSource.getInstance().getConnection();
        private Statement ste;     

    public ServicePersonne() {
        try{   
         ste = con.createStatement();}
        catch (SQLException ex) {
            System.out.println(ex);
        }
    } 
    public void ajouterPersonne(personne p) throws SQLException{
//    ste.executeUpdate(req);//executeupdate-->insert,delete,update

        String req="INSERT INTO `personne` (`id`, `nom`, `prenom`, `age`)"+" VALUES (?,?,?,?)";
        PreparedStatement pre=con.prepareStatement(req);
        pre.setInt(1, p.getId());
        pre.setString(2, p.getNom());  
        pre.setString(3, p.getPrenom());
         pre.setInt(4, p.getAge());

        
        pre.executeUpdate();
         System.out.println("ajout avec succées");
    
    
    }
    
}
