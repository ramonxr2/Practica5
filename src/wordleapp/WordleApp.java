package wordleapp;
import java.util.Scanner;
import java.util.ArrayList;

public class WordleApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        Comparador comp=new Comparador();
        Teclado tec=new Teclado();
        int tries=6;
        int cont=0;
        char[] lecturaChar;
        boolean existe, haGanado=false;
        String lectura;
        BancoPalabras banco=new BancoPalabras();
        Hider hider=new Hider();
        TurnToString st=new TurnToString();
        String objetivo;
        //inicializa el banco de palabras:
        banco.inicializarBanco();
        objetivo=banco.generarObjetivo();
        //solo para probar
        System.out.println("Objetivo antes de esconderse: "+objetivo);
        String objetivoNotHidden=objetivo;
        char[] objCharArray =objetivo.toCharArray();
        objCharArray=hider.hideArray(objCharArray);
        objetivo=st.objString(objCharArray);
        System.out.println("La palabra a encontrar es: "+objetivo);
        tec.generarTeclado();
        //tec.imprimirTeclado();
        ArrayList<Character> tc=tec.getTeclado();
        ArrayList<Character> tcReset=tc;
        do{
            tc=tcReset;
            //hacer modificaciones de teclado // hacer arraylist de teclado 
            do{
            System.out.println("\nIngrese su intento numero: "+(cont+1));
            tec.imprimirTeclado();
            lectura=teclado.nextLine();
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
            //una vez leido comparar // editar teclado
            char[] objCharArrayNotHidden=objetivoNotHidden.toCharArray();
            objCharArray=comp.comparacion(objCharArrayNotHidden, lecturaChar, objCharArray, tc);
            tc=comp.getTecladoMod();
            String resultado=new String(objCharArray);
            System.out.println("Resultado del intento: "+resultado);
            if(resultado.equals(objetivoNotHidden)){
                System.out.println("Palabra adivinada!!");
                cont=tries;
                haGanado=true;
            }
            cont++;
        }while(cont<tries);
        if(cont>=tries && haGanado==false){
        System.out.println("Haz fallado.");
            System.out.println("Palabra correcta: "+objetivoNotHidden);
        }
        
    }
    
}
