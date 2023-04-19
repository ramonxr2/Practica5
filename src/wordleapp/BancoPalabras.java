package wordleapp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class BancoPalabras {
    
     private ArrayList<String> bancoDePalabras;
     private String objetivo;
     private boolean existe;
     
     public BancoPalabras(){
     existe=false;
     }
     
    public void inicializarBanco(){
        bancoDePalabras=new ArrayList();
        
    try{
            File banco=new File("C:\\Users\\JRamR\\OneDrive\\Desktop\\4TO SEMESTRE\\poo\\practica5Wordle\\WordleApp\\src\\wordleapp\\Palabras5letras.txt");
            Scanner scanner=new Scanner(banco);
            while(scanner.hasNext()){
            String word=scanner.next();
            bancoDePalabras.add(word);
            }
            scanner.close();
        } catch(FileNotFoundException e){
        e.printStackTrace();
        }
    }
    
    public String generarObjetivo(){
        Random rand=new Random();
        int index=rand.nextInt(bancoDePalabras.size());
        objetivo=bancoDePalabras.get(index);
       return objetivo;
    }
    
    public boolean existeLaPalabra(String lectura){
        if(bancoDePalabras.contains(lectura)){
        existe=true;
        }else{
        existe=false;
        }
        return existe;
    }
    
}
