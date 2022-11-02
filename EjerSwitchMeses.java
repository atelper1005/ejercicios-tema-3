public class EjerSwitchMeses {
    //Dado un mes en una variable enumerada, mostrar por pantalla cuantos días tiene
    public enum Mes {
        ENERO, FEBRERO, MARZO, ABRIL, MAYO, JUNIO, JULIO, AGOSTO, SEPTIEMBRE, OCTUBRE, NOVIEMBRE, DICIEMBRE
    }
    public static void main(String[] args){

        Mes mesDeHoy = Mes.ENERO;

        switch (mesDeHoy) {
            case ENERO: System.out.println("31 días");
            break;

            case FEBRERO: System.out.println("28 días");
            break;

            case MARZO: System.out.println("30 días");
            break;

            case ABRIL: System.out.println("31 días");
            break;

            case MAYO: System.out.println("30 días");
            break;

            case JUNIO: System.out.println("31 días");
            break;

            case JULIO: System.out.println("30 días");
            break;

            case AGOSTO: System.out.println("31 días");
            break;

            case SEPTIEMBRE: System.out.println("30 días");
            break;

            case OCTUBRE: System.out.println("31 días");
            break;

            case NOVIEMBRE: System.out.println("30 días");
            break;

            case DICIEMBRE: System.out.println("31 días");
            break;

            default: System.out.println("No hay más meses en el año");
        }
    }
}
