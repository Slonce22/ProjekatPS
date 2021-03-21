/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rs.ac.bg.fon.ps.repository.db.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import rs.ac.bg.fon.ps.domain.Korisnik;
import rs.ac.bg.fon.ps.domain.Trener;
import rs.ac.bg.fon.ps.repository.Repository;
import rs.ac.bg.fon.ps.repository.db.DBConnectionFactory;

/**
 *
 * @author USER
 */
public class RepositoryDBTrener implements Repository<Trener>{

    @Override
    public List<Trener> getAll() throws Exception {
        try {
            Connection connection = DBConnectionFactory.getInstance().getConnection();
            List<Trener> lista = new ArrayList<>();
            String sql = "select * from trener";
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                Long id = rs.getLong("Trener_ID");
                String imePrezime = rs.getString("Ime_i_prezime");
                String email = rs.getString("Email");
                String tel = rs.getString("Telefon");
                String iskustvo = rs.getString("Iskustvo");
                int brTr = rs.getInt("Broj_treninga");
                Date rodj = rs.getDate("Datum_rodjenja");
                
                Trener trener = new Trener(id, imePrezime, tel, email, iskustvo, brTr, rodj);
                lista.add(trener);
            }
            rs.close();
            statement.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(RepositoryDBKorisnik.class.getName()).log(Level.SEVERE, null, ex);
            throw new Exception("Greska u konekciji");
        }
    }

    @Override
    public void add(Trener obj) throws Exception {
        
    }
    
}
