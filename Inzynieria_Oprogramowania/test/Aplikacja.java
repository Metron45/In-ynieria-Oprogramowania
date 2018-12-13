
import baza_kaset.Kaseta;
import baza_kaset.Katalog_Kaset;
import baza_klientow.Cennik;
import baza_klientow.Katalog_Klientow;
import baza_klientow.Wypozyczenie;
import baza_klientow.Klient;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Aplikacja {

	private Katalog_Kaset katalog_kaset = new Katalog_Kaset();
	private Katalog_Klientow katalog_klientow = new Katalog_Klientow();
	private Cennik cennik = new Cennik();

        public Cennik getCennik() {
		return cennik;
	}

	public Katalog_Kaset getKatalogKaset() {
		return katalog_kaset;
	}

	public Katalog_Klientow getKatalogKlientow() {
		return katalog_klientow;
	}
    /**
	 * 
	 * @param wypozyczenie
	 * @param imie
         * @param tytul
	 */
	public void dodaj_kasete(boolean wypozyczenie,
                                String tytul,
                                String imie) {
            
                int kaseta_id = katalog_kaset.findKaseta(tytul);
                
		if(wypozyczenie == true){
                    
                    String data_wypozyczenia =
                            katalog_klientow.usun_wypozyczenie(kaseta_id, imie);
                    katalog_kaset.updateKaseta(tytul, 1);
                    
                     try {
                    DateFormat format = new SimpleDateFormat("dd/MM/yyyy");  
                    
                    LocalDateTime now = LocalDateTime.now();
                    DateTimeFormatter format_current =
                            DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    String data_current = now.format(format_current);
                    
                    Date data_wyp = format.parse(data_wypozyczenia);
                    Date data_curr = format.parse(data_current);
                    
                    long diff = data_curr.getDate() - data_wyp.getDate();
                    
                    System.out.println("Do zaplaty :" +
                            ((diff+1) * cennik.getCena()));                    
                    }
                    catch (ParseException e) {
                    }
                    System.out.println("Zakonczono wypozyczenie");
                }
                else{
                    if(kaseta_id < 0){
                        Fabryka fabryka = new Fabryka();
                        Kaseta kaseta = fabryka.stworz_kasete(tytul,
                                katalog_kaset.kasety.size());
                        katalog_kaset.dodaj_nowa_kasete(kaseta);
                        System.out.println("Dodano nowa Kasete");
                    } 
                    else{
                        katalog_kaset.updateKaseta(tytul,1);
                        System.out.println("Zwiększono ilosc");
                    }
                }
	}

            /**
	 * 
	 * @param tytul
	 */
	public void usun_kasete(String tytul) {
            int id = katalog_kaset.findKaseta(tytul);
            if(katalog_kaset.kasety.get(id).getIlosc_kaset() == 0){
		katalog_kaset.usun_Kaseta(tytul);
                System.out.println("Kaseta Usunieta, Kara :"
                        + cennik.getKara());
            }
            else{
                katalog_kaset.updateKaseta(tytul,-1);
                System.out.println("Ilosc Kaset Zmniejszona, Kara :"
                         + cennik.getKara());
            }
	}

	public void sprawdz_informacje() {
		// W chwili obecnej program może sprawdzić informacje 
                // poprzez funkcje get odpowiednich obiektów
		throw new UnsupportedOperationException();
	}
        /**
	 * 
	 * @param tytul
	 * @param imie
         * @param telefon
	 */
	public void wypozycz(String tytul, 
                        String imie,
                        long telefon) {
            
                int kaseta_id = katalog_kaset.findKaseta(tytul);
                
		Fabryka fabryka = new Fabryka();
                Wypozyczenie wypozyczenie =
                        fabryka.stworz_wypozyczenie(kaseta_id);

                int numer_iden = katalog_klientow.findKlient(imie);
                if(numer_iden < 0){
                    Klient klient = fabryka.stworz_klient(imie, telefon,
                            katalog_klientow.klienci.size());
                    katalog_klientow.dodaj_klient(klient);
                    System.out.println("Zarejestrowano Klienta");
                }

                katalog_klientow.dodaj_wypozyczenie(imie, wypozyczenie);
                katalog_kaset.updateKaseta(tytul, -1);
                System.out.println("Wypożyczenie zapisano");
	}

	/**
	 * 
	 * @param notka
	 * @param imie
	 */
	public void dodaj_notatke(String notka, String imie) {
		// TODO - implement Aplikacja.dodaj_notatke
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param cena
	 * @param kara
	 */
	public void updateCennik(int cena, int kara) {
		cennik.update_Cenniki(cena, kara);
	}

}