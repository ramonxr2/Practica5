package wordleapp.InterfazGrafica;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import wordleapp.ScribbleImports.Canvas;

public class TableroHolografico implements ITablero {
    
    private ArrayList<Character>[] intentos; // arreglo de arraylist de intentos
    private ArrayList<Character>[] lecturas;
    private ArrayList<Integer>[] estadoIntentos;
    private Canvas canvas;
    private final int width=40;
    private final Font font;
    private int[] intentoState;
    private final int height=40;
    
    public TableroHolografico() {
        font=new Font("Arial", Font.PLAIN,12);    
        intentos = new ArrayList[6]; // inicializa los 6 arraylist
        estadoIntentos=new ArrayList[6];
        lecturas=new ArrayList[6];
        
        for (int i = 0; i < intentos.length; i++) {
            intentos[i] = new ArrayList<>();
            estadoIntentos[i]=new ArrayList<>();
            lecturas[i]=new ArrayList<>();
        }
        
    }
    
    @Override
    public void generarTablero() {
        
        for (int i = 0; i < 6; i++) {
            for(int j=0;j<5;j++){
            intentos[i].add(' ');
            lecturas[i].add(' ');
            if( null!=intentos[i].get(j))switch (intentos[i].get(j)) {
                    case ' ' -> estadoIntentos[i].add(4);
                    case 'X' -> estadoIntentos[i].add(3);
                    case '*' -> estadoIntentos[i].add(2);
                    case '=' -> estadoIntentos[i].add(1);
                    default -> {
                }
                }
            }
        }
    }
    
    @Override
     public void setIntento(char[] intento, int index, char[] lectura, int[] intentoState) {
        ArrayList<Character> intentoAl = new ArrayList<>();
        ArrayList<Character> lecturaA1 = new ArrayList<>();
        ArrayList<Integer> estadoIntentosA1 = new ArrayList<>();
        for (char c : intento) {
        intentoAl.add(c);
        }
        for (char c : lectura) {
        lecturaA1.add(c);
        }
    for (int i = 0; i < intentoState.length; i++) {
            estadoIntentosA1.add(intentoState[i]);
}
        this.estadoIntentos[index] = estadoIntentosA1;
        this.lecturas[index] = lecturaA1;
        this.intentos[index] = intentoAl;
    }
    
    @Override
    public void imprimirTableros(Canvas canvas) {
        //esto sera lo que cambiara 
        int posX=125;
        int posY=25;
        int separacion=45;
        String s="s";
        for (int i=0;i<6;i++) {
            posX=125;
            for (int j = 0; j < 5; j++) {
                s=intentos[j].get(j)+"";
                int est=estadoIntentos[i].get(j);
                switch (est) {
                case 1 -> canvas.drawKey(posX,posY,width,height,Color.GREEN,lecturas[i].get(j).toString());
                case 2 -> canvas.drawKey(posX,posY,width,height,Color.YELLOW,lecturas[i].get(j).toString());
                case 3 -> canvas.drawKey(posX,posY,width,height,Color.GRAY,lecturas[i].get(j).toString());
                case 4 -> canvas.drawKey(posX,posY,width,height,Color.WHITE,lecturas[i].get(j).toString());
            }
                posX=posX+separacion;
            }
                            posY=posY+height+5;

        }
    }
    
}
