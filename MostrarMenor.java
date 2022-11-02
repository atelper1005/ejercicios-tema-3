public class MostrarMenor {
    
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int mayor;
        int menor;
        
        if (a>=b){
            mayor = a;
        } else {
            mayor = b;
        } 
        mayor = (a>=b) ? a:b; 
        System.out.println("El mayor es " + mayor);
        
        if (a<=b){
            menor = a;
        } else {
            menor = b;
        } 
        menor = (a<=b) ? a:b; 
        System.out.println("El menor es " + menor);
    }
}
