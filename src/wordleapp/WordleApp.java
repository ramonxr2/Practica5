package wordleapp;
import wordleapp.Interfaces.Teclado;
import java.util.Scanner;
import java.util.ArrayList;
import wordleapp.Interfaces.Tablero;

public class WordleApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WordleApp wordle=new WordleApp();
        wordle.jugar();
    }
    
    public void jugar(){
    // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        Comparador comp=new Comparador();
        Teclado tec=new Teclado();
        Tablero tab=new Tablero();
        int tries=6;
        int cont=0;
        char[] lecturaChar;
        ArrayList<char[]> intentos = new ArrayList<>();
        boolean existe, haGanado=false;
        String lectura;
        BancoPalabras banco=new BancoPalabras();
        TurnToString st=new TurnToString();
        String objetivo;
        //inicializa el banco de palabras:
        banco.inicializarBanco();
        objetivo=banco.generarObjetivo();
        //solo para probar
        //solo para probar
       //System.out.println("Objetivo antes de esconderse: "+objetivo);
        char[] objCharArray=objetivo.toCharArray();
        tab.generarTablero();
        //se imprime el tablero
        
        tab.imprimirTableros();
        tec.imprimirReglas();
        tec.generarTeclado();
        tec.imprimirTeclado();
        
        do{
            //clear screen
            do{
              
           
            System.out.println("\nIngrese su intento numero: "+(cont+1));
            //tec.imprimirTeclado();
            lectura=teclado.nextLine();
            lectura=lectura.toLowerCase();
            lecturaChar=lectura.toCharArray();
            
            if(lecturaChar.length!=5){
                System.out.println("Ingrese palabra de 5 letras!!!");
            }
            
            //verificar que la palabra exista
            existe=banco.existeLaPalabra(lectura);
            if(lecturaChar.length==5 && existe==false){
                System.out.println("La palabra no existe!!!");
            }
            }while(lecturaChar.length!=5 || existe==false);
            //una vez leido comparar // editar teclado y tablero
            
            intentos.add(comp.comparacion2(lecturaChar, objCharArray));
            objCharArray=objetivo.toCharArray();
            String resultado=new String(intentos.get(cont));
            System.out.println("Resultado del intento: "+resultado);
            System.out.println("                       "+lectura);
            //modificar el tablero y el teclado y volver a imprimir
            tab.setIntento(intentos.get(cont), cont);
            tec.editarTeclado(intentos.get(cont), lecturaChar);
            //imprimir teclado
            tab.imprimirTableros();
            tec.imprimirTeclado();
            
            if(lectura.equals(objetivo)){
                System.out.println("\nPalabra adivinada!!");
                cont=tries;
                haGanado=true;
            }
            
            cont++;
        }while(cont<tries);
        if(cont>=tries && haGanado==false){
        System.out.println("Haz fallado.");
            System.out.println("Palabra correcta: "+objetivo);
        }
        
    
    }
}
