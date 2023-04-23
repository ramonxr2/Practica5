package wordleapp.Interfaces;
import java.util.ArrayList;

public class Teclado {
      
    private ArrayList<Letra> tecladoA;
    private ArrayList<Letra> tecladoB;
    private ArrayList<Letra> tecladoC;
    private boolean existsInWord;
    private boolean isCorrect;
    private boolean isMisplaced;
    private char[] intento;
    private char[] objetivo;
    public Teclado(){
    tecladoA=new ArrayList();
    tecladoB=new ArrayList();
    tecladoC=new ArrayList();
    }
    
    public void generarTeclado(){
        //hacer clase letra para modificar
        //a
        tecladoA.add(new Letra('q',true,false,false));
        tecladoA.add(new Letra('w',true,false,false));
        tecladoA.add(new Letra('e',true,false,false));
        tecladoA.add(new Letra('r',true,false,false));
        tecladoA.add(new Letra('t',true,false,false));
        tecladoA.add(new Letra('y',true,false,false));
        tecladoA.add(new Letra('u',true,false,false));
        tecladoA.add(new Letra('i',true,false,false));
        tecladoA.add(new Letra('o',true,false,false));
        tecladoA.add(new Letra('p',true,false,false));

        //b
        tecladoB.add(new Letra('a',true,false,false));
        tecladoB.add(new Letra('s',true,false,false));
        tecladoB.add(new Letra('d',true,false,false));
        tecladoB.add(new Letra('f',true,false,false));
        tecladoB.add(new Letra('g',true,false,false));
        tecladoB.add(new Letra('h',true,false,false));
        tecladoB.add(new Letra('j',true,false,false));
        tecladoB.add(new Letra('k',true,false,false));
        tecladoB.add(new Letra('l',true,false,false));
        tecladoB.add(new Letra('ñ',true,false,false));

        //c
        tecladoC.add(new Letra('z',true,false,false));
        tecladoC.add(new Letra('x',true,false,false));
        tecladoC.add(new Letra('c',true,false,false));
        tecladoC.add(new Letra('v',true,false,false));
        tecladoC.add(new Letra('b',true,false,false));
        tecladoC.add(new Letra('n',true,false,false));
        tecladoC.add(new Letra('m',true,false,false));

    }
    
    //metodo para modificar el teclado
    public void editarTeclado(char[] intento, char[] lecturaChar) {
    this.intento = intento;
    this.objetivo=lecturaChar;

    
    
    //get index of letters to modificar
    //for a
    for(int i=0;i<objetivo.length;i++){
        for(int j=0;j<tecladoA.size();j++){

            if(objetivo[i]==tecladoA.get(j).getLetra()){

        switch (intento[i]) {
            case 'X' -> {
                existsInWord=false;
                isCorrect=false;
                isMisplaced=false;
                Letra l=new Letra(objetivo[i],existsInWord,isCorrect,isMisplaced);
                tecladoA.set(j, l);
            }
            case '*' -> {
                isMisplaced=true;
                existsInWord=true;
                isCorrect=false;
                Letra l=new Letra(objetivo[i],existsInWord,isCorrect,isMisplaced);
                tecladoA.set(j, l);
            }
            case '=' -> {
                isCorrect=true;
                isMisplaced=false;
                existsInWord=true;
                Letra l=new Letra(objetivo[i],existsInWord,isCorrect,isMisplaced);
                tecladoA.set(j, l);
            }
        }
        
    }
        }
    }
    //for b
 for(int i=0;i<objetivo.length;i++){
        for(int j=0;j<tecladoB.size();j++){

            if(objetivo[i]==tecladoB.get(j).getLetra()){
  
        switch (intento[i]) {
            case 'X' -> {
                existsInWord=false;
                isCorrect=false;
                isMisplaced=false;
                Letra l=new Letra(objetivo[i],existsInWord,isCorrect,isMisplaced);
                tecladoB.set(j, l);
            }
            case '*' -> {
                isMisplaced=true;
                existsInWord=true;
                isCorrect=false;
                Letra l=new Letra(objetivo[i],existsInWord,isCorrect,isMisplaced);
                tecladoB.set(j, l);
            }
            case '=' -> {
                isCorrect=true;
                isMisplaced=false;
                existsInWord=true;
                Letra l=new Letra(objetivo[i],existsInWord,isCorrect,isMisplaced);
                tecladoB.set(j, l);
            }
        }
        
    }
        }
    }
    //FOR c
    for(int i=0;i<objetivo.length;i++){
        for(int j=0;j<tecladoC.size();j++){

            if(objetivo[i]==tecladoC.get(j).getLetra()){
 
        switch (intento[i]) {
            case 'X' -> {
                existsInWord=false;
                isCorrect=false;
                isMisplaced=false;
                 Letra l=new Letra(objetivo[i],existsInWord,isCorrect,isMisplaced);
                 tecladoC.set(j, l);
            }
            case '*' -> {
                isMisplaced=true;
                existsInWord=true;
                isCorrect=false;
                 Letra l=new Letra(objetivo[i],existsInWord,isCorrect,isMisplaced);
                 tecladoC.set(j, l);
            }
            case '=' -> {
                isCorrect=true;
                isMisplaced=false;
                existsInWord=true;
                 Letra l=new Letra(objetivo[i],existsInWord,isCorrect,isMisplaced);
                 tecladoC.set(j, l);
            }
        }
       
    }
        }
    }
    //mmodificarlas 
}
    //
    
    public void imprimirReglas(){
    System.out.println("* - La letra esta en el lugar incorrecto.");
    System.out.println("X - La letra no existe en la palabra.");
    System.out.println("= - La letra esta en el lugar correcto.");

    
    }
    
    public void imprimirTeclado(){
        
        for (int i=0;i<tecladoA.size();i++){
            System.out.print(" ["+tecladoA.get(i).letraToString()+"]");
        }
        System.out.println("");
        for (int i=0;i<tecladoB.size();i++){
            System.out.print(" ["+tecladoB.get(i).letraToString()+"]");
        }
        System.out.println("");
        for (int i=0;i<tecladoC.size();i++){
            System.out.print(" ["+tecladoC.get(i).letraToString()+"]");
        }
    }
        
}
