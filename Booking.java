package ProyectoHotel;

import java.util.Scanner;

public class Booking {
    int StartDate;
    int EndDate;
    String Guest;
    Room room;
    int SuitePrice = 275;
    int StandardRoom = 60;

    int IndividualRoom = 128;
    
    public static void main() {

        Scanner sc = new Scanner(System.in);
    
        System.out.println("¿Que quieres hace?");
        System.out.println("1 - Book one Suite");
        System.out.println("2 - Book one Standart Room");
        System.out.println("3 - Book one Individual Room");
    
        int eleccion = sc.nextInt();
        if(eleccion == 1) {
            System.out.println("This is the price");
        }
    }

    public static int calcularPrecio(Booking booking) {
        int precio;


        return precio;
    }
}