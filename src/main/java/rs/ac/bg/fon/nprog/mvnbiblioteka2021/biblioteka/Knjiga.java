package rs.ac.bg.fon.nprog.mvnbiblioteka2021.biblioteka;

import java.util.LinkedList;
/**
 * Klasa koja predstavlja knjigu
 * 
 * Knjiga ima naslov,isbn,izdavac kao String vrednosti,
 * autori kao listu Autora i izdanje kao int
 * 
 * @author Milena
 * @version 1.0
 *
 */
public class Knjiga {
	/**
	 * Naslov kao String vrednost.
	 */
	private String naslov;
	/**
	 * autori kao lista tipa klase Autor
	 */
	private LinkedList<Autor> autori;
	/**
	 *  isbn kao String vrednost.
	 */
	private String isbn;
	/**
	 *  Izdavac kao String vrednost.
	 */
	private String izdavac;
	/**
	 *  Izdanje kao int vrednost.
	 */
	private int izdanje;
	
	/**
	 * Vraca naslov.
	 * 
	 * @return naslov knjige kao String.
	 */
	public String getNaslov() {
		return naslov;
	}

	/**
	 * Postavlja naslov knjige na novu vrednost.
	 * 
	 * @param naslov naslov knjige kao String
	 * 
	 
	 */
	
	public void setNaslov(String naslov) {
		this.naslov = naslov;
	}
	/**
	 * Vraca autore.
	 * 
	 * @return autori knjige kao listu objekata klase Autor.
	 */
	public LinkedList<Autor> getAutori() {
		return autori;
	}
	/**
	 * Postavlja autore na novu vrednost.
	 * 
	 * @param autori autori kao lista objekata klase Autor
	 * 
	 
	 */

	public void setAutori(LinkedList<Autor> autori) {
		this.autori = autori;
	}
	/**
	 * Vraca isbn.
	 * 
	 * @return isbn knjige kao String.
	 */

	public String getIsbn() {
		return isbn;
	}

	/**
	 * Postavlja isbn na novu vrednost.
	 * 
	 * @param isbn isbn kao String
	 * 
	 
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	/**
	 * Vraca izdavaca.
	 * 
	 * @return izdavac knjige kao String.
	 */
	
	public String getIzdavac() {
		return izdavac;
	}
	/**
	 * Postavlja izdavaca na novu vrednost.
	 * 
	 * @param izdavac izdavac kao String
	 * 
	 
	 */
	
	public void setIzdavac(String izdavac) {
		this.izdavac = izdavac;
	}
	
	/**
	 * Vraca izdanje.
	 * 
	 * @return izdanje knjige kao int.
	 */
	public int getIzdanje() {
		return izdanje;
	}
	/**
	 * Postavlja izdanje na novu vrednost.
	 * 
	 * @param izdanje izdanje kao int
	 * 
	 
	 */
	
	public void setIzdanje(int izdanje) {
		this.izdanje = izdanje;
	}
	/**
	 * @return Vraca String sa svim podacima o knjizi
	 */
	@Override
	public String toString() {
		return "Knjiga [naslov=" + naslov + ", autori=" + autori + ", isbn=" + isbn + ", izdavac=" + izdavac
				+ ", izdanje=" + izdanje + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		return result;
	}

	/**
	 * Poredi dve knjige i vraca true ako su iste, a false ako nisu.
	 * 
	 * Knjige se porede po isbnu i oba moraju da budu ista.
	 * 
	 * @return 
	 * <ul>
	 * 		<li>true ako su oba objeka klase Knjiga i imaju isti isbn</li>
	 * 		<li>false u svim ostalim slucajevima</li>
	 * </ul>  
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Knjiga other = (Knjiga) obj;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		return true;
	}

}
