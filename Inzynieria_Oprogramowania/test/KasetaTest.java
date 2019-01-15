/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import baza_kaset.Kaseta;
import java.util.Arrays;
import java.util.Collection;
import java.util.IllegalFormatCodePointException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.Rule;
import org.junit.experimental.categories.Category;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

@Category({TestControl.class, TestEntity.class})
/**
 *
 * @author Metro
 */
@RunWith(value = Parameterized.class)
public class KasetaTest {
    Dane dane;
    
    @Before
    public void setUp(){
        dane = new Dane();  
    }
    
    @Parameterized.Parameter(value = 0)
    public int numer1;
    @Parameterized.Parameter(value = 1)
    public int numer2;
    
    @Parameterized.Parameters
    public static Collection<Object[]> data() { 
    Object[][] data1 = new Object[][]{ {1,0}, {2,1}, {3,2}, {4,3}, {5,4}, {6,5}, {7,6}, {-1,7} };
    return Arrays.asList(data1);
    }   
    
    @Rule
    public ExpectedException exception = ExpectedException.none();
    
    @Test
    public void testChangeIlosc_kaset(){
        System.out.println("Zmiana ilosci Kaset");
        for(int i = 0; i < 7 ;i++){
            Kaseta result = dane.daneKasety[i];
            result.changeIlosc_kaset(numer1);
            Assert.assertEquals(dane.daneIlosci[numer2], result.ilosc_kaset);
        }
    }
}
