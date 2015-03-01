package no.ums.interview.bonus;



import java.lang.reflect.Field;

import org.junit.Assert;
import org.junit.Test;



/**
 * Magic strings.
 *
 * This task is hard.
 *
 * Only change the code inside the magic function, and get this test to pass.
 *
 * @author <a href="mailto:su@ums.no">Ståle Undheim</a>
 */
public class MagicStringsTest {

    @Test
    public void testName() throws Exception {
        magic();
        Assert.assertEquals("Hello world", "Hello ums");
    }

    private void magic() throws Exception {
        // Start code
    		System.out.println("Hello ums");
    	/**try{
    		Field f = String.class.getDeclaredField("value");
    		f.setAccessible(true);
    		f.set("Hello world", new char[0]);
    		f.set(System.lineSeparator(), new char[0]);
    		
    	}
    	catch(Exception ignore){
    		
    	}*/

        // End code
    }
}
