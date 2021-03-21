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
public class Trening {
    
    private Long treningId;
    private String datumVreme;
    private Double trajanje;
    private String napomena;
    private Trener trener;

    public Trening() {
    }

    public Trening(Long treningId, String datumVreme, double trajanje, String napomena, Trener trener) {
        this.treningId = treningId;
        this.datumVreme = datumVreme;
        this.trajanje = trajanje;
        this.napomena = napomena;
        this.trener = trener;
    }

    public Long getTreningId() {
        return treningId;
    }

    public void setTreningId(Long treningId) {
        this.treningId = treningId;
    }

    public String getDatumVreme() {
        return datumVreme;
    }

    public void setDatumVreme(String datumVreme) {
        this.datumVreme = datumVreme;
    }

    public Double getTrajanje() {
        return trajanje;
    }

    public void setTrajanje(Double trajanje) {
        this.trajanje = trajanje;
    }

    public String getNapomena() {
        return napomena;
    }

    public void setNapomena(String napomena) {
        this.napomena = napomena;
    }

    public Trener getTrener() {
        return trener;
    }

    public void setTrener(Trener trener) {
        this.trener = trener;
    }

    @Override
    public String toString() {
        return "Trening{" + "treningId=" + treningId + ", datumVreme=" + datumVreme + ", trajanje=" + trajanje + ", napomena=" + napomena + ", trener=" + trener + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.treningId);
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
        final Trening other = (Trening) obj;
        if (!Objects.equals(this.treningId, other.treningId)) {
            return false;
        }
        return true;
    }
   
    

    
}
