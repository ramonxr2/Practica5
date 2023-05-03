package wordleapp.InterfazGrafica;

import wordleapp.ScribbleImports.Canvas;


public interface ITeclado {
    public void generarTeclado();
    public void editarTeclado(char[] intento, char[] lecturaChar,int[] intentoState);
    public void imprimirReglas();
    public void imprimirTeclado();
    public Canvas getCanvas();

}
