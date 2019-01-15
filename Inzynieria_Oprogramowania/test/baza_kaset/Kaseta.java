package baza_kaset;

import java.util.IllegalFormatCodePointException;

public class Kaseta {

	public String tytul;
	public int kaseta_Id;
	public int ilosc_kaset;

        
        public Kaseta(){
            
        }
        
        public Kaseta(String Tytul, int id){
            tytul = Tytul;
            kaseta_Id = id;
            ilosc_kaset = 1;
        }
        
        public Kaseta(String Tytul, int id, int ilosc){
            tytul = Tytul;
            kaseta_Id = id;
            ilosc_kaset = ilosc;
        }
        
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
	public int changeIlosc_kaset(int zmiana) {
            if(zmiana < 9999 && zmiana > -9999){
               ilosc_kaset += zmiana;
                return ilosc_kaset;
            }
            else{
                 throw new IllegalFormatCodePointException(0);
            }
	}

}