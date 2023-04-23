package wordleapp.Interfaces;

import java.util.ArrayList;

public class Tablero {
    private ArrayList<Character>[] intentos; // arreglo de arraylist de intentos
    
    public Tablero() {
        intentos = new ArrayList[6]; // inicializa los 6 arraylist
        for (int i = 0; i < intentos.length; i++) {
            intentos[i] = new ArrayList<>();
            
        }
    }
    
    public void generarTablero() {
        
        for (int i = 0; i < 6; i++) {
            for(int j=0;j<5;j++){
            intentos[i].add(' ');
            }
        }
    }
    
     public void setIntento(char[] intento, int index) {
        ArrayList<Character> intentoAl = new ArrayList<>();
        for (char c : intento) {
        intentoAl.add(c);
        }
        this.intentos[index] = intentoAl;
    }
    
    public void imprimirTableros() {
        for (ArrayList<Character> intento : intentos) {
            System.out.print("        ");
            for (int j = 0; j < 5; j++) {
                System.out.print("[" + intento.get(j) + "] ");
            }
            System.out.println();
        }
    }
    
 
}

