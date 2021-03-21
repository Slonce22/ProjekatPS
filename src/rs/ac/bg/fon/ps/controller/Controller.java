/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rs.ac.bg.fon.ps.controller;

import java.util.List;
import rs.ac.bg.fon.ps.domain.Korisnik;
import rs.ac.bg.fon.ps.domain.Trener;
import rs.ac.bg.fon.ps.domain.Trening;
import rs.ac.bg.fon.ps.repository.KorisnikRepository;
import rs.ac.bg.fon.ps.repository.Repository;
import rs.ac.bg.fon.ps.repository.TrenerRepository;
import rs.ac.bg.fon.ps.repository.TreningRepository;
import rs.ac.bg.fon.ps.repository.db.impl.RepositoryDBKorisnik;
import rs.ac.bg.fon.ps.repository.db.impl.RepositoryDBTrener;
import rs.ac.bg.fon.ps.repository.db.impl.RepositoryDBTrening;


/**
 *
 * @author USER
 */
public class Controller {
    
    private static Controller controller;
    
    private final Repository korisnikRepository;
    private final Repository trenerRepository;
    private final Repository treningRepository;

    private Controller() {
        korisnikRepository = new RepositoryDBKorisnik();
        trenerRepository = new RepositoryDBTrener();
        treningRepository = new RepositoryDBTrening();
    }
    
    public static Controller getInstance() {
        if (controller == null)
            controller = new Controller();
        return controller;
    }
    
    public Korisnik login (String korisnickoIme, String lozinka) throws Exception {
        List<Korisnik> korisnici = korisnikRepository.getAll();
        
        for (Korisnik korisnik : korisnici) {
            if (korisnik.getKorisnickoIme().equals(korisnickoIme) && korisnik.getLozinka().equals(lozinka))
                return korisnik;
        }
        
        throw new Exception("Nepoznat korisnik!");
    }
    
    public List<Trener> getAllTreneri() throws Exception{
        return trenerRepository.getAll();
    }

    public void addTrening(Trening trening) throws Exception{
        treningRepository.add(trening);
    }
    
    public List<Trening> getAllTrening() throws Exception{
        return treningRepository.getAll();
    }

    public void obrisiTrening(Trening tr) throws Exception {
        //treningRepository.remove(tr);
    }

}
