/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;
import java.sql.Date;

import entite.Patisserie;
import entite.User;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import service.ServicePatisserie;
import service.ServiceUser;
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
     User h=new User("ghada","dridi","patissier","g@gmail.com","bzrt",7888,"a","e");
        Patisserie p = new Patisserie( "vicoria", "cremes", "arr", 7D, 6D, "aouina", 7,h);
    //    Patisserie p1 = new Patisserie( "lala", "gateaux", "akk", 4D, 6D, "dkk", 1 );
           
ServiceUser su = new ServiceUser ();
        ServicePatisserie sp = new ServicePatisserie();
        try {
            sp.ajouterPatisserie(p);
         

        
        } catch (SQLException ex) {
         Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
      }
//    *************
//         try {
//           sp.supprimer(11);
//        } catch (SQLException ex) {
//            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
//        }} 
//}
// *************
//sp.ModifierPatisserie(p );
//       List<Patisserie> l = new ArrayList<>();
//              List<Patisserie> l1 = new ArrayList<>();
//
//l1= sp.getAllPatisserieapprouved();
// System.out.println(l1);
            // l = sp.getAllPatisserieNonApprouved();
           

        
//
//
//    } ****
//sp.approuver(31);
//sp.etudier(34);
//sp.getPatisserieById(34);
//sp.getPatisseriebynom("masmoudi");
//        List<Patisserie> listPatisseries = new ArrayList<>();
//   System.out.println(listPatisseries);
//listPatisseries=sp.searchPatisserie("3", "a", "dkk");
//   System.out.println(listPatisseries);




    }
}
    
    
    
    
    
