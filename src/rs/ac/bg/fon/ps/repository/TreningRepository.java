/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rs.ac.bg.fon.ps.repository;

import java.util.ArrayList;
import java.util.List;
import rs.ac.bg.fon.ps.domain.Trening;

/**
 *
 * @author USER
 */
public class TreningRepository {
    
    private final List<Trening> treninzi;

    public TreningRepository() {
        treninzi = new ArrayList<>();
    }
    
    public void add (Trening trening) {
        treninzi.add(trening);
    }
    
    public List<Trening> getAll() {
        return treninzi;
    }

<<<<<<< HEAD
    public void remove(Trening tr) throws Exception {
        int index = treninzi.indexOf(tr);
        if (index>=0) {
            treninzi.remove(index);
        } else throw new Exception("Greska: Trening ne postoji");
=======
    public void remove(Trening trening) throws Exception {
        int index = treninzi.indexOf(trening);
        if (index >= 0) {
            treninzi.remove(index);
        }
        else {
            throw new Exception("Greška: Trening ne postoji!");
        }
>>>>>>> a926576f3035a74247dd27aa3d56e01425b06d98
    }
}
