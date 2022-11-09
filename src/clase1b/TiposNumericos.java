package clase1b;

public class TiposNumericos {

    int a, g;
    short b;
    long c;
    byte d;
    
    // Reales
    float e;
    double f;
    
    // Constantes = final
    final int h;
    final double i;
    
    public TiposNumericos(int numero){
        
        a = -2100000000;
        b = -32768;
        c = 4564564564564564564L;
        d = -128;

        e =  0.123456F;
        f =  0.123456789456;
        
        h = 1;
        i = 2.54;
        
        g = 100 * numero;

    }
    
}
