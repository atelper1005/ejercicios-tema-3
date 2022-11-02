public class EjercicioConstante {
    
    public static void main(String[] args) {
        //Declarar x, y
        int x = 1;
        int y = 2;
        //Crear bloque donde se imprima x
        {
            System.out.println(x);
            //Variable z
            int z = 3;
            //bloque dentro
            {
                //imprimir z
                System.out.println(z);
                //imprimir x
                System.out.println(x);
                //imprimir y
                System.out.println(y);

            }
        }
        //Crear bloque donde se imprima y
        {
        System.out.println(y);
        }
    } 
}