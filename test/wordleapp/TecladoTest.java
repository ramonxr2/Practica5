package wordleapp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class TecladoTest {

    private Teclado teclado;

    @Before
    public void setUp() {
        teclado = new Teclado();
        teclado.generarTeclado();
    }

    @Test
    public void testGenerarTeclado() {
        assertNotNull(teclado.getTeclado());
        assertEquals(26, teclado.getTeclado().size());
    }

    @Test
    public void testSetTeclado() {
        ArrayList<Character> newTeclado = new ArrayList<>();
        newTeclado.add('a');
        newTeclado.add('b');
        newTeclado.add('c');
        teclado.setTeclado(newTeclado);
        assertEquals(newTeclado, teclado.getTeclado());
    }

    @Test
    public void testImprimirTeclado() {
        teclado.imprimirTeclado();
    }
}

