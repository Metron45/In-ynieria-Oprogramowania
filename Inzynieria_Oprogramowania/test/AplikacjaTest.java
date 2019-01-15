
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
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(Parameterized.class)
public class AplikacjaTest {
    static Aplikacja instance;
    
    @Parameterized.Parameter(value = 0)
    public String prize;
    @Parameterized.Parameter(value = 1)
    public String penalty;
    @Parameterized.Parameter(value = 2)
    public String title;
    @Parameterized.Parameter(value = 3)
    public String id;
    
    @Parameterized.Parameters
    public static Collection<Object[]> data() { 
    Object[][] data1 = new Object[][]{ 
        {"100", "50",   "Terminator",    "0"},
        {"90",  "60",    "Matrix",       "1"},
        {"80",  "70",    "Pi",           "2"},
        {"70",  "80",    "Shrek",        "3"},
        {"60",  "90",    "Shrek II",     "4"},
        {"50",  "100",   "Shrek III",    "5"},
        {"40",  "110",   "Shrek Forever","6"},
        {"30",  "120",   "Terminator 2", "7"} };
    return Arrays.asList(data1);
    }   
    
    @BeforeClass
    public static void SetUp() {
    instance = new Aplikacja();
    }
    
    @Test
    public void test1UpdateCennik(){
        instance.updateCennik(Integer.parseInt(prize), 
                Integer.parseInt(penalty));
        Assert.assertEquals(instance.getCennik().getCena(),
                Integer.parseInt(prize));
        Assert.assertEquals(instance.getCennik().getKara(),
                Integer.parseInt(penalty));
    }
    
    @Test
     public void test2Dodaj_Kasete(){
        instance.dodaj_kasete(false, title, " ");
        Assert.assertEquals(
            title,
            instance.getKatalogKaset().kasety.get(
                instance.getKatalogKaset().kasety.size()-1
                ).getTytul()
        );
    }
     
    @Test
    public void test3Usun_Kasete(){
        instance.usun_kasete(title);
        Assert.assertEquals(
            -1,
            instance.getKatalogKaset().findKaseta(title)
        );
    }
}
