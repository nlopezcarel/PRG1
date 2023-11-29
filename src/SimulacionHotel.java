import  java.util.Random;

public class SimulacionHotel {

    public static void main(String[] args) {

        Random random = new Random();

        final int dias = 7;
        final int horas = 24;
        final int pisos = 7;
        final int habitacionesxpiso = 6;
        final double probabilidadPA = 0.7;
        final double probabilidadLE = 0.6;

        for (int semana = 1; semana <= 7; semana++){
        for (int dia = 1; dia <= dias; dia++){
            System.out.println("Día "+dia);

            for(int hora = 1; hora <= horas; hora++){
                System.out.println("Hora "+hora+":00h");

                for (int piso = 1; piso <= pisos; piso++){
                for (int habitacion = 1; habitacion <= habitacionesxpiso; habitacion++){
                    boolean persianaAbierta = random.nextDouble() < probabilidadPA;
                    boolean luzEncendida = random.nextDouble() < probabilidadLE;

                    if (persianaAbierta) {
                        System.out.println("[]");
                    }else {
                        System.out.print(luzEncendida? ":[*]:" : ":[º]:");
                    }
                }
            System.out.println("-P"+(pisos-piso));
                }

        System.out.println("------------------------------------");  

            }
        }
        }
    }
}
