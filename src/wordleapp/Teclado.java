package wordleapp;
import java.util.ArrayList;

public class Teclado {
      
    private ArrayList<Character> teclado;
    
    public Teclado(){
    teclado=new ArrayList();
    }
    
    public void generarTeclado(){
        teclado.add('q');
        teclado.add('w');
        teclado.add('e');
        teclado.add('r');
        teclado.add('t');
        teclado.add('y');
        teclado.add('u');
        teclado.add('i');
        teclado.add('o');
        teclado.add('p');
        teclado.add('a');
        teclado.add('s');
        teclado.add('d');
        teclado.add('f');
        teclado.add('g');
        teclado.add('h');
        teclado.add('j');
        teclado.add('k');
        teclado.add('l');
        teclado.add('z');
        teclado.add('x');
        teclado.add('c');
        teclado.add('v');
        teclado.add('b');
       teclado.add('n');
       teclado.add('m');
    }
    
    public void setTeclado(ArrayList<Character> teclado){
    this.teclado=teclado;
    }
    
    public ArrayList<Character> getTeclado(){
    return teclado;
    }
    
    public void imprimirTeclado(){
        System.out.println("* - La letra esta en el lugar incorrecto.");
        for(int i=0;i<teclado.size();i++){
        System.out.print(teclado.get(i)+" ");
        }
        System.out.println("");
    }
        
}
