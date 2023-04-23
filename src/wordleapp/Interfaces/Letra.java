package wordleapp.Interfaces;


public class Letra {
    private char letra;
    private boolean existsInWord;
    private boolean isCorrect;
    private boolean isMisplaced;
    
    public Letra(char letra, boolean existsInWord, boolean isCorrect, boolean isMisplaced){
    this.letra=letra;
    this.existsInWord=existsInWord;
    this.isCorrect=isCorrect;
    this.isMisplaced=isMisplaced;
    }
    
    public void setEstado(){
    
        if(existsInWord==false){
        letra='X';
        }
        else 
            if(isCorrect==true){
            letra='=';
            }
            else if(isMisplaced==true){
            letra='*';
            }
        
    }
    
    public void setLetra(char letra){
    this.letra=letra;
    }
    
    public char getLetra(){
    
        return letra;
    }
    
    public String letraToString(){
    setEstado();
    return letra+"";
    }

    public boolean isExistsInWord() {
        return existsInWord;
    }

    public void setExistsInWord(boolean existsInWord) {
        this.existsInWord = existsInWord;
    }

    public boolean isIsCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean isCorrect) {
        this.isCorrect = isCorrect;
    }

    public boolean isIsMisplaced() {
        return isMisplaced;
    }

    public void setMisplaced(boolean isMisplaced) {
        this.isMisplaced = isMisplaced;
    }
    
    
    
}
