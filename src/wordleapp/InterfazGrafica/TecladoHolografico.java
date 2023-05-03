package wordleapp.InterfazGrafica;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import wordleapp.Interfaces.Letra;
import wordleapp.ScribbleImports.Canvas;
// GFX
//
public class TecladoHolografico implements ITeclado{

    private ArrayList<Letra> tecladoA;
    private ArrayList<Letra> tecladoB;
    private ArrayList<Letra> tecladoC;
    private final Font font;
    private final Canvas canvas;
    private final int height=40;
    private final int width=40;
    private int[] intentoState;
    private int estado;
    private char[] intento;
    private char[] objetivo;

    public TecladoHolografico(){
    font=new Font("Arial", Font.PLAIN,12);    
    canvas=new Canvas("Canvas",650,500);
    canvas.setFont(font);
    tecladoA=new ArrayList();
    tecladoB=new ArrayList();
    tecladoC=new ArrayList();
    
    }
    
    @Override
    public void generarTeclado(){
        //hacer clase letra para modificar
        //a
        tecladoA.add(new Letra('q',4));
        tecladoA.add(new Letra('w',4));
        tecladoA.add(new Letra('e',4));
        tecladoA.add(new Letra('r',4));
        tecladoA.add(new Letra('t',4));
        tecladoA.add(new Letra('y',4));
        tecladoA.add(new Letra('u',4));
        tecladoA.add(new Letra('i',4));
        tecladoA.add(new Letra('o',4));
        tecladoA.add(new Letra('p',4));

        //b
        tecladoB.add(new Letra('a',4));
        tecladoB.add(new Letra('s',4));
        tecladoB.add(new Letra('d',4));
        tecladoB.add(new Letra('f',4));
        tecladoB.add(new Letra('g',4));
        tecladoB.add(new Letra('h',4));
        tecladoB.add(new Letra('j',4));
        tecladoB.add(new Letra('k',4));
        tecladoB.add(new Letra('l',4));
        tecladoB.add(new Letra('ñ',4));

        //c
        tecladoC.add(new Letra('z',4));
        tecladoC.add(new Letra('x',4));
        tecladoC.add(new Letra('c',4));
        tecladoC.add(new Letra('v',4));
        tecladoC.add(new Letra('b',4));
        tecladoC.add(new Letra('n',4));
        tecladoC.add(new Letra('m',4));

    }
    
   
    
    //metodo para modificar el teclado
    @Override
    public void editarTeclado(char[] intento, char[] lecturaChar, int[] intentoState) {
    this.intento = intento;
    this.objetivo=lecturaChar;

    //get index of letters to modificar
    //for a
  for (int i = 0; i < objetivo.length; i++) {
        for (int j = 0; j < tecladoA.size(); j++) {
            if (lecturaChar[i] == tecladoA.get(j).getLetra()) {
                switch (intentoState[i]) {
                    case 1:
                        Letra l1 = new Letra(objetivo[i], 1);
                        tecladoA.set(j, l1);
                        break;
                    case 2:
                        Letra l2 = new Letra(objetivo[i], 2);
                        tecladoA.set(j, l2);
                        break;
                    case 3:
                        Letra l3 = new Letra(objetivo[i], 3);
                        tecladoA.set(j, l3);
                        break;
                    case 4:
                        Letra l4 = new Letra(objetivo[i], 4);
                        tecladoA.set(j, l4);
                        break;
                }
            }
        }
    }
    // for b
    for (int i = 0; i < objetivo.length; i++) {
        for (int j = 0; j < tecladoB.size(); j++) {
            if (lecturaChar[i] == tecladoB.get(j).getLetra()) {
                switch (intentoState[i]) {
                    case 1 -> {
                        estado = 1;
                        Letra l = new Letra(objetivo[i], 1);
                        tecladoB.set(j, l);
                    }
                    case 2 -> {
                        estado = 2;
                        Letra l = new Letra(objetivo[i], 2);
                        tecladoB.set(j, l);
                    }
                    case 3 -> {
                        estado = 3;
                        Letra l = new Letra(objetivo[i], 3);
                        tecladoB.set(j, l);
                    }
                    case 4 -> {
                        estado = 4;
                        Letra l = new Letra(objetivo[i], 4);
                        tecladoB.set(j, l);
                    }
                }
            }
        }
    }
            //FOR c
    for (int i = 0; i < objetivo.length; i++) {
        for (int j = 0; j < tecladoC.size(); j++) {
            if (lecturaChar[i] == tecladoC.get(j).getLetra()) {
                switch (intentoState[i]) {
                    case 1 -> {
                        estado = 1;
                        Letra l = new Letra(objetivo[i], 1);
                        tecladoC.set(j, l);
                    }
                    case 2 -> {
                        estado = 2;
                        Letra l = new Letra(objetivo[i], 2);
                        tecladoC.set(j, l);
                    }
                    case 3 -> {
                        estado = 3;
                        Letra l = new Letra(objetivo[i], 3);
                        tecladoC.set(j, l);
                    }
                    case 4 -> {
                        estado = 4;
                        Letra l = new Letra(objetivo[i], 4);
                        tecladoC.set(j, l);
                    }
                }
            }
        }
    }
    }
    
