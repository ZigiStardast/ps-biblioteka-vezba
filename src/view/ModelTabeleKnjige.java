/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Knjiga;

/**
 *
 * @author LENOVO
 */
public class ModelTabeleKnjige extends AbstractTableModel {
    private List<Knjiga> listaKnjiga;
    private final String[] kolone = {"Naslov", "Autor", "ISBN", "Godina izdanja"};

    public ModelTabeleKnjige(List<Knjiga> listaKnjiga) {
        this.listaKnjiga = listaKnjiga;
    }
    
    
    @Override
    public int getRowCount() {
      return listaKnjiga.size();
    }

    @Override
    public int getColumnCount() {
        return kolone.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Knjiga k = listaKnjiga.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return k.getNaslov();
            case 1:
                return k.getAutor().getIme() + " " + k.getAutor().getPrezime(); 
            case 2:
                return k.getISBN();
            case 3:
                return k.getGodinaIzdanja();
            default:
                return "N/A";
        }
    }

    @Override
    public String getColumnName(int column) {
        return kolone[column];
    }
    
    void refreshTable() {
        fireTableDataChanged();
        System.out.println("Tabela je osvezena!");
    }
}
