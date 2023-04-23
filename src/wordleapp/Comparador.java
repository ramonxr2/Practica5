package wordleapp;

import java.util.Arrays;

public class Comparador {
    private char[] lecturaChar;
    private char[] objCharArray;
    private char[] intento;
    
    public char[] comparacion(char[] lecturaChar, char[] objCharArray) {
        this.lecturaChar = lecturaChar;
        this.objCharArray = objCharArray;
        
        for (int i = 0; i < lecturaChar.length; i++) {
            if (objCharArray[i] == lecturaChar[i]) {
                objCharArray[i] = '=';
            } else if (contieneChar(objCharArray, lecturaChar[i])) {
                objCharArray[i] = '*';
            } else {
                objCharArray[i] = 'X';
            }
        }
        
        intento = objCharArray;
        return intento;
    }

    public static boolean contieneChar(char[] objCharArray, char c) {
    for (char element : objCharArray) {
        if (element == c) {
            return true;
        }
    }
    return false;
}
}

