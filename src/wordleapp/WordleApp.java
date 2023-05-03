package wordleapp;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import wordleapp.InterfazGrafica.ITablero;
import wordleapp.InterfazGrafica.ITeclado;
import wordleapp.InterfazGrafica.TableroHolografico;
import wordleapp.InterfazGrafica.TecladoHolografico;
import wordleapp.ScribbleImports.Canvas;
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
        ITeclado tec=new TecladoHolografico();
        ITablero tab=new TableroHolografico();
        LectorGrafico lector=new LectorGrafico();
        
        int intentoState[]=new int[5];
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
        char[] objCharArray=objetivo.toCharArray();
        tab.generarTablero();
        //se imprime el tablero
        
        tab.imprimirTableros(tec.getCanvas());
        tec.imprimirReglas();
        tec.generarTeclado();
        tec.imprimirTeclado();
        
        do{
            //clear screen
            do{
            
            lector.mensaje("\nIngrese su intento numero: "+(cont+1));
            //tec.imprimirTeclado();
            lectura=lector.lecturaPanel(tec.getCanvas());
            lectura=lectura.toLowerCase();
            lecturaChar=lectura.toCharArray();
            
            if(lecturaChar.length!=5){
                lector.mensaje("Ingrese palabra de 5 letras!!!");
            }
            
            //verificar que la palabra exista
            existe=banco.existeLaPalabra(lectura);
            if(lecturaChar.length==5 && existe==false){
                lector.mensaje("La palabra no existe!!!");
            }
            }while(lecturaChar.length!=5 || existe==false);
            //una vez leido comparar // editar teclado y tablero
            
            intentos.add(comp.comparacion2(lecturaChar, objCharArray));
            objCharArray=objetivo.toCharArray();
            String resultado=new String(intentos.get(cont));
            intentoState=comp.getCharState();
            //System.out.println(Arrays.toString(intentoState)); // OK si manda los estados, solo asegurar que se manden al teclado
            //poner un setEstados en ambos
            tec.imprimirTeclado();
            //modificar el tablero y el teclado y volver a imprimir // mandar el charState// determinara el color
            tab.setIntento(intentos.get(cont), cont,lecturaChar,intentoState);
            tec.editarTeclado(intentos.get(cont), lecturaChar, intentoState);
            //imprimir teclado
            tab.imprimirTableros(tec.getCanvas());
            tec.imprimirTeclado();
            
            if(lectura.equals(objetivo)){
                lector.mensaje("\nPalabra adivinada!!");
                cont=tries;
                haGanado=true;
            }
            
            cont++;
        }while(cont<tries);
        if(cont>=tries && haGanado==false){
        lector.mensaje("Haz fallado.");
        lector.mensaje("Palabra correcta: "+objetivo);
        }
        
    
    }
    
  
}