    //mmodificarlas 
    
 
    //
    
    @Override
    public void imprimirReglas(){
    JFrame frame = new JFrame("Reglas");
    JOptionPane.showMessageDialog(frame, "AMARILLO - La letra esta en el lugar incorrecto.");
    JOptionPane.showMessageDialog(frame, "GRIS - La letra no existe en la palabra.");
    JOptionPane.showMessageDialog(frame, "VERDE - La letra esta en el lugar correcto.");
    
    }
    
    @Override
    public void imprimirTeclado(){
        int posX=30;
        int posY=300;
        int separation=60;
        for (int i=0;i<tecladoA.size();i++){
            int est=tecladoA.get(i).getEstado();
            switch (est) {
                case 1 -> canvas.drawKey(posX,posY,width,height,Color.GREEN,tecladoA.get(i).toString());
                case 2 -> canvas.drawKey(posX,posY,width,height,Color.YELLOW,tecladoA.get(i).toString());
                case 3 -> canvas.drawKey(posX,posY,width,height,Color.GRAY,tecladoA.get(i).toString());
                case 4 -> canvas.drawKey(posX,posY,width,height,Color.WHITE,tecladoA.get(i).toString());
            }
           
            posX=posX+separation;
        }
        posX=30;
        posY=350;
        for (int i=0;i<tecladoB.size();i++){

            int est=tecladoB.get(i).getEstado();
            switch (est) {
                case 1 -> canvas.drawKey(posX,posY,width,height,Color.GREEN,tecladoB.get(i).toString());
                case 2 -> canvas.drawKey(posX,posY,width,height,Color.YELLOW,tecladoB.get(i).toString());
                case 3 -> canvas.drawKey(posX,posY,width,height,Color.GRAY,tecladoB.get(i).toString());
                case 4 -> canvas.drawKey(posX,posY,width,height,Color.WHITE,tecladoB.get(i).toString());
            }
                posX=posX+separation;

        }
        posX=30;
        posY=400;
        for (int i=0;i<tecladoC.size();i++){
            int est=tecladoC.get(i).getEstado();
            switch (est) {
                case 1 -> canvas.drawKey(posX,posY,width,height,Color.GREEN,tecladoC.get(i).toString());
                case 2 -> canvas.drawKey(posX,posY,width,height,Color.YELLOW,tecladoC.get(i).toString());
                case 3 -> canvas.drawKey(posX,posY,width,height,Color.GRAY,tecladoC.get(i).toString());
                case 4 -> canvas.drawKey(posX,posY,width,height,Color.WHITE,tecladoC.get(i).toString());
            }
                posX=posX+separation;

        }
    }
    
    @Override
    public Canvas getCanvas(){
    return canvas;
    }
    
 }

