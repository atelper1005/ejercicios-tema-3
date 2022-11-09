public class EjerMultiplo5 {
    public static void main(String[] args) {
        for (int num1 = 5; num1 <=25; num1++) {
            if(num1 % 5 != 0)
            continue;

            System.out.println("Es un múltiplo de 5: " + num1);
        }
    }
}