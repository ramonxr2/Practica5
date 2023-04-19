package wordleapp;


public class TurnToString {
    private String stringWord;
    private char[] objCharArray;
    
    public String objString(char[] objCharArray){
        this.objCharArray=objCharArray;
        stringWord=String.valueOf(objCharArray);
        
        return stringWord;
    }
}
