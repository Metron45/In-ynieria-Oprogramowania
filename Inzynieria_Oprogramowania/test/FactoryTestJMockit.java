
import baza_kaset.Kaseta;
import java.util.IllegalFormatCodePointException;
import mockit.Expectations;
import mockit.Mocked;
import mockit.integration.junit4.JMockit;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JMockit.class)
public class FactoryTestJMockit {
    @Mocked
    Kaseta kas;
    @Test
    public void testEquals(){
        Fabryka instance = new Fabryka();
        Kaseta kas2 = instance.stworz_kasete("Terminator", 0);
        
        new Expectations() {
            {
                kas.getTytul();         result = "Terminator";
                kas.getKaseta_Id();     result = 0;
                kas.getIlosc_kaset();   result = 1;
            }
        };
        Assert.assertEquals(kas2.getTytul(),      kas.getTytul());
        Assert.assertEquals(kas2.getKaseta_Id(),  kas.getKaseta_Id());
        Assert.assertEquals(kas2.getIlosc_kaset(),kas.getIlosc_kaset());
    }
}
