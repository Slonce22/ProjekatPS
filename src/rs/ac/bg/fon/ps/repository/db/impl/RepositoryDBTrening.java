/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rs.ac.bg.fon.ps.repository.db.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import rs.ac.bg.fon.ps.domain.Korisnik;
import rs.ac.bg.fon.ps.domain.Trener;
import rs.ac.bg.fon.ps.domain.Trening;
import rs.ac.bg.fon.ps.repository.db.DBConnectionFactory;
import rs.ac.bg.fon.ps.repository.db.DBRepository;

/**
 *
 * @author USER
 */
public class RepositoryDBTrening implements DBRepository<Trening>{

    @Override
    public List<Trening> getAll() throws Exception {
        try {
            Connection connection = DBConnectionFactory.getInstance().getConnection();
            List<Trening> lista = new ArrayList<>();
            String sql = "select t.Trening_ID, t.Datum_i_vreme, t.Trajanje, t.Napomena, r.Trener_ID,"
                    + "r.Ime_i_prezime, r.Telefon, r.Email, r.Iskustvo, r.Broj_treninga, r.Datum_rodjenja "
                    + "from trening t inner join trener r on t.Trener_ID = r.Trener_ID";
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                Long id = rs.getLong("Trening_ID");
                String datumVreme = rs.getString("Datum_i_vreme");
                Double trajanje = rs.getDouble("Trajanje");
                String napomena = rs.getString("Napomena");
                //SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
                Trener tr = new Trener(rs.getLong("Trener_ID"), rs.getString("Ime_i_prezime"), rs.getString("Telefon"),
                rs.getString("Email"), rs.getString("Iskustvo"), rs.getInt("Broj_treninga"), rs.getDate("Datum_rodjenja"));
                Trening trening = new Trening(id, datumVreme, trajanje, napomena, tr);
                lista.add(trening);
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
    public void add(Trening obj) throws Exception {
         
         try{
            Connection connection = DBConnectionFactory.getInstance().getConnection();
            String sql = "insert into trening values(?,?,?,?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setLong(1, obj.getTreningId());
            statement.setString(2, obj.getDatumVreme());
            statement.setDouble(3, obj.getTrajanje());
            statement.setString(4, obj.getNapomena());
            statement.setLong(5, obj.getTrener().getTrenerId());
            statement.executeUpdate();
            statement.close();
         } catch (Exception ex) {
             System.out.println(ex.getMessage());
             throw new Exception("Trening nije zakazan!");
         }
    }

    @Override
    public void remove(Trening obj) throws Exception{
        try {
            Connection connection = DBConnectionFactory.getInstance().getConnection();
            String sql = "delete from trening where Trening_ID = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setLong(1, obj.getTreningId());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            throw new Exception("Trening nije obrisan!");
            
        }
    }
    
}
