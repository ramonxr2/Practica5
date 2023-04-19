package wordleapp;

import java.util.ArrayList;
public class Comparador {
    private char[] objCharArrayNotHidden;
    private char[] objCharArray;
    private char[] lecturaChar;
    private ArrayList<Character> tc;
    public char[] comparacion(char[] objCharArrayNotHidden, char[] lecturaChar,char[] objCharArray, ArrayList<Character> tc){
        
        for (int i = 0; i < objCharArrayNotHidden.length && i < lecturaChar.length; i++) {
            if(lecturaChar[i]==objCharArrayNotHidden[i]){
            objCharArray[i]=lecturaChar[i];
            
            if(tc.contains(objCharArray[i])){
            int index=tc.indexOf(objCharArray[i]);
            tc.remove(index);
            }
            
            }else{
            objCharArray[i]='_';
            }
        }
            // checar posibles 
            for(int i=0;i<objCharArrayNotHidden.length;i++){
                
                for(int j=0;j<objCharArrayNotHidden.length;j++){
                if(lecturaChar[i]==objCharArrayNotHidden[j]){
                    //System.out.println("Comparando "+lecturaChar[i]+" y "+objCharArrayNotHidden[j]);
                    if(objCharArray[i]=='_'){
                        objCharArray[i]='*';
                    }
                    }
                }
                
                }
                
            
        
        return objCharArray;
    }
    
    public ArrayList<Character> getTecladoMod(){
    return tc;
    }
    
}

