/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import entite.Patisserie;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import service.ServicePatisserie;
import utile.DataSource;
/**
 *
 * @author esprit
 */
public class Test {

    public static void main(String[] args) {
        DataSource da = DataSource.getInstance();
        Connection con = da.getConnection();
        
      System.out.println(con);
        Patisserie p = new Patisserie( 4,"cheesecake", "desir", "a", "a", 6);
             Patisserie p1 = new Patisserie( 45,"cheesecake", "desir", "a", "a", 6);

        ServicePatisserie sp = new ServicePatisserie();
        try {
            sp.ajouterPatisserie(p);
        
        } catch (SQLException ex) {
         Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
}