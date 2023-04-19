package wordleapp;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

public class HiderTest {
    
    private Hider hider;
    private char[] objCharArray;
    private char[] expectedHiddenArray;
    
    @Before
    public void setUp() {
        hider = new Hider();
        objCharArray = new char[] {'a', 'c', 'u', 'n','a'};
        expectedHiddenArray = new char[] {'_', '_', '_', '_','_'};
    }
    
    @Test
    public void testHideArray() {
        char[] actualHiddenArray = hider.hideArray(objCharArray);
        assertArrayEquals(expectedHiddenArray, actualHiddenArray);
    }
    
}
