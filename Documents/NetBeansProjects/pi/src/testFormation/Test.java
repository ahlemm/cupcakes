/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testFormation;

/**
 *
 * @author Mdin Ahlem
 */
import entite.Formation;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import utile.DataSource; 
import service.ServiceFormation;

/**
 *
 * @author esprit
 */
public class Test {

    public static void main(String[] args) {
        DataSource da = DataSource.getInstance();
        Connection con = da.getConnection();
        System.out.println(con); 
         Formation p1 = new Formation(1, "amour", 30);
        ServiceFormation sp = new ServiceFormation();
        try {
            sp.ajouterFormation(p1);
        } catch (SQLException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
//
    
}
}