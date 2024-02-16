package ProyectoHotel;

import java.util.Scanner;

public class Reserva {
    int StartDate;
    int EndDate;
    String Cliente;
    int Habitacion;
    int PrecioDeLaSuite = 275;
    int PrecioDeLaHabitacionDoble = 60;
    int IndividualRoom = 128;
    
    public static void main() {
        {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("¿Que habitacion quieres alquilar?");
        System.out.println("Una Suite");
        System.out.println("2");
        System.out.println("3");
    
        int eleccion = sc.nextInt();
        if(eleccion == 1) {
            System.out.println("¿Cual es el periodo de tiempo en el que quieres reservar la Suite?");
        }
    }
 }

    public static int calcularPrecioDeLaSuite(int PrecioDeLaSuite) {
        System.out.println("El precio es: "); {
            System.out.println(PrecioDeLaSuite * eleccion);
        }

        return precio;
    }
}