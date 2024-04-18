/*  To reimplement the StudentGradeTest class using JUnit 4, you need to make some adjustments to the existing test class. Here's how you can do it:

Update Import Statements: Replace the JUnit 3 import statement with JUnit 4.

Extend org.junit.Test: Instead of extending junit.framework.TestCase, annotate each test method with @org.junit.Test.

Assertion Methods: Replace the assertion methods from JUnit 3 with their equivalents from JUnit 4.

Remove System.out.println() Statements: These are not necessary for JUnit tests and can be removed.

*/
package studentgrade;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StudentGradeTest {

    @Test
    public void testGetGrade95() {
        int mark = 95;
        String expResult = "A";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetGrade85() {
        int mark = 85;
        String expResult = "B";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetGrade75() {
        int mark = 75;
        String expResult = "F";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);
    }
}
