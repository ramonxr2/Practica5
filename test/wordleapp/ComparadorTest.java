package wordleapp;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class ComparadorTest {
    
    private Comparador comparador;
    
    @Before
    public void setUp() {
        comparador = new Comparador();
        ArrayList<Character> tc=new ArrayList();
        tc.add('a');
        tc.add('c');
        tc.add('u');
        tc.add('n');
        tc.add('e');
        tc.add('p');
        tc.add('l');
        tc.add('o');
        tc.add('s');


    }
    
    @Test
    public void testComparacion_allCorrect() {
        ArrayList<Character> tc=new ArrayList();
        tc.add('a');
        tc.add('c');
        tc.add('u');
        tc.add('n');
        tc.add('e');
        tc.add('p');
        tc.add('l');
        tc.add('o');
        tc.add('s');
        char[] objCharArrayNotHidden = {'a', 'c', 'u', 'n', 'e'};
        char[] lecturaChar = {'a', 'c', 'u', 'n', 'e'};
        char[] objCharArray = {'_', '_', '_', '_', '_'};
        
        
        char[] result = comparador.comparacion(objCharArrayNotHidden, lecturaChar, objCharArray, tc);
        
        assertArrayEquals(new char[]{'a', 'c', 'u', 'n', 'e'}, result);
        assertEquals(5, result.length);
    }
    
    @Test
    public void testComparacion_someCorrect() {
        ArrayList<Character> tc=new ArrayList();
        tc.add('a');
        tc.add('c');
        tc.add('u');
        tc.add('n');
        tc.add('e');
        tc.add('p');
        tc.add('l');
        tc.add('o');
        tc.add('s');
        char[] objCharArrayNotHidden = {'a', 'c', 'u', 'n', 'e'};
        char[] lecturaChar = {'a', 'c', 'u', 'n', 'o'};
        char[] objCharArray = {'_', '_', '_', '_', '_'};
        
        char[] result = comparador.comparacion(objCharArrayNotHidden, lecturaChar, objCharArray, tc);
        
        assertArrayEquals(new char[]{'a', 'c', 'u', 'n', '_'}, result);
        assertEquals(5, result.length);
    }
    
    @Test
    public void testComparacion_allWrong() {
        ArrayList<Character> tc=new ArrayList();
        tc.add('a');
        tc.add('c');
        tc.add('u');
        tc.add('n');
        tc.add('e');
        tc.add('p');
        tc.add('l');
        tc.add('o');
        tc.add('s');
        char[] objCharArrayNotHidden = {'a', 'c', 'u', 'n', 'e'};
        char[] lecturaChar = {'e', 'l', 'l', 'o', 's'};
        char[] objCharArray = {'_', '_', '_', '_', '_'};
        
        char[] result = comparador.comparacion(objCharArrayNotHidden, lecturaChar, objCharArray, tc);
        
        assertArrayEquals(new char[]{'*', '_', '_', '_', '_'}, result);
        assertEquals(5, result.length);
    }
}
