/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rs.ac.bg.fon.ps.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import rs.ac.bg.fon.ps.domain.Trener;

/**
 *
 * @author USER
 */
public class TrenerRepository {
    
    private final List<Trener> treneri;

    public TrenerRepository() {
        treneri = new ArrayList<Trener>(){
            {
                add(new Trener(1l, "Bane Peric", "012593", "gmail@gmail.com", "3 godine", 25, new Date()));
                add(new Trener(2l, "Luka Peric", "012596", "gmail@gmail.com", "8 godina", 55, new Date()));
            }
        };
    }
    
    public List<Trener> getAll() {
        return treneri;
    }
    
    
}
