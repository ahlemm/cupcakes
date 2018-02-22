package service;

import entite.Patisserie;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import utile.DataSource;

/**
 *
 * @author esprit
 */
public class ServicePatisserie {

    Connection con = DataSource.getInstance().getConnection();
    private Statement ste;

    public ServicePatisserie() {
        try {
            ste = con.createStatement();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public void ajouterPatisserie(Patisserie patisserie) throws SQLException {
//    ste.executeUpdate(req);//executeupdate-->insert,delete,update

        String req = "INSERT INTO `patisserie` (`id_patissier`, 'nom_patisserie`, 'activite`,`info`, `adresse`,`etat_patisserie`)" + " VALUES (?,?,?,?,?,?)";
        PreparedStatement pre = con.prepareStatement(req);

        pre.setInt(1, patisserie.getId_patissier());

        pre.setString(2, patisserie.getNom_patisserie());
        pre.setString(3, patisserie.getAcitivite());
      
   
        pre.setString(4, patisserie.getInfo());
        pre.setString(5, patisserie.getAdresse());
        pre.setInt(6, patisserie.getEtat_patisserie());
        pre.executeUpdate();
        System.out.println("ajout avec succées");

    }
}
