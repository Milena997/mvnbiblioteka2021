package rs.ac.bg.fon.nprog.mvnbiblioteka2021.biblioteka.interfejs;

import java.util.LinkedList;

import rs.ac.bg.fon.nprog.mvnbiblioteka2021.biblioteka.Autor;
import rs.ac.bg.fon.nprog.mvnbiblioteka2021.biblioteka.Knjiga;

/**
 * Interfejs koji predstavlja biblioteku.
 * 
 * @author Bojan Tomic
 *
 */
public interface BibliotekaInterface {
	
	/**
	 * Dodaje novu knjigu u biblioteku.
	 * 
	 * @param knjiga Knjiga koja se dodaje.
	 * 
	 * @throws java.lang.NullPointerException ako je uneta knjiga null
	 * @throws java.lang.RuntimeException ako uneta knjiga vec postoji u biblioteci (duplikat)
	 */
	public void dodajKnjigu(Knjiga knjiga);
	/**
	 * 
	 * @param knjiga knjiga
	 */
	public void obrisiKnjigu(Knjiga knjiga);
	/**
	 * 
	 * @return listu
	 */
	public LinkedList<Knjiga> vratiSveKnjige();
	/**
	 * 
	 * @param autor autor
	 * @param isbn isbn
	 * @param naslov naslov
	 * @param izdavac izdvac
	 * @return lista svih knjiga koje zadovoljavaju kriterijum pretrage
	 */
	public LinkedList<Knjiga> pronadjiKnjigu(
			Autor autor,
			String isbn,
			String naslov,
			String izdavac);

}
