package baza_kaset;


import java.util.ArrayList;

public class Katalog_Kaset {

	public ArrayList<Kaseta> kasety = new ArrayList<>();

	/**
	 * 
	 * @param kaseta
	 */
	public void dodaj_nowa_kasete(Kaseta kaseta) {
		kasety.add(kaseta);
	}

	/**
	 * 
	 * @param nazwa
	 */
	public void usun_Kaseta(String nazwa) {
		int id = findKaseta(nazwa);
                kasety.remove(id);
	}

	/**
	 * 
	 * @param tytul
         * @return numer_id
	 */
	public int findKaseta(String tytul) {
            int index;
            String tytul_kasety = " ";
            for( index = 0; !tytul_kasety.equals(tytul) && index < kasety.size(); ++index){
                tytul_kasety = kasety.get(index).getTytul(); 
            }
            if(tytul.equals(tytul_kasety)){
               index --;
            }else{
               index = -1;
            }
            return index;
	}

	public Katalog_Kaset getKatalogKaset() {
		return this;
	}

	/**
	 * 
	 * @param tytul
	 * @param zmiana
         * @return
	 */
	public int updateKaseta(String tytul, int zmiana) {  
            int id = findKaseta(tytul);
            int ilosc = kasety.get(id).setIlosc_kaset(zmiana);
            return ilosc;
	}

}