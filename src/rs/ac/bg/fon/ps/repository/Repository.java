/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rs.ac.bg.fon.ps.repository;

import java.util.List;
import rs.ac.bg.fon.ps.domain.Trening;

/**
 *
 * @author USER
 */
public interface Repository<T> {
    List<T> getAll() throws Exception;
    void add(T obj) throws Exception;

    public void remove(T obj) throws Exception;
}
