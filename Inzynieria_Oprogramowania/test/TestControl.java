/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
@Categories.SuiteClasses({FabrykaTest.class,
AplikacjaTest.class, 
Katalog_KasetTest.class, 
AplikacjaTest.class })
@RunWith(Categories.class)
@Categories.IncludeCategory(TestControl.class)

/**
 *
 * @author Metro
 */
public class TestControl {
    
}
