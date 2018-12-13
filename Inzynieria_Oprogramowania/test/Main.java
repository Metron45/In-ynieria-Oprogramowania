/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Metron
 */
public class Main {
    public static void main(String[] args) {
        
                 Aplikacja app = new Aplikacja();
		 System.out.println("Przykładowe zastosowanie metod Przypadkow uzycia:");
                 
                 String tytul = "Terminator";
                 System.out.println("Kaseta 1: " + tytul);
                 app.dodaj_kasete(false ,tytul,"");
                 
                 tytul = "Shrek";
                 System.out.println("Kaseta 2: " + tytul);
                 app.dodaj_kasete(false ,tytul,"");
                 
                 tytul = "Shrek";
                 System.out.println("Kaseta 3: " + tytul);
                 app.dodaj_kasete(false ,tytul,"");
                 
                 
                 for(int i=0; i < app.getKatalogKaset().kasety.size();i++){
                     System.out.println("Kaseta w Katalogu: " + app.getKatalogKaset().kasety.get(i).getTytul()
                     + " Kaseta Id: " + app.getKatalogKaset().kasety.get(i).getKaseta_Id()
                     + " Ilosc: " + app.getKatalogKaset().kasety.get(i).getIlosc_kaset() );
                 }
                 
                 tytul = "Shrek";
                 String imie = "Kowalksi";
                 long telefon = 75434;
                 System.out.println("Wypozyczenie 1: " + tytul + " " + imie + " " + telefon);
                 app.wypozycz(tytul, imie, telefon);
                 
                 tytul = "Terminator";
                 imie = "Kowalksi";
                 telefon = 75434;
                 System.out.println("Wypozyczenie 2: " + tytul + " " + imie + " " + telefon);
                 app.wypozycz(tytul, imie, telefon);
                 
                 for(int i=0; i < app.getKatalogKlientow().klienci.get(0).wypozyczenia.size();i++){
                     System.out.println("Wypożyczenia Kowalskiego: " + 
                             app.getKatalogKlientow().klienci.get(0).wypozyczenia.get(i).getData_Wypozyczenia() + " Id Kasety wypozyczonej: " +
                             app.getKatalogKlientow().klienci.get(0).wypozyczenia.get(i).getKaseta_Id());
                 }
                 
                 for(int i=0; i < app.getKatalogKaset().kasety.size();i++){
                     System.out.println("Kaseta w Katalogu: " + app.getKatalogKaset().kasety.get(i).getTytul()
                     + " Kaseta Id: " + app.getKatalogKaset().kasety.get(i).getKaseta_Id()
                     + " Ilosc: " + app.getKatalogKaset().kasety.get(i).getIlosc_kaset() );
                 }
                 
                 int cena = 8;
                 int kara = 20;
                 System.out.println("Update Cennika Cena: " + cena + " Kara: " + kara);
                 app.updateCennik(cena, kara);
                 System.out.println("Cennik Cena: " + app.getCennik().getCena() + " Kara: " + app.getCennik().getKara());
                 
                 
                 tytul = "Shrek";
                 imie = "Kowalksi";
                 System.out.println("Zwrot Kasety 1: " + tytul);
                 app.dodaj_kasete(true ,tytul, imie);
                 
                 for(int i=0; i < app.getKatalogKaset().kasety.size();i++){
                     System.out.println("Kaseta w Katalogu: " + app.getKatalogKaset().kasety.get(i).getTytul()
                     + " Kaseta Id: " + app.getKatalogKaset().kasety.get(i).getKaseta_Id()
                     + " Ilosc: " + app.getKatalogKaset().kasety.get(i).getIlosc_kaset() );
                 }
                 
                 System.out.println("Usuniecie Kasety 1: " + tytul);
                 app.usun_kasete(tytul);
                  for(int i=0; i < app.getKatalogKaset().kasety.size();i++){
                     System.out.println("Kaseta w Katalogu: " + app.getKatalogKaset().kasety.get(i).getTytul()
                     + " Kaseta Id: " + app.getKatalogKaset().kasety.get(i).getKaseta_Id()
                     + " Ilosc: " + app.getKatalogKaset().kasety.get(i).getIlosc_kaset() );
                 }
                  
                 tytul = "Terminator";
                 System.out.println("Usuniecie Kasety 2: " + tytul);
                 app.usun_kasete(tytul);
                 for(int i=0; i < app.getKatalogKaset().kasety.size();i++){
                     System.out.println("Kaseta w Katalogu: " + app.getKatalogKaset().kasety.get(i).getTytul()
                     + " Kaseta Id: " + app.getKatalogKaset().kasety.get(i).getKaseta_Id()
                     + " Ilosc: " + app.getKatalogKaset().kasety.get(i).getIlosc_kaset() );
                 }
	}
}
