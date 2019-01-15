
import baza_klientow.Cennik;
import mockit.Expectations;
import mockit.FullVerificationsInOrder;
import mockit.Injectable;
import mockit.Mocked;
import mockit.Tested;
import mockit.integration.junit4.JMockit;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.Assert;

@RunWith(JMockit.class)
public class AplikacjaTestJMockit {
    
    @Mocked
    Aplikacja instance;
    
    @Test
     public void test1UpdateCennik(){
        Aplikacja instance2 = new Aplikacja();
        instance2.getCennik().update_Cenniki(20,120);
        new Expectations() {
            {
                instance.getCennik().getCena();    result = 20;
                instance.getCennik().getKara();    result = 120;
            }
        };
        Assert.assertEquals(instance.getCennik().getCena(), 
                instance2.getCennik().getCena());
        Assert.assertEquals(instance.getCennik().getKara(), 
                instance2.getCennik().getKara());
    }
     
    @Test
     public void test2Dodaj_Kasete(){
        Aplikacja instance2 = new Aplikacja();
        instance2.dodaj_kasete(false, "Shrek", " ");
        
        new Expectations() {
            {
                instance.getKatalogKaset().findKaseta("Shrek"); result = 0;
            }
        };
         
        Assert.assertEquals(
                instance2.getKatalogKaset().findKaseta("Shrek"),
                instance.getKatalogKaset().findKaseta("Shrek")
        );
    }
     
    @Test
    public void test3Usun_Kasete(){
        Aplikacja instance2 = new Aplikacja();
        instance2.dodaj_kasete(false, "Shrek", " ");
        instance2.usun_kasete("Shrek");
        
        new Expectations() {
            {
                instance.getKatalogKaset().findKaseta("Shrek"); result = -1;
            }
        };
        
        Assert.assertEquals(
            instance2.getKatalogKaset().findKaseta("Shrek"),
            instance.getKatalogKaset().findKaseta("Shrek")
        );
    }
}
