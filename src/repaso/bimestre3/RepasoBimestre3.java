
package repaso.bimestre3;

public class RepasoBimestre3 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        
        int notas[][] = {{10, 20 , 30},
                {40, 50, 60},
                {70, 80, 90}};
        
        
        System.out.println("la diagonalprincipal es " + diagonalPrincipal(notas));
    }
    
    public static String diagonalPrincipal(int matriz [][]){
    
        String resultado = "";
        for (int R = 0; R < matriz.length; R++) {
            resultado = resultado + String.valueOf(matriz[R][R]) + " -> ";
            
            
        }
        
        return resultado;
}
    
}
