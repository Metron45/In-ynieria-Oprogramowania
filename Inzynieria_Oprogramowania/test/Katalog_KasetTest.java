
import baza_kaset.Kaseta;
import baza_kaset.Katalog_Kaset;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;

@Category({TestControl.class, TestEntity.class})
/**
 *
 * @author Metro
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(Parameterized.class)
public class Katalog_KasetTest {
    static Dane dane;
    static Katalog_Kaset instance;
    
    
    @Parameterized.Parameter(value = 0)
    public String title;
    @Parameterized.Parameter(value = 1)
    public String id;
    
    @Parameterized.Parameters
    public static Collection<Object[]> data() { 
    Object[][] data1 = new Object[][]{ 
        {"Terminator",   "0"},
        {"Matrix",       "1"},
        {"Pi",           "2"},
        {"Shrek",        "3"},
        {"Shrek II",     "4"},
        {"Shrek III",    "5"},
        {"Shrek Forever","6"},
        {"Terminator 2", "7"} };
    return Arrays.asList(data1);
    }   
    

    @BeforeClass
    public static void SetUp() {
    instance = new Katalog_Kaset();
    dane = new Dane();
}
    
    @Test
    public void test1dodaj_nowa_kasete(){
        System.out.println("Dodawanie Kaset w Katalogu");
        Fabryka fab = new Fabryka();
        Kaseta kas = fab.stworz_kasete(title, Integer.parseInt(id));
        instance.dodaj_nowa_kasete(kas);
        Assert.assertEquals(instance.kasety.get(Integer.parseInt(id)).tytul, kas.tytul);
    }
    
    @Test
    public void test2findKaseta(){
        System.out.println("Szukanie Kaset w Katalogu");
        Assert.assertEquals(instance.findKaseta(title), Integer.parseInt(id));
    }
}
