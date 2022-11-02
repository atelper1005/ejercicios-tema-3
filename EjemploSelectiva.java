public class EjemploSelectiva {
    
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
//int mayor;
        if (a>=b) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }

        String resultado = (a>=b)?"A":"B";
        System.out.println(resultado);

        //if (a>=b){mayor = a;} else {mayor = b;} mayor = (a>=b) ? a:b; System.out.println(mayor);
    }
    
}
