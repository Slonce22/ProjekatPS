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
import rs.ac.bg.fon.ps.repository.TrenerRepository;
import rs.ac.bg.fon.ps.repository.TreningRepository;

/**
 *
 * @author USER
 */
public class Controller {
    
    private static Controller controller;
    
    private final KorisnikRepository korisnikRepository;
    private final TrenerRepository trenerRepository;
    private final TreningRepository treningRepository;

    private Controller() {
        korisnikRepository = new KorisnikRepository();
        trenerRepository = new TrenerRepository();
        treningRepository = new TreningRepository();
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
    
    public List<Trener> getAllTreneri() {
        return trenerRepository.getAll();
    }

    public void addTrening(Trening trening) {
        treningRepository.add(trening);
    }
    
    public List<Trening> getAllTrening() {
        return treningRepository.getAll();
    }

    public void deleteTrening(Trening trening) throws Exception {
        treningRepository.remove(trening);
    }
}
