public class cronometroCosmico {

    private static final double HORAS_POR_DIA_PLANETA = 30.0;
    private static final double DIAS_POR_AÑO_PLANETA = 500.0;
    private static final double HORAS_POR_DIA_TIERRA = 24.0;
    private static final double DIAS_POR_AÑO_TIERRA = 365.25;

    public static void convertirTiempo(double horas, boolean aPlaneta) {
        if (aPlaneta) {
            // Conversión a tiempo del nuevo planeta
            double dias = horas / HORAS_POR_DIA_PLANETA;
            double anos = dias / DIAS_POR_AÑO_PLANETA;
            System.out.printf("En el nuevo planeta: %.2f días, %.2f años%n", dias, anos);
        } else {
            // Conversión a tiempo de la Tierra
            double dias = horas / HORAS_POR_DIA_TIERRA;
            double anos = dias / DIAS_POR_AÑO_TIERRA;
            System.out.printf("En la Tierra: %.2f días, %.2f años%n", dias, anos);
        }
    }

