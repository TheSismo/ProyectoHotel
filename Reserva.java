package ProyectoHotel;

import java.util.Scanner;

public class Reserva {
    int StartDate;
    int EndDate;
    String Cliene;
    int Habitacion;
    int PrecioDeLaSuite = 275;
    int PrecioDeLaHabitacionDoble = 60;
    int IndividualRoom = 128;
    
    public static void main() {

        Scanner sc = new Scanner(System.in);
    
        System.out.println("¿Que quieres hace?");
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
    
        int eleccion = sc.nextInt();
        if(eleccion == 1) {
            System.out.println("El precio es ");
        }
    }

    public static int calcularPrecio(Booking booking) {
        int precio;


        return precio;
    }
}