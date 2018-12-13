package baza_klientow;


import java.util.ArrayList;

public class Klient {

	private String imie;
	private long telefon;
	private int numer_iden;
	public ArrayList<Wypozyczenie> wypozyczenia = new ArrayList <Wypozyczenie>();
	private String notatka;

	public String getImie() {
		return imie;
	}

	/**
	 * 
	 * @param Imie
	 */
	public void setImie(String Imie) {
		imie = Imie;
	}

	public long getTelefon() {
		return telefon;
	}

	/**
	 * 
	 * @param Telefon
	 */
	public void setTelefon(long Telefon) {
		telefon = Telefon;
	}

	public int getNumer_iden() {
		return numer_iden;
	}

	/**
	 * 
	 * @param Numer_iden
	 */
	public void setNumer_iden(int Numer_iden) {
		numer_iden = Numer_iden;
	}

	public String getNotatka() {
		return this.notatka;
	}

	/**
	 * 
	 * @param kaseta
	 */
	public String usun_wypozyczenie_klienta(int id) {
		int index = findWypozyczenie(id);
                String data = wypozyczenia.get(index).getData_Wypozyczenia();
                wypozyczenia.remove(index);
                return data;
	}

	/**
	 * 
	 * @param notatka
	 */
	public void setNotatka(String notatka) {
		this.notatka = notatka;
	}

	/**
	 * 
	 * @param tytul
	 */
	public int findWypozyczenie(int id) {
		int index=0, kaseta_id=-1;
                while(kaseta_id != id && index < wypozyczenia.size()){
                    kaseta_id = wypozyczenia.get(index).getKaseta_Id();
                    index++;
                }
                return index;
	}

}