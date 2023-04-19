package wordleapp;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BancoPalabrasTest {
    
    private BancoPalabras banco;
    
    @Before
    public void setUp() {
        banco = new BancoPalabras();
        banco.inicializarBanco();
    }
    
    @Test
    public void testGenerarObjetivo() {
        String objetivo = banco.generarObjetivo();
        assertNotNull(objetivo);
        assertEquals(5, objetivo.length());
    }
    
    @Test
    public void testExisteLaPalabra() {
            assertTrue(banco.existeLaPalabra("actas"));
        assertFalse(banco.existeLaPalabra("hello"));
    }

}
