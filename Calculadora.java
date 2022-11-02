public class Calculadora {

    public static void main(String[] args) {
        Integer a, b, c;
        a = 2;
        b = 3;
        c = 4;
        Integer Res;
        Res = (a+b)*c;

        //Suma y multiplicación
        System.out.println(Res);
        System.out.println((a + b) * c);

        //Potencia
        Double Pot = Math.pow(a, b);
        System.out.println(Pot);

        //Máximo nº enteros
        final int MAX = Integer.MAX_VALUE;
            
        Double f =  2d;
        Double resultado = Math.max((double)f, MAX);
        
        System.out.println(MAX);
        System.out.println(resultado);
    
    }
}