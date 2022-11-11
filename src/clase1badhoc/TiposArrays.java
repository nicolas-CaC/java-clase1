package clase1badhoc;

public class TiposArrays {

    public String[] arrayString = new String[2];
    public int[] arrayNumero = {0,1,22,333,4};
    public boolean[] arrayBooleano = {true, false};
    public byte[] arrayByte = {1,11,111,127};
    public String[][] matriz = new String[2][2];
    
    public TiposArrays(){
    arrayString[0] = "Soy la posicion 0";
    arrayString[1] = "Soy la posicion 1";
    
    matriz[0][0] = "fila 0 columna 0";
    matriz[0][1] = "fila 0 columna 1";
    matriz[1][0] = "fila 1 columna 0";
    matriz[1][1] = "fila 1 columna 1";
    }
}
