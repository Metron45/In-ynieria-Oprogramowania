package baza_kaset;

public class Kaseta {

	private String tytul;
	private int kaseta_Id;
	private int ilosc_kaset;

	public String getTytul() {
		return tytul;
	}

	/**
	 * 
	 * @param Tytul
	 */
	public void setTytul(String Tytul) {
		tytul = Tytul;
	}

	public int getKaseta_Id() {
		return kaseta_Id;
	}

	/**
	 * 
	 * @param Kaseta_Id
	 */
	public void setKaseta_Id(int Kaseta_Id) {
		kaseta_Id = Kaseta_Id;
	}

	public int getIlosc_kaset() {
		return ilosc_kaset;
	}

	/**
	 * 
	 * @param zmiana
     * @return 
	 */
	public int setIlosc_kaset(int zmiana) {
		ilosc_kaset += zmiana;
                return ilosc_kaset;
	}

}