public class EjemploString {
    public static void main(String[] args){
        //Crear una variable String
        String s = "Fran";
        String apellido = "Gómez";
        int edad = 18;

        //Imprimir el valor de la variable
        System.out.println("Hola " + s);
        
        //Imprimir con formato
        System.out.printf("Hola %s %s, tengo: %d años", s, apellido, edad);
    }
}
