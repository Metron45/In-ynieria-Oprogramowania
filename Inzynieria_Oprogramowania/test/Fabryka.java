
import baza_kaset.Kaseta;
import baza_klientow.Wypozyczenie;
import baza_klientow.Klient;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.IllegalFormatCodePointException;

public class Fabryka {

    
        public Fabryka(){
            
        }
    
	/**
	 * 
	 * @param Wypozyczenie_id
	 * @param Data_zwrotu
	 * @param Kaseta_Id
	 * @param Klient_Id
	 */
	public Wypozyczenie stworz_wypozyczenie( int Kaseta_Id) {
		Wypozyczenie wypozyczenie = new Wypozyczenie();
                wypozyczenie.setKaseta_Id(Kaseta_Id);
                
                DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
                LocalDateTime date = LocalDateTime.now();  
                wypozyczenie.setData_Wypozyczenia(date.format(format));
                
                return wypozyczenie;
	}

	/**
	 * 
	 * @param tytul
         * @param id
	 */
	public Kaseta stworz_kasete(String tytul, int id) {
            if(id < 0){
                throw new IllegalFormatCodePointException(0);
            }
            else {
		Kaseta kaseta = new Kaseta();
                kaseta.changeIlosc_kaset(1);
                kaseta.setKaseta_Id(id);
                kaseta.setTytul(tytul);
                return kaseta;
            }
	}

	/**
	 * 
	 * @param imie
	 * @param telefon
         * @param id
	 */
	public Klient stworz_klient(String imie, long telefon, int id) {
		Klient klient = new Klient();
                klient.setImie(imie);
                klient.setTelefon(telefon);
                klient.setNumer_iden(id);
                return klient;
	}

}