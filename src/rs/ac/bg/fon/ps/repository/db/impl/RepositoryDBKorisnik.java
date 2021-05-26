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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import rs.ac.bg.fon.ps.domain.Korisnik;
import rs.ac.bg.fon.ps.repository.db.DBConnectionFactory;
import rs.ac.bg.fon.ps.repository.db.DBRepository;

/**
 *
 * @author USER
 */
public class RepositoryDBKorisnik implements DBRepository<Korisnik>{

    @Override
    public List<Korisnik> getAll(){
        try {
            
            Connection connection = DBConnectionFactory.getInstance().getConnection();
            List<Korisnik> lista = new ArrayList<>();
            String sql = "select * from korisnik";
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                Long id = rs.getLong("Korisnik_ID");
                String imePrezime = rs.getString("Ime_i_prezime");
                int god = rs.getInt("Godine");
                String email = rs.getString("Email");
                String tel = rs.getString("Telefon");
                String korisIme = rs.getString("Korisnicko_ime");
                String loz = rs.getString("Lozinka");
                
                Korisnik korisnik = new Korisnik(id, imePrezime, god, email, tel, korisIme, loz);
                lista.add(korisnik);
            }
            rs.close();
            statement.close();
            return lista;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return null;
        }
        
    }

    @Override
    public void add(Korisnik obj) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void edit(Korisnik obj) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Korisnik obj) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
