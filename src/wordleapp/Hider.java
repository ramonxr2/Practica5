package wordleapp;

public class Hider {
    private boolean[] isHidden=new boolean[5];
    private char[] objCharArray;
    private char[] hiddenArray;
    public Hider(){
        for(int i=0;i<5;i++){
        isHidden[i]=false;
        }
    }
    
    public char[] hideArray(char[] objCharArray){
        this.objCharArray=objCharArray;
        hiddenArray=new char[objCharArray.length];
        for(int i=0;i<objCharArray.length;i++){
        hiddenArray[i]='_';
        }
        
        return hiddenArray;
    }
    
}
