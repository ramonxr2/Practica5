package wordleapp.Interfaces;


public class Letra {
    private char letra;
    private int estado;
    private String color;
    
    public Letra(char letra, int estado){
    this.letra=letra;
    this.estado=estado;
    }
    
    public void setEstado(){
    
        switch (estado) {
            case 3 -> color="GRAY";
            case 1 -> color="GREEN";
            case 2 -> color="YELLOW";
            case 4 -> color="WHITE";
            default -> {
            }
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

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString(){
    return letra+"";
    }
    
    
}
