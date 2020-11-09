/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rs.ac.bg.fon.ps.domain;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author USER
 */
public class Korisnik {
    
    private Long korisnikId;
    private String imePrezime;
    private int godine;
    private String email;
    private String telefon;
    private String korisnickoIme;
    private String lozinka;

    public Korisnik() {
    }

    public Korisnik(Long korisnikId, String imePrezime, int godine, String email, String telefon, String korisnickoIme, String lozinka) {
        this.korisnikId = korisnikId;
        this.imePrezime = imePrezime;
        this.godine = godine;
        this.email = email;
        this.telefon = telefon;
        this.korisnickoIme = korisnickoIme;
        this.lozinka = lozinka;
    }

    public Long getKorisnikId() {
        return korisnikId;
    }

    public void setKorisnikId(Long korisnikId) {
        this.korisnikId = korisnikId;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public int getGodine() {
        return godine;
    }

    public void setGodine(int godine) {
        this.godine = godine;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getKorisnickoIme() {
        return korisnickoIme;
    }

    public void setKorisnickoIme(String korisnickoIme) {
        this.korisnickoIme = korisnickoIme;
    }

    public String getLozinka() {
        return lozinka;
    }

    public void setLozinka(String lozinka) {
        this.lozinka = lozinka;
    }

    @Override
    public String toString() {
        return "Korisnik{" + "korisnikId=" + korisnikId + ", imePrezime=" + imePrezime + ", godine=" + godine + ", email=" + email + ", telefon=" + telefon + ", korisnickoIme=" + korisnickoIme + ", lozinka=" + lozinka + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.korisnikId);
        hash = 97 * hash + Objects.hashCode(this.imePrezime);
        hash = 97 * hash + this.godine;
        hash = 97 * hash + Objects.hashCode(this.email);
        hash = 97 * hash + Objects.hashCode(this.telefon);
        hash = 97 * hash + Objects.hashCode(this.korisnickoIme);
        hash = 97 * hash + Objects.hashCode(this.lozinka);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Korisnik other = (Korisnik) obj;
        if (!Objects.equals(this.imePrezime, other.imePrezime)) {
            return false;
        }
        if (this.godine != other.godine) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.telefon, other.telefon)) {
            return false;
        }
        if (!Objects.equals(this.korisnickoIme, other.korisnickoIme)) {
            return false;
        }
        if (!Objects.equals(this.lozinka, other.lozinka)) {
            return false;
        }
        return true;
    }
    
    

    
    
    
    
}
