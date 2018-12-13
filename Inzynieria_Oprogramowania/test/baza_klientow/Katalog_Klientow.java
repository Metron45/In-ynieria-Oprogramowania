package baza_klientow;


import java.util.ArrayList;

public class Katalog_Klientow {

	public ArrayList<Klient> klienci = new ArrayList <> ();

	/**
	 * 
	 * @param notatka
	 * @param Id
	 */
	public void updateKlient(String notatka, int Id) {
		klienci.get(Id).setNotatka(notatka);
	}

	/**
	 * 
	 * @param imie
         * @return numer_id
	 */
	public int findKlient(String imie) {
            int index;
            
            String imie_klienta = " ";
            for(index = 0;
                    !imie_klienta.equals(imie) && index < klienci.size();
                    index++){
                imie_klienta = klienci.get(index).getImie();
            }
            
            if(imie_klienta.equals(imie)){
                index--;
            }else{
                index = -1;
            }
            return index;
	}

	public ArrayList<Klient> getKatalogKlientow() {
		return klienci;
	}

	/**
	 * 
	 * @param klient
	 */
	public void dodaj_klient(Klient klient) {
		klienci.add(klient);
	}

	/**
	 * 
         * @param kaseta_id
	 * @param imie
	 */
	public String usun_wypozyczenie(int kaseta_id, String imie) {
		int id = findKlient(imie);
                String data = 
                        klienci.get(id).usun_wypozyczenie_klienta(kaseta_id);
                return data;
	}

	/**
	 * 
	 * @param imie
	 * @param wypozyczenie
	 */
	public void dodaj_wypozyczenie(String imie, Wypozyczenie wypozyczenie) {
		int id = findKlient(imie);
                klienci.get(id).wypozyczenia.add(wypozyczenie);
	}

}