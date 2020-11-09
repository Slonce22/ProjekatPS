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
    private double trajanje;
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

    public double getTrajanje() {
        return trajanje;
    }

    public void setTrajanje(double trajanje) {
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
        hash = 29 * hash + Objects.hashCode(this.treningId);
        hash = 29 * hash + Objects.hashCode(this.datumVreme);
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.trajanje) ^ (Double.doubleToLongBits(this.trajanje) >>> 32));
        hash = 29 * hash + Objects.hashCode(this.napomena);
        hash = 29 * hash + Objects.hashCode(this.trener);
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
        if (!Objects.equals(this.datumVreme, other.datumVreme)) {
            return false;
        }
        if (Double.doubleToLongBits(this.trajanje) != Double.doubleToLongBits(other.trajanje)) {
            return false;
        }
        if (!Objects.equals(this.napomena, other.napomena)) {
            return false;
        }
        if (!Objects.equals(this.trener, other.trener)) {
            return false;
        }
        return true;
    }

    

    
}
