/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import baza_kaset.Kaseta;
import java.util.IllegalFormatCodePointException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.Rule;
import org.junit.experimental.categories.Category;
import org.junit.rules.ExpectedException;

@Category({TestControl.class, TestEntity.class})
/**
 * 
 * @author Metro
 */
public class FabrykaTest {
    
    Dane dane;
    
    @Before
    public void setUp(){
        dane = new Dane();  
    }
    
    @Rule
    public ExpectedException exception = ExpectedException.none();
    
    @Test
    public void testStworz_kasete(){
        System.out.println("Wykonaj Kasete");
        Fabryka instance = new Fabryka();
        for(int i = 0; i < 7 ;i++){
            Kaseta result = instance.stworz_kasete(dane.daneKaset[i][0], Integer.parseInt(dane.daneKaset[i][1]));
            //Assert.assertEquals(dane.daneKasety[i], result);
            //Metoda z instrukcji zwraca błąd. dane.daneKaset i result nie są tym sammym obiektem
            Assert.assertEquals(dane.daneKasety[i].tytul, result.tytul);
            Assert.assertEquals(dane.daneKasety[i].kaseta_Id, result.kaseta_Id);
            Assert.assertEquals(dane.daneKasety[i].ilosc_kaset, result.ilosc_kaset);
        }
        exception.expect(IllegalFormatCodePointException.class);
        exception.expectMessage("Code point = 0x0");
        instance.stworz_kasete(dane.daneKaset[7][0], Integer.parseInt(dane.daneKaset[7][1]));
        //id nie moze byc mniejszcze od 0, jest to źle podany wartosc
    }
}
