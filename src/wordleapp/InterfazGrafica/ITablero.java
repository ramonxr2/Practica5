package wordleapp.InterfazGrafica;

import wordleapp.ScribbleImports.Canvas;

public interface ITablero {
    
    public void generarTablero();
    
    public void setIntento(char[] intento, int index, char[] lectura, int[] intentoState);
    
    public void imprimirTableros(Canvas canvas);
    
}
