/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import baza.DBBroker;
import java.util.ArrayList;
import java.util.List;
import model.Autor;
import model.Knjiga;
import model.Zanr;

/**
 *
 * @author LENOVO
 */
public class Controller {
    private DBBroker dbb;
    private List<Knjiga> listaKnjiga;
    private List<Autor> listaAutora;
    
    private static Controller instance;
    public static Controller getInstance() {
        if (instance == null) {
            instance = new Controller();
        }
        return instance;
    }

    private Controller() {
        dbb = new DBBroker();
        
        
        
        
        
        /*
        Autor a1 = new Autor("Ivo", "Andric", 1892, "Biografija Ive Andrica...");
        Autor a2 = new Autor("Danilo", "Kis", 1935, "Biografija Danila Kisa...");
        Autor a3 = new Autor("Mesa", "Selimovic", 1910, "Biografija Mese Selimovica...");
        
        Knjiga k1 = new Knjiga("Na Drini cuprija", a1, "1234567890", 1945, Zanr.DETEKTIVSKI);
        Knjiga k2 = new Knjiga("Basta, pepeo", a2, "0987654321", 1982, Zanr.ISTORIJSKI);
        Knjiga k3 = new Knjiga("Tvrdjava", a3, "1122334455", 1970, Zanr.NAUCNA_FANTASTIKA);
        
        listaKnjiga = new ArrayList<>();
        listaAutora = new ArrayList<>();
        
        listaKnjiga.add(k1);
        listaKnjiga.add(k2);
        listaKnjiga.add(k3);
        
        listaAutora.add(a1);
        listaAutora.add(a2);
        listaAutora.add(a3);
        */
    }

    public List<Knjiga> getListaKnjiga() {
        return listaKnjiga;
    }

    public void setListaKnjiga(List<Knjiga> listaKnjiga) {
        this.listaKnjiga = listaKnjiga;
    }

    public List<Autor> getListaAutora() {
        return listaAutora;
    }

    public void setListaAutora(List<Autor> listaAutora) {
        this.listaAutora = listaAutora;
    }
    
    public void obrisiKnjigu(int id) {
        dbb.obrisiKnjigu(id);
    }
    public void dodajKnjigu(Knjiga k) {
        dbb.dodajKnjigu(k);
    }

    public List<Knjiga> ucitajListuKnjigaIzBaze() {
        return dbb.ucitajListuKnjigaIzBaze();
    }

    public List<Autor> ucitajListuAutoraIzBaze() {
        return dbb.ucitajListuAutoraIzBaze();
    }

    public void izmeniKnjiguUBazi(Knjiga knjigaZaIzmenu) {
        dbb.izmeniKnjiguUBazi(knjigaZaIzmenu);
    }
    
    
}
