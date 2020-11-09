/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rs.ac.bg.fon.ps.repository;


import java.util.ArrayList;
import java.util.List;
import rs.ac.bg.fon.ps.domain.Korisnik;

/**
 *
 * @author USER
 */
public class KorisnikRepository {
    
    private final List<Korisnik> korisnici;

    public KorisnikRepository() {
        korisnici = new ArrayList<Korisnik>(){
            {
                add(new Korisnik(1l, "Kristina Vidaković", 23, "gmail123@gmail.com", "069/8965789", "admin", "admin"));
                add(new Korisnik(2l, "Jovana Mišić", 22, "joca@gmail.com", "061/369874", "user", "user"));
            }
        };
        //korisnici.add(new Korisnik(1l, "Pera Peric", 25, "gmail@gmail.com", "069/999999"));
    }
    
    public List<Korisnik> getAll() {
        return korisnici;
    }
    
    
}
