package wordleapp;

import java.util.Arrays;

public class Comparador {
    private char[] lecturaChar;
    private char[] objCharArray;
    private char[] intento;
    private int[] charState=new int[5];
    //modificar comparacion
    

    public static boolean contieneChar(char[] objCharArray, char c) {
    for (char element : objCharArray) {
        if (element == c) {
            return true;
        }
    }
    return false;
}
    public char[] comparacion2(char[] lecturaChar, char[] objCharArray){
        this.lecturaChar = lecturaChar;
        this.objCharArray = objCharArray;
        String objS=String.valueOf(objCharArray);
        intento=objS.toCharArray();
        
        for(int i=0;i<objCharArray.length;i++){
            if(lecturaChar[i]==objCharArray[i]){
                // el char coincide!
                intento[i] = '=';
                charState[i]=1;
            } else 
                if(contieneChar(objCharArray, lecturaChar[i])){
                    //el char esta pero en una posicion incorrecta!!
                                    intento[i] = '*';
                charState[i]=2;
            }
                else
                    {
                                    intento[i] = 'X'; //el char no esta!
                                    charState[i]=3;
                    }
            
        }
        return intento;
    }

    public int[] getCharState() {
        //System.out.println("CHAR STATE: "+Arrays.toString(charState));
        return charState;
        //regresa el estado de cada caracter
    }
    
    
}

