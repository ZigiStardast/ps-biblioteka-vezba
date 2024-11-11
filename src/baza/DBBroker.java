/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baza;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Knjiga;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Autor;
import model.Zanr;

/**
 *
 * @author LENOVO
 */
public class DBBroker {
    
    public List<Knjiga> ucitajListuKnjigaIzBaze() {
        List<Knjiga> lista = new ArrayList<>();
        try {
            String upit = "SELECT * FROM knjiga k JOIN autor a ON k.autorId = a.id;";
            Statement st = Konekcija.getInstance().getConnection().createStatement();
            ResultSet rs = st.executeQuery(upit);
            while (rs.next()) {
                int id = rs.getInt("k.id");
                String naslov = rs.getString("k.naslov");
                
                int godinaIzdanja = rs.getInt("k.godinaIzdanja");
                String isbn = rs.getString("k.isbn");
                String zanr = rs.getString("k.zanr");
                Zanr z = Zanr.valueOf(zanr); 
                
                int idA = rs.getInt("a.id");
                String ime = rs.getString("a.ime");
                String prezime = rs.getString("a.prezime");
                int godinaRodjenja = rs.getInt("a.godinaRodjenja");
                String biografija = rs.getString("a.biografija");
                Autor a = new Autor(id, ime, prezime, godinaRodjenja, biografija);
                
                Knjiga k = new Knjiga(id, naslov, a, isbn, godinaIzdanja, z);
                lista.add(k);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    public List<Autor> ucitajListuAutoraIzBaze() {
        List<Autor> lista = new ArrayList<>();
        try {
            String upit = "SELECT * FROM autor";
            Statement s = Konekcija.getInstance().getConnection().createStatement();
            ResultSet rs = s.executeQuery(upit);
            
            while (rs.next()) {
                int id = rs.getInt("id");
                String ime = rs.getString("ime");
                String prezime = rs.getString("prezime");
                int godinaRodjenja = rs.getInt("godinaRodjenja");
                String biografija = rs.getString("biografija");
                
                Autor a = new Autor(id, ime, prezime, godinaRodjenja, biografija);
                lista.add(a);
            }
   
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    public void obrisiKnjigu(int id) {
        try {
            String upit = "DELETE FROM knjiga WHERE id=?";
            PreparedStatement ps = Konekcija.getInstance().getConnection().prepareStatement(upit);
            ps.setInt(1, id);
           
            ps.executeUpdate();
            Konekcija.getInstance().getConnection().commit();
            
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void dodajKnjigu(Knjiga k) {
        try {
            String upit = "INSERT INTO knjiga (id, naslov, autorId, godinaIzdanja, isbn, zanr) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = Konekcija.getInstance().getConnection().prepareStatement(upit);
            ps.setInt(1, k.getId());
            ps.setString(2, k.getNaslov());
            ps.setInt(3, k.getAutor().getId());
            ps.setInt(4, k.getGodinaIzdanja());
            ps.setString(5, k.getISBN());
            ps.setString(6, String.valueOf(k.getZanr()));
            
            ps.executeUpdate();
            Konekcija.getInstance().getConnection().commit();
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void izmeniKnjiguUBazi(Knjiga k) {
        try {
            String upit = "UPDATE knjiga SET naslov=?, autorId=?, godinaIzdanja=?, zanr=? WHERE id=?";
            PreparedStatement ps = Konekcija.getInstance().getConnection().prepareStatement(upit);
            ps.setString(1, k.getNaslov());
            ps.setInt(2, k.getAutor().getId());
            ps.setInt(3, k.getGodinaIzdanja());
            ps.setString(4, String.valueOf(k.getZanr()));
            ps.setInt(5, k.getId());
            
            ps.executeUpdate();
            Konekcija.getInstance().getConnection().commit();
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
