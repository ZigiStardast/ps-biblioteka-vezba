/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Objects;

/**
 *
 * @author LENOVO
 */
public class Knjiga {
    private int id;
    private String naslov;
    private Autor autor;
    private String ISBN;
    private int godinaIzdanja;
    private Zanr zanr;

    public Knjiga() {
    }

    public Knjiga(int id, String naslov, Autor autor, String ISBN, int godinaIzdanja, Zanr zanr) {
        this.id = id;
        this.naslov = naslov;
        this.autor = autor;
        this.ISBN = ISBN;
        this.godinaIzdanja = godinaIzdanja;
        this.zanr = zanr;
    }
    

    public Knjiga(String naslov, Autor autor, String ISBN, int godinaIzdanja, Zanr zanr) {
        this.naslov = naslov;
        this.autor = autor;
        this.ISBN = ISBN;
        this.godinaIzdanja = godinaIzdanja;
        this.zanr = zanr;
    }

    public Zanr getZanr() {
        return zanr;
    }

    public void setZanr(Zanr zanr) {
        this.zanr = zanr;
    }

    public String getNaslov() {
        return naslov;
    }

    public void setNaslov(String naslov) {
        this.naslov = naslov;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getGodinaIzdanja() {
        return godinaIzdanja;
    }

    public void setGodinaIzdanja(int godinaIzdanja) {
        this.godinaIzdanja = godinaIzdanja;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Knjiga{" + "naslov=" + naslov + ", autor=" + autor + ", ISBN=" + ISBN + ", godinaIzdanja=" + godinaIzdanja + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Knjiga other = (Knjiga) obj;
        if (!Objects.equals(this.naslov, other.naslov)) {
            return false;
        }
        return Objects.equals(this.autor, other.autor);
    }
    
    
}
