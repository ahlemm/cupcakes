/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

/**
 *
 * @author Mdin Ahlem
 */
import esprit.entity.personne;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import DataSource.DataSource; 
import ServicePersonne.ServicePersonne;

/**
 *
 * @author esprit
 */
public class test {

    public static void main(String[] args) {
        DataSource da = DataSource.getInstance();
        Connection con = da.getConnection();
        System.out.println(con); 
         personne p1 = new personne(3, "mdini", "ahlem", 30);
        ServicePersonne sp = new ServicePersonne();
        try {
            sp.ajouterPersonne(p1);
        } catch (SQLException ex) {
            Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
        }
//
    
}
}