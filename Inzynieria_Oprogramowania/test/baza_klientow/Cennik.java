package baza_klientow;

public class Cennik {

	private int cena;
	private int kara;

	public int getCena() {
		return this.cena;
	}

	/**
	 * 
	 * @param cena
	 */
	public void setCena(int cena) {
		this.cena = cena;
	}

	public int getKara() {
		return this.kara;
	}

	/**
	 * 
	 * @param kara
	 */
	public void setKara(int kara) {
		this.kara = kara;
	}

	/**
	 * 
	 * @param cena
	 * @param kara
	 */
	public void update_Cenniki(int cena, int kara) {
		setCena(cena);
                setKara(kara);
	}

}