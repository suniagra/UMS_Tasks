package no.ums.interview.bonus;

import org.junit.Assert;
import org.junit.Test;

/**
 * Create a string under weird constraints.
 *
 * This is a hard test.
 *
 * You are only allowed to change the code between the start and end. And, you cannot use any literals or
 * keywords. This includes primitives. So no if, for, class, new, int, long or other keyword. And no string or
 * numeric literals either. However, you are still allowed to use these values if they are returned from a
 * function, or as arguments too a function (using auto boxing). You are just not allowed to write the specific
 * words.
 * 
 * All operators are allowed (+, -, *, =, &amp; and so on)
 * 
 * @author <a href="mailto:su@ums.no">Ståle Undheim</a>
 */
public class WeirdConstraintsTest {
    @Test
    public void testWeirdConstraints() throws Exception {
        Assert.assertEquals(generateWithConstraints(), "Hello world");

    }

    private String generateWithConstraints() {
        final StringBuilder sb = new StringBuilder();
        // Start code
        // End code
        return sb.toString();
    }
}
