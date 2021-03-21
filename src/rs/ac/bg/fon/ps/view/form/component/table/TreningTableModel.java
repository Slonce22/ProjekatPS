/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rs.ac.bg.fon.ps.view.form.component.table;

import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import rs.ac.bg.fon.ps.domain.Trener;
import rs.ac.bg.fon.ps.domain.Trening;

/**
 *
 * @author USER
 */
public class TreningTableModel extends AbstractTableModel{
    
    private List<Trening> treninzi;
    private final String[] imenaKolona = {"Trening ID", "Datum i vreme", "Trajanje", "Trener", "Napomena"};
    private final Class[] imenaKlasa = {Long.class, String.class, Double.class, Trener.class, String.class};

    public TreningTableModel(List<Trening> treninzi) {
        this.treninzi = treninzi;
    }

    @Override
    public int getRowCount() {
        if (treninzi == null)
            return 0;
        return treninzi.size();
    }

    @Override
    public int getColumnCount() {
        return imenaKolona.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Trening trening = treninzi.get(rowIndex);
        
        switch(columnIndex){
            case 0: return trening.getTreningId();
            case 1: return trening.getDatumVreme();
            case 2: return trening.getTrajanje();
            case 3: return trening.getTrener();
            case 4: return trening.getNapomena();
                default: return "n/a";
        }
    }

    @Override
    public String getColumnName(int column) {
        return imenaKolona[column];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex == 1 || columnIndex == 3;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Trening trening = treninzi.get(rowIndex);
        switch(columnIndex) {
            case 1: trening.setDatumVreme(String.valueOf(aValue));
                break;
            case 3: trening.setTrener((Trener) aValue);
                break;
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return imenaKlasa[columnIndex];
    }

    public void dodajTrening(Trening trening) {
        treninzi.add(trening);
        fireTableRowsInserted(treninzi.size()-1, treninzi.size()-1);
        
    }

    public Trening getTreningAt(int row) {
        return treninzi.get(row);
    }

    public List<Trening> getTreninzi() {
        return treninzi;
    }
  
    
    
    
}
