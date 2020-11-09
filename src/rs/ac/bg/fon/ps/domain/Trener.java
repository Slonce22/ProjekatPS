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
public class Trener {
    
    private Long trenerId;
    private String imePrezime;
    private String telefon;
    private String email;
    private String iskustvo;
    private int brTreninga;
    private Date datumRodjenja;

    public Trener() {
    }

    public Trener(Long trenerId, String imePrezime, String telefon, String email, String iskustvo, int brTreninga, Date datumRodjenja) {
        this.trenerId = trenerId;
        this.imePrezime = imePrezime;
        this.telefon = telefon;
        this.email = email;
        this.iskustvo = iskustvo;
        this.brTreninga = brTreninga;
        this.datumRodjenja = datumRodjenja;
    }

    public Long getTrenerId() {
        return trenerId;
    }

    public void setTrenerId(Long trenerId) {
        this.trenerId = trenerId;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIskustvo() {
        return iskustvo;
    }

    public void setIskustvo(String iskustvo) {
        this.iskustvo = iskustvo;
    }

    public int getBrTreninga() {
        return brTreninga;
    }

    public void setBrTreninga(int brTreninga) {
        this.brTreninga = brTreninga;
    }

    public Date getDatumRodjenja() {
        return datumRodjenja;
    }

    public void setDatumRodjenja(Date datumRodjenja) {
        this.datumRodjenja = datumRodjenja;
    }

    @Override
    public String toString() {
        return imePrezime;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.trenerId);
        hash = 89 * hash + Objects.hashCode(this.imePrezime);
        hash = 89 * hash + Objects.hashCode(this.telefon);
        hash = 89 * hash + Objects.hashCode(this.email);
        hash = 89 * hash + Objects.hashCode(this.iskustvo);
        hash = 89 * hash + this.brTreninga;
        hash = 89 * hash + Objects.hashCode(this.datumRodjenja);
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
        final Trener other = (Trener) obj;
        if (!Objects.equals(this.imePrezime, other.imePrezime)) {
            return false;
        }
        if (!Objects.equals(this.telefon, other.telefon)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.iskustvo, other.iskustvo)) {
            return false;
        }
        if (this.brTreninga != other.brTreninga) {
            return false;
        }
        if (!Objects.equals(this.datumRodjenja, other.datumRodjenja)) {
            return false;
        }
        return true;
    }
    
    
}
